package signable;

import user.User;

/**
 * The Signable interface contains methods that are used in the projects SignUpSignInClient and SignUpSignInServer
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public interface Signable {
    public User signIn(User user);
    
    public void signUp(User user);   
}
