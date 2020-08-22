package exceptions;

@SuppressWarnings("serial")
public class InvalidIdException extends Exception {

	public InvalidIdException() {
		super("This isn't your day to get out of your house, come tomorrow");
	}
}
