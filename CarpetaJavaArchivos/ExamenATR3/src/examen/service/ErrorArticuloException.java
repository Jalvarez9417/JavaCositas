package examen.service;

public class ErrorArticuloException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5230116217342798580L;

	public ErrorArticuloException() {
	}

	public ErrorArticuloException(String message) {
		super(message);
	}

	public ErrorArticuloException(Throwable cause) {
		super(cause);
	}

	public ErrorArticuloException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorArticuloException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
