/**
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
public class Sport {
	public Sport() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == event.ORMConstants.KEY_SPORT_COMPETITIONS) {
			return ORM_competitions;
		}
		else if (key == event.ORMConstants.KEY_SPORT_MODALITIES) {
			return ORM_modalities;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String name;
	
	private java.util.Set ORM_competitions = new java.util.HashSet();
	
	private java.util.Set ORM_modalities = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setORM_Competitions(java.util.Set value) {
		this.ORM_competitions = value;
	}
	
	private java.util.Set getORM_Competitions() {
		return ORM_competitions;
	}
	
	public final CompetitionSetCollection competitions = new CompetitionSetCollection(this, _ormAdapter, event.ORMConstants.KEY_SPORT_COMPETITIONS, event.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Modalities(java.util.Set value) {
		this.ORM_modalities = value;
	}
	
	private java.util.Set getORM_Modalities() {
		return ORM_modalities;
	}
	
	public final ModalitySetCollection modalities = new ModalitySetCollection(this, _ormAdapter, event.ORMConstants.KEY_SPORT_MODALITIES, event.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
