/**
 * 
 */
package cmcClasses;

/**
 * This is the User base class
 * 
 * @author mjzent
 * @version 0.1
 */
public class User {
	

	private University[] savedUniversities;

	/**
	 * This method gets a list of this users saved universities
	 * 
	 * @return the savedUniversities
	 */
	public University[] getSavedUniversities() {
		return savedUniversities;
	}

	/**
	 * This method adds a university to this users list of saved universities
	 * 
	 * @param savedUniversities the savedUniversities to set
	 * @return whether or not the university could be added
	 */
	public boolean addUniversities(University u) {
		
	}
	
	/**
	 * This method removes a university from the users list of saved universities
	 * 
	 * @param u is school to be removed from saved universities
	 * @return whether the remove was successful
	 */
	public boolean removeSchool(University u){
		return false;
	}
	
	/**
	 * This method views the details of a university
	 * 
	 * @param u is the school to be viewed
	 * @return a string representation of university details
	 */
	public String viewSchool(University u){
		return null;
	}
	/**
	 * This method views the details of a university as well as the details of similar universities
	 * 
	 * @param u is the school to be viewed and to find similar universities to
	 * @return a string representation of university details and details of similar universities
	 */
	
	public String viewSchoolWRec(University u){
		return null;
	}
}
