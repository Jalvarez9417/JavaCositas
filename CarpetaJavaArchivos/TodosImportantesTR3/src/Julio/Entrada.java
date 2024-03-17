package Julio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public abstract class Entrada {
	private Integer numEntrada;
	private String empresa;
	private Boolean vendida;
	private BigDecimal precio;

	public Entrada(Integer numEntrada) {
		super();
		this.numEntrada = numEntrada;

		this.vendida = false;

	}

	public Integer getNumEntrada() {
		return numEntrada;
	}

	public void setNumEntrada(Integer numEntrada) {
		this.numEntrada = numEntrada;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Boolean getVendida() {
		return vendida;
	}

	public void setVendida(Boolean vendida) {
		this.vendida = vendida;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getPrecioVenta() {
		return getPrecio().setScale(2, RoundingMode.HALF_DOWN);
	}

	@Override
	public String toString() {
		if (getVendida() == true) {
			return "Nº " + numEntrada + " comercializada por " + empresa + " con PVP " + precio + " VENDIDA";  // TODO: ABEL: tendrías que usar no el precio, sino getPrecioVenta. Y tendrías que formatearlo

		}
		return "Nº " + numEntrada + " comercializada por " + empresa + " con PVP " + precio + " DISPONIBLE";

	}

	@Override
	public int hashCode() {
		return Objects.hash(numEntrada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		return Objects.equals(numEntrada, other.numEntrada);
	}

}
