package beans;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BeanLocal {
    String sayHello(String name);
}


