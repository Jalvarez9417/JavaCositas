package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
	protected String dni;
	protected LocalDate fechaContratacion;
	protected BigDecimal sueldo;

	public Empleado(String dni, LocalDate fechaContratacion) {
		super();
		this.dni = dni;
		this.fechaContratacion = fechaContratacion;
		this.sueldo = new BigDecimal(0);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public Boolean isJunior() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(hoy, getFechaContratacion());

		if (periodo.getMonths() >= 24) {
			return false;
		}
		return true;
	}

	public BigDecimal getIncentivo() {
		Empleado empleado = new Empleado(dni, fechaContratacion);

		BigDecimal incentivo = new BigDecimal(1000);
		BigDecimal incentivoJr = new BigDecimal(0);

		if (empleado.isJunior()) {
			return incentivoJr;

		} else {

			return incentivo;
		}
	}

	public BigDecimal getSueldoCompleto() {
		Empleado empleado = new Empleado(dni, fechaContratacion);
		BigDecimal sueldoConIncentivo = empleado.getSueldo().add(getIncentivo()).setScale(2, RoundingMode.HALF_DOWN);
		return sueldoConIncentivo;
	}

	public BigDecimal getCostesSeguridadSocial() {
		Empleado empleado = new Empleado(dni, fechaContratacion);
		BigDecimal costes = empleado.getSueldoCompleto().multiply(new BigDecimal(30)).divide(new BigDecimal(100), 2,
				RoundingMode.HALF_DOWN);
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
