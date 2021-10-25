package user;

import java.sql.Timestamp;

/**
 * The user class is a javabeans
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class User {
    //Attributes
    private int id;
    private String login;
    private String email;
    private String fullName;
    private UserStatus status;
    private UserPrivilege privilege;
    private String password;
    private Timestamp lastPasswordChange;

    //Constructor
    public User() {
    }

    //Getters and Setters
    /**
     * Get the user id
     * 
     * @return the user id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the user id
     * 
     * @param id of the user
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the username
     * 
     * @return the username
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the username
     * 
     * @param login is the username
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Get the user email
     * 
     * @return the user email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the user email
     * 
     * @param email is the user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the user fullname
     * 
     * @return the user fullname
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Set the user fullname
     * 
     * @param fullName is the user fullname
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Get the user status
     * 
     * @return the status object
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * Set the user status
     * 
     * @param status is an enum object
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * Get the user privilege
     * 
     * @return the privilege object
     */
    public UserPrivilege getPrivilege() {
        return privilege;
    }

    /**
     * Set the user privilege
     * 
     * @param privilege is an enum object
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     * Get the user password
     * 
     * @return the user password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the user password
     * 
     * @param password is a string value for the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the Timestamp of the last password change
     * 
     * @return the timestamp of the last password change
     */
    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * Set the Timestamp of the last password change
     * 
     * @param lastPasswordChange is the a timestamp value for the last password change
     */
    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    //toString
    /**
     * Get a string with the user information
     * 
     * @return a string with the user data
     */
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", email=" + email + ", fullName=" + fullName + ", status=" + status + ", privilege=" + privilege + ", password=" + password + ", lastPasswordChange=" + lastPasswordChange + '}';
    } 
}
