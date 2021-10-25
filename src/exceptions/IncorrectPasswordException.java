package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for incorrect password
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class IncorrectPasswordException extends Exception {
    private static final Logger LOG = Logger.getLogger(IncorrectPasswordException.class.getName());

    /**
     * Constructs an instance of <code>IncorrectPasswordException</code> with the specified detail LOG message.
     */
    public IncorrectPasswordException() {
        LOG.log(Level.WARNING, "Incorrect Password");
    }
}
