package signable;

import exceptions.ConnectionException;
import exceptions.DatabaseNotFoundException;
import exceptions.IncorrectPasswordException;
import exceptions.MaxConnectionException;
import exceptions.UserAlreadyExistException;
import exceptions.UserNotFoundException;
import user.User;

/**
 * The Signable interface contains methods that are used in the projects SignUpSignInClient and SignUpSignInServer
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public interface Signable {
    public User signIn(User user) throws UserAlreadyExistException, UserNotFoundException, DatabaseNotFoundException, 
                                         ConnectionException, MaxConnectionException, IncorrectPasswordException;
    
    public User signUp(User user) throws UserAlreadyExistException, IncorrectPasswordException, DatabaseNotFoundException, 
                                         ConnectionException, MaxConnectionException,UserNotFoundException;   
}
