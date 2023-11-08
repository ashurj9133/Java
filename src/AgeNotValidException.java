import java.io.IOException;

public class AgeNotValidException extends IOException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AgeNotValidException(String s){
		super(s);
	}
}