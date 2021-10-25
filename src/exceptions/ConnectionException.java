package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for the socket connection between the client and server
 *
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class ConnectionException extends Exception {
    private static final Logger LOG = Logger.getLogger(ConnectionException.class.getName());

    /**
     * Constructs an instance of <code>EmailNotValidException</code> with the specified detail LOG message.
     */
    public ConnectionException() {
        LOG.log(Level.SEVERE, "A connection error has occurred");
    }
}
