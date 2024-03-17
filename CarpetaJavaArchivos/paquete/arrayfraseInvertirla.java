package paquete;

import java.util.Scanner;

public class arrayfraseInvertirla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] array = new String[3];

		String palabra;

		for (int i = 0; i < array.length; i++) {

			System.out.println("Dime una palabra");
			array[i] = palabra = sc.nextLine();

		}

		System.out.println("Frase: ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("Frase Invertida: ");

		for (int i = array.length - 1; i > -1; i--) {

			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
