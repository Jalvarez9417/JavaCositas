package paquete;

public class arrayForeach {
	public static void main(String[] args) {

		double[] array = new double[] { 5.4, 3.1, 9.0, 4.7 };

		for (double d : array) {
			System.out.println(d);
		}

		double suma = 0;

		for (double d : array) {

			suma = suma + d;
		}
		System.out.println("Suma: " + suma);
	}

}
