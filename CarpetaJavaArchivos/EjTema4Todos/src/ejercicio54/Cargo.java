package ejercicios.ejercicio54;

import java.math.BigDecimal;

public class Cargo  extends Movimiento{
	private String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public BigDecimal getOperacion() {
		return getImporte().negate();
	}
	
	@Override
	public String toString() {
		return "[C - " + getFechaImporteFormateados() + " - " + cif + "]"; 
	}
	
}
