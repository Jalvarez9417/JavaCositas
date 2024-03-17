package paquete;

import java.util.Scanner;

public class MenuSumarRestarEtc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un nmero");
		int nmero1 = sc.nextInt();
		System.out.println("Dime otro nmero");
		int nmero2 = sc.nextInt();


		System.out.println("\t*** MENÚ ***");
		System.out
				.println("\t1. Sumar " + "\n\t2. Restar " + "\n\t3. Multiplicar" + "\n\t4. Dividir " + "\n\t0. Salir");
		int eleccion = sc.nextInt();

		while (eleccion > 4) {
			System.out.println("Esa opccion no es correcta, Elige otra: ");
			System.out.println(" 1. Abrir " + "\n 2. Guardar " + "\n 3. Modificar" + "\n 4. Salir");

			eleccion = sc.nextInt();
		}
		switch (eleccion) {
		case 1:
			System.out.println("Sumar");
			System.out.println(nmero1 + nmero2);
			break;

		case 2:
			System.out.println("Restar");
			System.out.println(nmero1 - nmero2);
			break;

		case 3:
			System.out.println("Multiplicar");
			System.out.println(nmero1 * nmero2);
			break;

		case 4:
			System.out.println("Dividir");
			if (nmero2 == 0) {
				System.out.println("La division no es posible");
			}
			System.out.println(nmero1 / nmero2);
			break;
		case 0:
			System.out.println("Salir");
			
			break;
		}

		sc.close();
	}

}
