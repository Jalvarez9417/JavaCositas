package ejercicios.ejercicio08;

public class Calculadora {

	public static final String DIVIDIR = "DIV";
	public static final String MULTIPLICAR = "MUL";
	public static final String RESTAR = "SUB";
	public static final String SUMAR = "ADD";
	

	public static Integer sumar(Integer a, Integer b) {
		return a + b;
	}
	public static Integer restar(Integer a, Integer b) {
		return a - b;
	}
	public static Integer multiplicar(Integer a, Integer b) {
		return a * b;
	}
	
	/** Este método divide un número a entre un número b y 
	 * devuelve el resultado. Si el divisor es 0, devolverá 0.
	 * @param a: Dividendo
	 * @param b: Divisor
	 * @return: Cociente como Integer. Si el divisor es 0, devolverá 0
	 */
	public static Integer dividir(Integer a, Integer b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
	
	/** Este método permite calcular diferentes operaciones para dos números
	 * de entrada (a y b). Devuelve el resultado.
	 * @param operacion Tendrá que ser ADD, SUB, MUL, DIV
	 * @param a Primer número
	 * @param b Segundo número
	 * @return Resultado de la operación. Si el tipo de operación indicado no es
	 * correcto, devolverá null. Si la operación es DIV y el segundo número es 0,
	 * devolverá 0
	 */
	public static Integer calcular(String operacion, Integer a, Integer b) {
		if (operacion.equals(SUMAR)) {
			return sumar(a, b);
		}
		if (operacion.equals(RESTAR)) {
			return restar(a, b);
		}
		if (operacion.equals(MULTIPLICAR)) {
			return multiplicar(a, b);
		}
		if (operacion.equals(DIVIDIR)) {
			return dividir(a, b);
		}
		return null;
		
		
	}
	
	
	
	
	
	
	
}
