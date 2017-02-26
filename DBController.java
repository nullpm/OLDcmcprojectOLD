/**
 * This is a class that controls the database functions
 * 
 * @author Kyle Becker
 * @version 0.1
 */
public class DBController{
  
  private String dbServer, dbName, dbUser, dbPass;
  
  /**
   * This is a method that returns a university object from info from the database
   * 
   * @param name name of the university
   * @returns univeristy object of university with specified name
   */
  public University getUniversity(String name){
    return null;
  }
  
    /**
   * This is a method the adds a university to the database
   * 
   * @param university the university object to be added
   * @returns true if addition is successful
   */
  public University addUniversity(University university){
    return null;
  }
  /**
   * This is a method that edits a university's information in the database
   * 
   * @param university the edited university object
   * @returns true if university is updated successfully
   */
  public University editUniversity(University university){
    return null;
  }
  
  /**
   * This is a method that returns a list of universities related to the specified one
   * 
   * @param univeristy the university object of the university that reccomendtions should be found for
   * @returns a set of university objects that are similar to the specified one
   */
  public University[] getUniversityRecomendations(University university){
    return null;
  }
  /**
   * This is a method that returns a list of universities in the database
   * 
   * @returns a set of all university objects in the database
   */
  public University[] getUniversities(University university){
    return null;
  }
  /**
   * This method updates a user's information in the database
   * 
   * @param a the account to be updated
   */
  public void updateUser(Account a){
    return null
  }
  
  /**
   * This method returns a set of all the accounts in the database
   * 
   * @returns a set of accounts in the database
   */
  public Account[] getAccounts(){
    return null
  } 
    /**
   * This method adds an account to the system
   * 
   * @param account the account to be added to the database
   * @returns true if account added successfully, otherwise false
   */
  public boolean addAccount(Account accout){
    return true;
  }
  /**
   * This method gets an account that matches the specified username
   * 
   * @param username the username of the account to be retrieved
   * @returns the account object that matches the specified unsername
   */
  public Account getAccount(String username){
    return null;
  }
  
 
}