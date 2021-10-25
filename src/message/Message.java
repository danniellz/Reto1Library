package message;

import user.User;

/**
 * JavaBeans class with the user data
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public class Message {
    //Attributes
    private User user;
    private Accion accion;

    //Getters and Setters
    /**
     * Get the User object
     * 
     * @return the User object
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user data
     * 
     * @param user is an object with the user data
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the Accion object
     * 
     * @return the accion requested
     */
    public Accion getAccion() {
        return accion;
    }

    /**
     * Set the accion
     * 
     * @param accion is an enum object
     */
    public void setAccion(Accion accion) {
        this.accion = accion;
    }
}
