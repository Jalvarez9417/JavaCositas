package ejercicios.ejercicio09al11;

public class ArrayUtils {

	public static void imprimirArray (String[] x){
		for (String valor : x) {
			System.out.println(valor);
		}
	}

	public static String obtenerPalabra(String[] array, Integer posicion) {
		if (posicion >= 0 && posicion < array.length) {
			return array[posicion];
		}
		return "";
	}
	
	public static Integer buscarPalabra(String[] array, String palabra){
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(palabra)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
}
