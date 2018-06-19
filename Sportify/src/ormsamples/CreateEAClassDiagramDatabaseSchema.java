package ormsamples; /**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import sportify.models.EAClassDiagramPersistentManager;

public class CreateEAClassDiagramDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(EAClassDiagramPersistentManager.instance());
			EAClassDiagramPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
