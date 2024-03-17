package paquete;

import java.util.Scanner;

public class DividirConSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String cadena = sc.nextLine();
		System.out.println(cadena.length());

		for (int i = cadena.length(); i >= 1; i--) {

			System.out.print(cadena.substring(i - 1, i));

		}
	}

}
