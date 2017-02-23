/* testing git accounts
 *This is a class that is an interface for the user
 *
 * @author Ethan Ferry
 * @version 0.1
 */

public class UserInterface{
	
	/*
 	* This is a method to view saved schools
 	* 
 	*/
	public void viewSavedSchools(){

	}
	/*
 	* This is a method to search for schools
 	*
 	* @param name of school
 	* @param state schools is located
 	* @param locaiton of school (urban, rural...)
 	* @param numberOfStudents currently attending the school
 	* @param percentFemale percentage of females attending the school
 	* @param SATVerbal the average SAT verbal score for enrolled students
 	* @param SATMath the average SAT math score for enrolled students
 	* @param expenses annual expenses or tuition to attend the schools
 	* @param percentFinancialAid %  of enrolled students recieveing financial aid
 	* @param numberOfApplicants # of people who apply each year
 	* @param percentAdmitted % of applicants admitted
 	* @param percentEnrolled percent of applicants that decide to enroll
 	* @param academicScale scale 1-5 of academic scale of school
 	* @param socialScale scale 1-5 idicating quality of life at school
 	* @param emphases up to five areas of study (all strings) in which the school excells
 	*
 	* @returns an array of universities that meet the criteria
 	*/
	public university[] searchSchools(String name, String state, String location, int numberOfStudents, int percentFemale, int SATVerbal, int SATMath, int expenses, int percentFinancialAid, int numberOfApplicants, int percentAdmitted, int percentEnrolled, int academicScale, int socialScale, String emphases){
		return null;
	}

	/*
 	 *  This is a method that lets the user view their profilee
 	 *
 	 */ 	 
	public void viewProfile(){

	}

	/* 
 	 * This is a method that lets users save universities to a list   
 	 * 
 	 * @param University a university object
 	 */
	public void saveSchool(University uni){

	}
	/*
 	 * This method views the searches (??)
 	 *
 	 * @returns an array of University objects 	 *
 	 */ 
	public University[] viewSearches(){
		return null;
	}
	/*
 	 * This is a method that edits a profile
 	 *
 	 * @param firstName the first name of the users account
 	 * @param lastName the last name of the users account
 	 */ 
	public boolean editProfile(String firstName, String lastName){
		return false;
	}

	/*
 	 * This is a method that edits a profile
 	 *
 	 * @param An account of the profile being edited
 	 *
 	 */ 
	public boolean editProfile(Account acc){
		return false;
	}

	/*
 	 *This is a method that logs out the user
 	 *
 	 * @param An account of the user being logged out
 	 */ 
	public void logout(Account a){

	}
}
