package Julio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concierto {
	private String grupoActuacion;
	private LocalDate fechaCelebracion;
	private List<Entrada> entradas;

	public Concierto(String grupoActuacion) {
		super();
		this.grupoActuacion = grupoActuacion;
		this.fechaCelebracion = LocalDate.now();
		entradas = new ArrayList<>();
	}

	public String getGrupoActuacion() {
		return grupoActuacion;
	}

	public void setGrupoActuacion(String grupoActuacion) {
		this.grupoActuacion = grupoActuacion;
	}

	public LocalDate getFechaCelebracion() {
		return fechaCelebracion;
	}

	public void setFechaCelebracion(LocalDate fechaCelebracion) {
		this.fechaCelebracion = fechaCelebracion;
	}

	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	public Integer getMesesRestantes() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(hoy, getFechaCelebracion());
		return periodo.getMonths();

	}

	public Integer getCantidadEntradasVendidas() {
		return getEntradas().size(); // if entrada.getvendida==true
	}

	public List<Entrada> getListaEntradasSinVender() {
		return entradas; // if entradas.getvendida=false
	}

	public void cambiarPrecioEstandarEntradas(BigDecimal precio) {
		for (int i = 0; i < entradas.size(); i++) {
			entradas.get(i).setPrecio(precio);
		}
	}

	public BigDecimal getTotalRecaudacion() {
		BigDecimal suma = new BigDecimal("0");
		for (int i = 0; i < entradas.size(); i++) {
			// TODO: ABEL: estás sumando todas las entradas, vendidas o no. Tendrías que
			// filtrar por sólo las ya vendidas
			suma = suma.add(entradas.get(i).getPrecio()); // TODO: ABEL: tendrías que usar getPrecioVenta()
		}
		return suma.setScale(2, RoundingMode.HALF_DOWN);
	}

	public BigDecimal getEntradaMasEconomica() {
		for (int i = 0; i < entradas.size(); i++) {
			if (entradas.get(i).getVendida() == false) {
				entradas.get(i).setPrecio(entradas.get(i).getPrecio().divide(new BigDecimal("2"))); // TODO: ABEL: no sé
																									// muy bien qué
																									// quieres hacer
																									// aquí, pero estás
																									// devolviendo la
																									// primera entrada
																									// que te encuentras
																									// sin vender.
																									// Tendrías que
																									// buscar cuál es la
																									// que tiene menor
																									// precio, no
																									// modificarles el
																									// precio
				return entradas.get(i).getPrecioVenta();
			}
		}
		return null;

	}

	public void eliminarEntradasComercializadora(String comercializadora) {
		for (Iterator iterator = entradas.iterator(); iterator.hasNext();) {
			Entrada entrada = (Entrada) iterator.next();
			if (iterator.equals(comercializadora)) { // TODO: ABEL: tienes que mirar si la entrada tiene la misma
														// empresa comercializadora:
														// entrada.getEmpresa().equals(comercializadora)
				iterator.remove();
			}
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String fechaCadena = fechaCelebracion.format(formato);
		return "El grupo " + grupoActuacion + " actuara el " + fechaCadena;
	}

}
