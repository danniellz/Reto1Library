/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Exception class for the Max connection allowed
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan 
 */
public class MaxConnectionException extends Exception {
    private static final Logger LOG = Logger.getLogger(MaxConnectionException.class.getName());

    /**
     * Constructs an instance of <code>MaxConnectionException</code> with the specified detail LOG message.
     */
    public MaxConnectionException() {
       LOG.log(Level.WARNING, "There is not connections available");
    }
}
