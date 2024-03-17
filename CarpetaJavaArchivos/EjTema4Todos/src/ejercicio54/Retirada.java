package ejercicios.ejercicio54;

import java.math.BigDecimal;

public class Retirada  extends Movimiento{

	@Override
	public BigDecimal getOperacion() {
		return getImporte().negate();
	}
	
	@Override
	public String toString() {
		return "[R - " + getFechaImporteFormateados() + "]"; 
	}
	
	
}
