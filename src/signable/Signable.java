package signable;

import exceptions.ConnectionException;
import exceptions.DatabaseNotFoundException;
import exceptions.IncorrectPasswordException;
import exceptions.InvalidEmailFormatException;
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
                                         ConnectionException, IncorrectPasswordException, InvalidEmailFormatException;
    
    public void signUp(User user) throws UserAlreadyExistException, UserNotFoundException, DatabaseNotFoundException, 
                                         ConnectionException, IncorrectPasswordException, InvalidEmailFormatException;;   
}
