package beans;

import javax.naming.Context;
import javax.naming.InitialContext;

public class BeanLookup {
    private static BeanLocal gameBeanLocal = null;

    public BeanLookup(){ }

    public static BeanLocal getGameBean(){
        if (gameBeanLocal == null) {
            try {
                Context c = new InitialContext();
                gameBeanLocal = (BeanLocal)
                        c.lookup("java:global/Sportify/BeanEJB!beans.BeanLocal");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return gameBeanLocal;
    }
}
