package Julio;

import java.math.BigDecimal;

public class EntradaSubvencionada extends Entrada {

	private BigDecimal suplemento;

	public EntradaSubvencionada(Integer numEntrada) {
		super(numEntrada);
		this.suplemento = suplemento; // TODO: ABEL: esto te sobra
	}

	public BigDecimal getSuplemento() {
		return suplemento;
	}

	public void setSuplemento(BigDecimal suplemento) {
		this.suplemento = suplemento;
	}

	private BigDecimal precioConSuplemento() { // TODO: ABEL: este método debería ser público, llamarse getPrecioVenta y sobrescribir el de la clase padre

		BigDecimal precio1 = getPrecio().divide(new BigDecimal("2"));
		BigDecimal precio = precio1.multiply(getSuplemento());
		precio = precio.add(precio1);
		return precio;
	}
}
