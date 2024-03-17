package ejercicio03;

public class Ejercicio03 {

	public static void main(String[] args) {
		String cadena = getMinMay(1, " prueba TEXTO ");
		System.out.println("Prueba may�sculas: " + cadena);
		cadena = getMinMay(2, " prueba TEXTO ");
		System.out.println("Prueba min�sculas: " + cadena);
	}

	
	private static String getMinMay(Integer numero, String cadena) {
		if (numero == 1) {
			return cadena.trim().toUpperCase();
		}
		return cadena.trim().toLowerCase();
	}

	

}
