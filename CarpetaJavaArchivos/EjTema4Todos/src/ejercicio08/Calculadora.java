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
	
	/** Este m�todo divide un n�mero a entre un n�mero b y 
	 * devuelve el resultado. Si el divisor es 0, devolver� 0.
	 * @param a: Dividendo
	 * @param b: Divisor
	 * @return: Cociente como Integer. Si el divisor es 0, devolver� 0
	 */
	public static Integer dividir(Integer a, Integer b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
	
	/** Este m�todo permite calcular diferentes operaciones para dos n�meros
	 * de entrada (a y b). Devuelve el resultado.
	 * @param operacion Tendr� que ser ADD, SUB, MUL, DIV
	 * @param a Primer n�mero
	 * @param b Segundo n�mero
	 * @return Resultado de la operaci�n. Si el tipo de operaci�n indicado no es
	 * correcto, devolver� null. Si la operaci�n es DIV y el segundo n�mero es 0,
	 * devolver� 0
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
