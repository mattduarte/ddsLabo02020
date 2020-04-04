package ar.edu.utn.dds.auto.exceptions;

public class AutoNoEncendidoException extends Exception {

	public AutoNoEncendidoException() {
		
	}

	public AutoNoEncendidoException(String message) {
		super(message);
	
	}

	public AutoNoEncendidoException(Throwable cause) {
		super(cause);
		
	}

	public AutoNoEncendidoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public AutoNoEncendidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
