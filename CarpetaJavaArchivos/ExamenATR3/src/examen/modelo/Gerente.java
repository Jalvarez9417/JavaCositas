package examen.modelo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gerente extends Empleado {
	public Gerente(String dni, LocalDate fechaContratacion) {
		super(dni, fechaContratacion);
	}

	private String titulacion;

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	@Override
	public BigDecimal getIncentivo() {

		BigDecimal incentivo = new BigDecimal(5000);
		return incentivo;
	}

	@Override
	public BigDecimal getSueldoCompleto() {
		Gerente gerente = new Gerente(dni, fechaContratacion);
		BigDecimal sueldoConIncentivo = gerente.getSueldo().add(getIncentivo());
		return sueldoConIncentivo;
	}

	@Override
	public BigDecimal getCostesSeguridadSocial() {
		Empleado empleado = new Empleado(dni, fechaContratacion);
		BigDecimal costes = empleado.getSueldoCompleto().multiply(new BigDecimal(30)).divide(new BigDecimal(100));
		return costes;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String fechaCadena = fechaContratacion.format(formato);

		DecimalFormat formatoDinero = new DecimalFormat("#,###.00€");

		return dni + " (" + fechaCadena + ") -Sueldo Base: " + formatoDinero.format(sueldo);
	}
}
