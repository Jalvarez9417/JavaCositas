package paquete;

import java.util.Scanner;

public class arrayMenorMayorYMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos numeros me vas a decir?");
		int cantidad = sc.nextInt();

		int[] array = new int[cantidad];

		int num;

		for (int i = 0; i < array.length; i++) {

			System.out.println("Dime los numeros");
			array[i] = num = sc.nextInt();

		}
		
		
		int mayor = array[0];
		int menor = array[0];
		int suma = 0;
		
		for (int i = array.length - 1; i > -1; i--) {

			System.out.println("Posición: " + i + "= " + array[i]);
		}
		for (int i = 0; i < array.length; i++) {

			if (mayor < array[i]) {
				mayor = array[i];
			}

		}
		System.out.println("Mayor: " + mayor);

		for (int i = 0; i < array.length; i++) {
			
			if (menor > array[i]) {
				menor = array[i];
			}
		}
		System.out.println("Menor: " + menor);

		for (int i = 0; i < array.length; i++) {

			suma = suma + array[i];

		}

		System.out.println("Media= " + suma + "/" + array.length);
		double media = suma / array.length;
		System.out.println("Media: " + media);

		sc.close();
	}

}
