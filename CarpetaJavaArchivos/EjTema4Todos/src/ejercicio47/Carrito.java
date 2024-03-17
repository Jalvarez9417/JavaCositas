package ejercicios.ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private Cliente cliente;
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private List<Articulo> articulos;
	
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaActualizacion = LocalDate.now();
		articulos = new ArrayList<>();
	}
	
	public Integer getCantidad() {
		return articulos.size();
	}
	
	public Double getTotal() {
		Double total = 0D;
		for (Articulo articulo : articulos) {
			total += articulo.getPrecio();
		}
//		for (Iterator<Articulo> iterator = articulos.iterator(); iterator.hasNext();) {
//			Articulo articulo = (Articulo) iterator.next();
//			total += articulo.getPrecio();
//			
//		}
		return total;
	}
	
	public Double getPrecioMedio() {
		if (articulos.isEmpty()) {
			return 0D;
		}
		return getTotal() / getCantidad();
	}
	
	
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		fechaActualizacion = LocalDate.now();
	}
	
	public void borrarArticulo(int posicion) {
		if (posicion >= 0 && posicion < getCantidad()) {
			articulos.remove(posicion);
			fechaActualizacion = LocalDate.now();
		}
	}
	
	public void vaciarCesta() {
		articulos.clear();
		fechaActualizacion = LocalDate.now();
	}
	
	
	
	@Override
	public String toString() {
		return cliente.getDni() + " - " + cliente.getNombre() 
		 + "\n\t[" + getCantidad() + "] Total: " + getTotal() + " €"
		 + "\n\tFecha última actualización " + getFechaActualizacionFormateada();
	
	}
	
	private String getFechaActualizacionFormateada() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fechaActualizacion.format(formatter);
	}

	public Cliente getCliente() {
		return cliente;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	
	
	
}
