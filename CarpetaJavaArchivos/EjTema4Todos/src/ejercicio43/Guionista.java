package ejercicio43;

public class Guionista extends Trabajador {

	private static final int SUELDO = 50000;

	public Guionista(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);

	}

	@Override
	public Integer getSueldo() {
		return SUELDO;
	}
}
