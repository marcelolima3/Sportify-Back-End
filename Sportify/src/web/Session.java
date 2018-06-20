package web;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import sportify.competition.EAClassDiagramPersistentManager;

public class Session {
    private static Session instance = null;
    public static PersistentSession session = null;

    protected Session( PersistentSession session ) {
        this.session = session;
    }

    public static Session getInstance() {
        if(instance == null) {
            System.out.println("Criou");
            PersistentSession session = null;
            try {
                session = EAClassDiagramPersistentManager.instance().getSession();
            }
            catch (PersistentException e) { e.printStackTrace(); }
            instance = new Session(session);
        }
        System.out.println("Criado");
        return instance;
    }
}
