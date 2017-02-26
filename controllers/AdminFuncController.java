/*
 *File: AdminFuncController.java
 *
 */
package controllers;

/**
 * This is a class that controls the admin functions
 * 
 * @author Kyle Becker
 * @version 0.1
 */
public class AdminFuncController{
  
 /**
  * This method adds a university to the system
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
  * @return true if univerity added successfully
  */
 public boolean addUniversity(String name, String location, int numberOfStudents, int percentFemale, int SATVerbal, int SATMath, int expense, int percentFinancialAid, int numberOfApplicants, int perecentAdmitted, int percentEnrolled, int academicScale, int socialScale, String empases){
  return false;
 }
  /**
   * This is a method that returns a list of universities in the system
   * 
   * @returns a set of all university objects in the database
   */
  public University[] viewAllUniversities(University university){
    return null;
  }
  
  /**
   * This is a method that edits a university's information in the database
   * 
   * @param university the edited university object
   * @returns true if university is updated successfully
   */
  public boolean editUniversity(University university){
    return false;
  }
  
    /**
   * This method returns an account to be viewed
   * @param username the username of the account to be viewed
   * @returns a set of accounts in the system
   */
  public Account viewUser(String username){
    return null
  }
  
      /**
   * This method returns an account to be deactivated
   * @param username the username of the account to be deactivated
   */
  public coid deactivate(String username){
    return null
  }
  
  
   /**
   * This method adds an account to the system
   * 
   * @param firstname the fistname of the user represented by the account
   * @param lastname the lastname of the user represented by the account
   * @param username the username of the user represented by the account
   * @param password the password of the user represented by the account
   * @param type the account type of the user represented by the account
   * @param status the account status of the user represented by the account
   * @returns true if account added successfully, otherwise false
   */
  public boolean addUser(String firstname, String lastname, String username, String password, Char type, Char status){
    return true;
  }
  
  /**
   * This method returns a set of all accounts in the system
   * 
   * @returns a set of accounts
   */
  public Account manageUsers(){
    return null;
  }
}
