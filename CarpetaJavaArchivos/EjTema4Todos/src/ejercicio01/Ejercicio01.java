package ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		String cadena = getMayusculas(" texto de prueba ");
		System.out.println(cadena);
	}

	public static String getMayusculas(String cadena) {
		String mayusculas = cadena.trim().toUpperCase();
		return mayusculas;
	}

	

}
