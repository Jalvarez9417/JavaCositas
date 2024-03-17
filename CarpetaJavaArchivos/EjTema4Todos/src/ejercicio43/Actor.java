package ejercicio43;

public class Actor extends Trabajador {

	public Actor(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);
		
	}

	private static final int SUELDO = 100000;
	
	@Override
	public Integer getSueldo() {
		return SUELDO;
	}
	
	
	
}
