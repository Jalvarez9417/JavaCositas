package ejercicios.ejercicio54;

import java.math.BigDecimal;

public class Ingreso extends Movimiento{

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public BigDecimal getOperacion() {
		return getImporte();
	}

	@Override
	public String toString() {
		return "[I - " + getFechaImporteFormateados() + " - " + descripcion + "]"; 
	}

	
	
}
