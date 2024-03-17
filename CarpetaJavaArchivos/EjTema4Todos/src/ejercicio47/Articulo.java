package ejercicios.ejercicio47;

public abstract class Articulo { // Se podría dejar sin abstract para dejar que haya artículos que no sean ni libros ni ropa
	private String descripcion;
	private Double precio;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
