package exception;

public class DatabaseConnectionFaliedException extends Exception {
	
	public DatabaseConnectionFaliedException() {}
	public DatabaseConnectionFaliedException(String message) {
		super(message);
	}
}
