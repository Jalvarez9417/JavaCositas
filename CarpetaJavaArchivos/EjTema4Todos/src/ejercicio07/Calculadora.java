package ejercicios.ejercicio07;

public class Calculadora {

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
}
