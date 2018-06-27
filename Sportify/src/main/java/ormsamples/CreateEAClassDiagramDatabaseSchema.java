/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.orm.*;
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
