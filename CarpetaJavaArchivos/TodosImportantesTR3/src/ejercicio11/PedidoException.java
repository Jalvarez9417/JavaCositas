package ejercicio11;

public class PedidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1866734466978652976L;

	public PedidoException() {
		super();
	}

	public PedidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PedidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PedidoException(String message) {
		super(message);
	}

	public PedidoException(Throwable cause) {
		super(cause);
	}

}
