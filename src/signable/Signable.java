package signable;

import exceptions.ConnectionException;
import exceptions.DatabaseNotFoundException;
import exceptions.MaxConnectionException;
import exceptions.UserAlreadyExistException;
import exceptions.UserPasswordException;
import user.User;

/**
 * The Signable interface contains methods that are used in the projects SignUpSignInClient and SignUpSignInServer
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public interface Signable {
    public User signIn(User user) throws UserAlreadyExistException, UserPasswordException, DatabaseNotFoundException, 
                                         ConnectionException, MaxConnectionException;
    
    public User signUp(User user) throws UserAlreadyExistException, UserPasswordException, DatabaseNotFoundException, 
                                         ConnectionException, MaxConnectionException;   
}
