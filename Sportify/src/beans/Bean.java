package beans;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import web.JavaWeb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "BeanEJB")
public class Bean implements BeanLocal{
    public Bean() {

    }

    @Override
    public String sayHello(String name) {
        return "Hello World!";
    }

}
