package ejercicios.ejercicio09al11;

public class Ejercicio09al11 {

	public static void main(String[] args) {
		String[] arrayTest = {"rojo", "amarillo", "azul"};
		
//		String[] arrayTest2 = new String[3];
//		arrayTest2[0] = "rojo";
//		arrayTest2[1] = "amarillo";
//		arrayTest2[2] = "azul";
		
		// Test ej 9
		ArrayUtils.imprimirArray(arrayTest);
		
		// Test ej 10
		String palabra = ArrayUtils.obtenerPalabra(arrayTest, 9);
		System.out.println(palabra);
		
		// Test ej 11
		Integer posicion = ArrayUtils.buscarPalabra(arrayTest, "rojo");
		System.out.println(posicion);
		
	}
}
