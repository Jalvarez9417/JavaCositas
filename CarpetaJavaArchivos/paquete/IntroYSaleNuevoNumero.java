package paquete;

import java.util.Scanner;

public class IntroYSaleNuevoNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1");

		for (int i = 2; i <= 10; i++) {
			System.out.println("Quieres otro número?");
			String s = sc.nextLine();
			System.out.println(i);
		}
		sc.close();
	}

}
