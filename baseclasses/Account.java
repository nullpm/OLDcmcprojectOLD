/**
 * File: Account.java
 */

package baseclasses;

/**
 * A class that defines the attributes and functionalities of an account
 * 
 * @authors Danny Fritz, Matt Zent, Ethan Ferry, and Kyle Becker
 * @version 0.1
 */
public class Account
{
  private String username, firstName, lastName, password;
  private char type, status;
  private boolean loggedIn;
  
  /**
   * A contructor the creates an account object
   * 
   * @param username of the account
   * @param first name of the account
   * @param last name of the account
   * @param password for the account
   * @param type of account the account
   * @param status of the account
   */
  public Account(String username, String firstName, String lastName, String password,
                 char type, char status)
  {
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.type = type;
    this.status = status;
    this.loggedIn = false;
  }
  
  /**
   * A method that logs in the account
   * 
   * @returns true if login was successful
   */
  public boolean login()
  {
    return this.loggedIn = true;
  }
  
  /**
   * A method that logs out the account
   */
  public void logout()
  {
    this.loggedIn = false;
  }
  
  /**
   * A method that gets the username of the account
   * 
   * @returns the username of the account
   */
  public String getUsername()
  {
    return this.username;
  }
  
  /**
   * A method that gets the first name of the account
   * 
   * @returns the first name of the account
   */
  public String getFirstName()
  {
    return this.firstName;
  }
  
  /**
   * A method that gets the last name of the account
   * 
   * @returns the last name of the account
   */
  public String getLastName()
  {
    return this.lastName;
  }
  
  /**
   * A method that gets the password of the account
   * 
   * @returns the password of the account
   */
  public String getPassword()
  {
    return this.password;
  }
  
  /**
   * A method that gets the type of the account
   * 
   * @returns the type of the account
   */
  public char getType()
  {
    return this.type;
  }
  
  /**
   * A method that gets the status of the account
   * 
   * @returns the status of the account
   */
  public char getStatus()
  {
    return this.status;
  }
  
  /**
   * A method that gets whether or not the account is logged in
   * 
   * @returns the username of the account
   */
  public boolean getLoggedIn()
  {
    return this.loggedIn;
  }
  
  /**
   * A method that sets the username of the account
   * 
   * @param the username of the account
   */
  public void setUserName(String s)
  {
    this.username = s;
  }
  
  /**
   * A method that sets the first name of the account
   * 
   * @param the first name of the account
   */
  public void setFirstName(String s)
  {
    this.firstName = s;
  }
  
  /**
   * A method that sets the last name of the account
   * 
   * @param the last name of the account
   */
  public void setLastName(String s)
  {
    this.lastName = s;
  }
  
  /**
   * A method that sets the password of the account
   * 
   * @param the password of the account
   */
  public void setPassword(String s)
  {
    this.password = s;
  }
  
  /**
   * A method that sets the type of the account
   * 
   * @param the type of the account
   */
  public void setType(char c)
  {
    this.type = c;
  }
  
  /**
   * A method that sets the status of the account
   * 
   * @param the status of the account
   */
  public void setStatus(char c)
  {
    this.status = c;
  }
}