package ejercicio04;

import ejercicio01.Ejercicio01;
import ejercicio02.Ejercicio02;

public class Ejercicio04 {

	public static void main(String[] args) {
		String cadena = getMinMay(1, " prueba TEXTO ");
		System.out.println("Prueba may�sculas: " + cadena);
		cadena = getMinMay(2, " prueba TEXTO ");
		System.out.println("Prueba min�sculas: " + cadena);
	}

	
	private static String getMinMay(Integer numero, String cadena) {
		if (numero == 1) {
			return Ejercicio01.getMayusculas(cadena);
		}
		return Ejercicio02.getMinusculas(cadena);
	}

	

}
