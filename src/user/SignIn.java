package user;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Class containing a timestamp for the user login date
 * 
 * @author Daniel Brizuela, Aritz Arrieta
 */
public class SignIn implements Serializable{
    //Attributes
    private Timestamp LastSignIn;
    private int id;

    //Constructor
    public SignIn() {
    }

    /**
     * Get the user Last Sign In
     * 
     * @return the user lastSignIn
     */
    public Timestamp getLastSignIn() {
        return LastSignIn;
    }

    /**
     * Set the user Last Sign In
     * 
     * @param LastSignIn is the user last sign in
     */
    public void setLastSignIn(Timestamp LastSignIn) {
        this.LastSignIn = LastSignIn;
    }

    /**
     * Get the user ID
     * 
     * @return the user id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the user ID
     * 
     * @param id is the user id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get a string with the user Last Sign In
     * 
     * @return a string with the user Last Sign In
     */
    @Override
    public String toString() {
        return "SignIn{" + "LastSignIn=" + LastSignIn + ", id=" + id + '}';
    }

}
