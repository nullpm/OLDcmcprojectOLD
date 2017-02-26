
/**
 * This is a class that holds all the methods related to searching
 * 
 * @author mjzent
 * @version 0.1
 */
public class SearchController {

	private University[] searchedUniversities;
	
	/**
	 * This method holds the algorithm for finding related universities to a given university
	 * 
	 * @param university
	 * @param n
	 * @return an array of size n holding the most closely related universities
	 */
	public University[] findRelatedUniversities(University university, int n){
		return null;
	}
	
	/**
	 * This method gets a university out of searchedUniversities
	 * 
	 * @param name
	 * @return the university object in the list, will ben null if it doesn't not exist
	 */
	public University getUniversity(String name){
		return null;
	}
	
	/**
	 * This method talks to the dbcontroller to search the database based on given conditions, it will put all searches in searchedUniversities
	 * 
	 * @param name of university
	 * @param location of university
	 * @param numberOfStudents at the university
	 * @param percentFemale students at the university
	 * @param SATVerbal of the average student at the university
	 * @param SATMath of the average student at the university
	 * @param expense of the university
	 * @param percentFinancialAid of the average student at the university
	 * @param numberOfApplicants at the university
	 * @param perecentAdmitted at the university
	 * @param percentEnrolled at the university
	 * @param academicScale of the university
	 * @param socialScale of the university
	 * @param empases of the university
	 * @return the condition attached to whether or not any matches were found to the search
	 */
	public boolean search(String name, String location, int numberOfStudents, int percentFemale, int SATVerbal, int SATMath, int expense, int percentFinancialAid, int numberOfApplicants, int perecentAdmitted, int percentEnrolled, int academicScale, int socialScale, String empases){
		return false;
	}
}
