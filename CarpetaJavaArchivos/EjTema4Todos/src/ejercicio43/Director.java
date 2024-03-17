package ejercicio43;

public class Director extends Trabajador {

	private static final int SUELDO = 100000;

	public Director(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);

	}

	@Override
	public Integer getSueldo() {
		return SUELDO;
	}

}
