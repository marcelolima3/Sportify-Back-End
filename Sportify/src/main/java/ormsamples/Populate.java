package ormsamples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dinispeixoto
 */
import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.User;
import org.orm.*;

import java.math.BigDecimal;

public class Populate {

    public void createTestData() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            PaymentMethod paymentMethod = new InvoicePayment(new BigDecimal(10));
            User user = new User(paymentMethod, "Dinis", "mail@mail.com", "root");
            UserDAO.save(user);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public static void main(String[] args) {
        try {
            Populate createAAData = new Populate();
            try {
                createAAData.createTestData();
            } finally {
                EAClassDiagramPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
