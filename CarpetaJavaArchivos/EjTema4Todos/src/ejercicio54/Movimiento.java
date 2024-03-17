package ejercicios.ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Movimiento {

	private static final DecimalFormat FORMATO_IMPORTE = new DecimalFormat("#,###.00 €");
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate fecha;
	private BigDecimal importe;
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	public abstract BigDecimal getOperacion();
	
	protected String getFechaImporteFormateados() {
		return FORMATO_FECHA.format(fecha) + " - " + FORMATO_IMPORTE.format(importe);
	}
}
