package examen.service;

public class SinArticulosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5752733534888234127L;

	public SinArticulosException() {
	}

	public SinArticulosException(String message) {
		super(message);
	}

	public SinArticulosException(Throwable cause) {
		super(cause);
	}

	public SinArticulosException(String message, Throwable cause) {
		super(message, cause);
	}

	public SinArticulosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
