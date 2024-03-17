package ejercicios.ejercicio33;

public class Semaforo {

	public static final String COLOR_ROJO = "ROJO";
	public static final String COLOR_VERDE = "VERDE";
	public static final String COLOR_AMBAR = "ÁMBAR";
	
	private String color;
	private Boolean parpadeando;
	
	
	public Semaforo() {
		color = COLOR_ROJO;
		parpadeando = false;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
//		if (color == null) { // también se podría hacer esto en lugar de meter color!=null dentro del if
//			return;
//		}
		if (color!= null && 
				(color.equals(COLOR_AMBAR) || color.equals(COLOR_ROJO) || color.equals(COLOR_VERDE))) {
			this.color = color;
		}
		
	}


	public Boolean getParpadeando() {
		return parpadeando;
	}


	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando && !color.equals(COLOR_AMBAR)) {
			return;
		}
		this.parpadeando = parpadeando;
		
		// otra opción
//		if (color.equals(COLOR_AMBAR) || !parpadeando) { 
//			this.parpadeando = parpadeando;
//		}
		
		// otra opción más
//		if (color.equals(COLOR_AMBAR)) { 
//			this.parpadeando = parpadeando;
//		}
//		else {
//			this.parpadeando = false;
//		}
		
	}
	
	public void cambiarEstado() {
		if (color.equals(COLOR_VERDE)) {
			color = COLOR_AMBAR;
			parpadeando = true;
		}
		else if (color.equals(COLOR_AMBAR) && parpadeando) {
			parpadeando = false;
		}
		else if (color.equals(COLOR_AMBAR)) {
			color = COLOR_ROJO;
		}
		else {
			color = COLOR_VERDE;
		}
	}
	
	@Override
	public String toString() {
		if (parpadeando) {
			return "Semáforo en " + color + " parpadeando";
		}
		return "Semáforo en " + color;
		
		// otra opción
//		return "Semáforo en " + color + (parpadeando ? " parpadeando" : "");

		
		
	}
	
	
}
