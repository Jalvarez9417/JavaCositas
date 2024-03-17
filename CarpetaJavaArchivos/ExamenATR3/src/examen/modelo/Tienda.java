package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Tienda {
	private Integer numeroLocal;
	private List<Empleado> empleados;
	private List<Articulo> articulos;

	public Tienda(Integer numeroLocal) {
		super();
		this.numeroLocal = numeroLocal;
		this.empleados = new ArrayList<>();
		this.articulos = new ArrayList<>();

	}

	public Integer getNumeroLocal() {
		return numeroLocal;
	}

	public void setNumeroLocal(Integer numeroLocal) {
		this.numeroLocal = numeroLocal;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public BigDecimal getCostePersonal() {
		BigDecimal completo = new BigDecimal(0);
		for (Empleado empleado : empleados) {
			completo = empleado.getCostesSeguridadSocial().add(empleado.getSueldoCompleto()).setScale(2,
					RoundingMode.HALF_DOWN);
		}
		return completo;
	}

	public List<Empleado> getEmpleadosAniversario() {
		List<Empleado> listaAniversario = new ArrayList<>();
		LocalDate dia = LocalDate.of(2024, 1, 1);
		for (Empleado empleado : empleados) {
			Period periodo = Period.between(dia, empleado.getFechaContratacion());
			if (periodo.getYears() == 10) {
				listaAniversario.add(empleado);
			}
		}
		return listaAniversario;
	}

	public Map<Integer, Integer> getMapaArticulosEnStock() {
		Map<Integer, Integer> articulosMapa = new HashMap<>();

		for (Articulo articulo : articulos) {
			if (articulo.getStock() > 0) {
				articulosMapa.put(articulo.getCodigo(), articulo.getStock());
			}
		}
		return articulosMapa;
	}

	public void borrarArticulos() {
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			if (articulo.getStock() == 0) {
				iterator.remove();
			}
		}
	}

	public Articulo getArticuloMasBarato() {
		BigDecimal barato = new BigDecimal(0);
		int cont = 0;
		Articulo articuloBarato = new Articulo();
		for (Articulo articulo : articulos) {
			if (cont == 0) {
				barato = articulo.getPrecio();
			}
			cont++;
			if (articulo.getStock() > 0) {
				if (articulo.getPrecio().compareTo(barato) <= 0) {
					articuloBarato = articulo;
					barato = articulo.getPrecio();
				}

			}
		}
		return articuloBarato;

	}
}
