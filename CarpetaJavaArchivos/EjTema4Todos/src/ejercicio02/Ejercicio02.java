package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		String cadena = getMinusculas(" TEXTO de Prueba ");
		System.out.println(cadena);
	}

	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}

	

}
