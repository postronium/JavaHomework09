/**
 * ############################## Pg0902 ##############################
 * 
 */
@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
    	super("Number must be positiv !");
    }

    public NegativeNumberException(String message) {
       super(message);
    }
}