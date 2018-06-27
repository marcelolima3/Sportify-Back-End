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
import com.Sportify.Managers.UsersManagement;
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

    public void testUsersManagement() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            UsersManagement usersManagement = new UsersManagement();
            int id = usersManagement.registerUser("Dinis", "mail3@gmail.com", "root", new InvoicePayment(new BigDecimal(10)));
            System.out.println("ID: " + id);
            t.commit();
        }
        catch (Exception e){
            t.rollback();
        }
    }

    public static void main(String[] args) {
        try {
            Populate createAAData = new Populate();
            try {
                createAAData.testUsersManagement();
            } finally {
                EAClassDiagramPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
