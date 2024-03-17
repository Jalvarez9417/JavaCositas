package paquete;

import java.util.Scanner;

public class asteriscosTamaño {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dimension de tablero quieres");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {

				if (i == k) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
