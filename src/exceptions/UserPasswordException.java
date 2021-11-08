package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for sign in of an user that doesnt'exist in the database
 *
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class UserPasswordException extends Exception {
    private static final Logger LOG = Logger.getLogger(UserPasswordException.class.getName());

    /**
     * Constructs an instance of <code>UserNotFoundException</code> with the specified detail LOG message.
     */
    public UserPasswordException() {
        LOG.log(Level.WARNING, "User doesn't exist or Incorrect Password");
    }
}
