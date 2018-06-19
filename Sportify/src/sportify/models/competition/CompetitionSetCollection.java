package sportify.models.competition; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import sportify.models.EAClassDiagramPersistentManager;

public class CompetitionSetCollection extends org.orm.util.ORMSet {
	public CompetitionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public CompetitionSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Competition value) {
		if (value != null) {
			super.add(value, null);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Competition value) {
		super.remove(value, null);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Competition value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Competition[] toArray() {
		return (Competition[]) super.toArray(new Competition[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>name</li>
	 * <li>location</li>
	 * <li>startDate</li>
	 * <li>endDate</li>
	 * <li>description</li>
	 * <li>active</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Competition[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>name</li>
	 * <li>location</li>
	 * <li>startDate</li>
	 * <li>endDate</li>
	 * <li>description</li>
	 * <li>active</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Competition[] toArray(String propertyName, boolean ascending) {
		return (Competition[]) super.toArray(new Competition[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return EAClassDiagramPersistentManager.instance();
	}
	
}

