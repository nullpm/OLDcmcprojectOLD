/**
 * This is a class that controls the account functions
 * 
 * @author Kyle Becker
 * @version 0.1
 */
public class AccountController{
  
  /**
   * This method updates account info
   * 
   * @param account the updated account that should be changed in our database
   * @param firstname the new firstname, null if to be unchanged
   * @param lastname the new lastname, null if to be unchanged
   * @param username the new username, null if to be unchanged
   * @param password the new password, null if to be unchanged
   * @param type the new account type, null if to be unchanged
   * @param status the new account status, null if to be unchnaged
   */
  public void editUserInfo(Account account, String firstname, String lastname, String username, String password, Char type, Char status){}
  
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
  public boolean addAccount(String firstname, String lastname, String username, String password, Char type, Char status){
    return true;
  }
  /**
   * This method returns a set of all the accounts in the system
   * 
   * @returns a set of accounts in the system
   */
  public Account[] getAccounts(){
    return null
  }
    /**
   * This is a method that logs in the user
   * 
   * @param Username of the user
   * @param Password of the user
   * @returns true if the login is completed
   */
  public boolean login(String username, String password){
    return true;
  }
  
}