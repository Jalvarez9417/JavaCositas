package paquete;

import java.util.Scanner;

public class cada5SaltodeLinea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto;

		System.out.println("Dime un Texto");
		texto = scanner.nextLine();

		Integer x = 0;
		Integer y = 5;

		while (y <= texto.length()) {
			System.out.println(texto.substring(x, y));

			x = x + 5;
			y = y + 5;
		}
		System.out.println(texto.substring(x));
	}

}
