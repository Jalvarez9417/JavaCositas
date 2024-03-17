package ejercicios.ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal ahorro;
	
	public Hucha() {
		ahorro = BigDecimal.ZERO;
	}
	
	public BigDecimal meterDinero(BigDecimal cantidad) {
		if (cantidad == null) {
			return ahorro;
		}
		ahorro = ahorro.add(cantidad).setScale(2, RoundingMode.HALF_DOWN);
		return ahorro;
	}
	
	public BigDecimal sacarDinero(BigDecimal cantidad) {
		if (cantidad == null) {
			return BigDecimal.ZERO;
		}
		if (cantidad.compareTo(ahorro) > 0 ) {
			BigDecimal loQueVoyASacar = ahorro;
			ahorro = BigDecimal.ZERO;
			return loQueVoyASacar;
		}
		ahorro = ahorro.subtract(cantidad).setScale(2, RoundingMode.HALF_DOWN);
		return cantidad.setScale(2, RoundingMode.HALF_DOWN);
	}
	
	
	public BigDecimal contarDinero() {
		return ahorro;
	}
	
	public BigDecimal romperHucha() {
//		return sacarDinero(ahorro); // otra alternativa
		BigDecimal loQueVoyASacar = ahorro;
		ahorro = BigDecimal.ZERO;
		return loQueVoyASacar;
	}
	
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,##0.00 €");
		return formatter.format(ahorro);
	}

}






