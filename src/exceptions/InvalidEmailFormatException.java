package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for Invalid email format
 *
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class InvalidEmailFormatException extends Exception {
    private static final Logger LOG = Logger.getLogger(InvalidEmailFormatException.class.getName());

    /**
     * Constructs an instance of <code>IncorrectPasswordException</code> with the specified detail LOG message.
     */
    public InvalidEmailFormatException() {
        LOG.log(Level.WARNING, "Invalid Email format");
    }
}
