package paquete;

import java.util.Scanner;

public class foreachIndonesia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String palabra = sc.nextLine();

		String[] separado = palabra.split("");

		for (String i : separado) {

			System.out.println(i);
		}

	}

}
