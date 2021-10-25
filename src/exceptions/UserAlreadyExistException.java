package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for registration of an user that already exist
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class UserAlreadyExistException extends Exception {
    private static final Logger LOG = Logger.getLogger(UserAlreadyExistException.class.getName());

    /**
     * Constructs an instance of <code>User</code> with the specified detail LOG message.
     */
    public UserAlreadyExistException() {
        LOG.log(Level.WARNING, "User already exist");
    }
}
