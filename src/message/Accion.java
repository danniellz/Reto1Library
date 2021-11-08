package message;

/**
 * Class that controls what type of message the client or server need
 * 
 * @author Daniel Brizuela, Aritz Arrieta, Mikel Matilla, Jonathan Viñan
 */
public enum Accion {
    //Register, Login and Log Out petitions
    SIGNUP, SIGNIN, OK,
    //Exceptions
    DATABASENOTFOUND, USERALREADYEXIST, INVALIDUSERORPASSWORD, CONNECTIONNOTFOUND, MAXCONNECTION 
}
