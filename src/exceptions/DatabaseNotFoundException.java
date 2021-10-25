package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception class for database error: connection lost or database doesn't exist
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class DatabaseNotFoundException extends Exception {
    private static final Logger LOG = Logger.getLogger(DatabaseNotFoundException.class.getName());
    
    /**
     * Constructs an instance of <code>database</code> with the specified detail LOG message.
     */
    public DatabaseNotFoundException(){
        LOG.log(Level.SEVERE, "Database doesn't exist or Connection refused");
    }
}
