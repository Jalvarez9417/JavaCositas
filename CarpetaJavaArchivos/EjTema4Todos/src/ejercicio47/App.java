package ejercicios.ejercicio47;

public class App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setDni("12345678X");
		cliente.setNombre("Blas de los montes");
		
		Carrito cesta = new Carrito(cliente);
		System.out.println(cesta);
		
		Ropa poncho = new Ropa();
		poncho.setColor("azul");
		poncho.setDescripcion("poncho");
		poncho.setTalla("XL");
		poncho.setPrecio(20D);
		
		cesta.addArticulo(poncho);
		cesta.addArticulo(poncho);
		
		System.out.println(cesta);
		
		Libro libro = new Libro();
		libro.setAutor("Nietzsche");
		libro.setDescripcion("Así habló Zaratustra");
		libro.setPrecio(15D);
		
		cesta.addArticulo(libro);
		System.out.println(cesta);
		
		cesta.borrarArticulo(1);
		System.out.println(cesta);
		
		System.out.println("Precio medio");
		System.out.println(cesta.getPrecioMedio());
		
		cesta.vaciarCesta();
		System.out.println(cesta);
		
		System.out.println("Precio medio");
		System.out.println(cesta.getPrecioMedio());
		
		
		
		
		
	}

}
