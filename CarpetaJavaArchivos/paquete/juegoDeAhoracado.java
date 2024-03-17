package paquete;

import java.util.Random;
import java.util.Scanner;

public class juegoDeAhoracado {
	public static void main(String[] args) {
		boolean a = false;
		do {
			Random random = new Random();
			Scanner sc = new Scanner(System.in);

			String[] array = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero",
					"sofisticado", "terremoto", "culinario", "teclado", "primavera" };

			Integer aleatorio = random.nextInt(0, 10);

			String palabra = array[aleatorio];

			System.out.println(palabra);

			String[] separado = palabra.split("");

			String[] usuario = new String[palabra.length()];

			usuario[0] = separado[0];

			for (int i = 1; i < usuario.length; i++) {
				usuario[i] = "_";

				Integer cont = 0;
			}
			int cont = 0;

			for (int i = 0; i < usuario.length; i++) {
				System.out.print(usuario[i]);
			}

			do {

				System.out.println();
				System.out.println("Dime una letra");
				String letra = sc.nextLine();

				for (int i = 0; i < separado.length; i++) {

					if (letra.equals(separado[i])) {
						usuario[i] = letra;
						a = true;

					}
					System.out.print(usuario[i]);

				}
				System.out.println();

				// Aumenta contador si falla
				if (a == false) {
					cont++;
				} else {

				}

				for (int i = 0; i < usuario.length; i++) {

					if (usuario[i].equals("_")) {

						a = false;
					}

				}
				int resultado = 0;

				if (a == true) {
					System.out.println("Has ganado");
					resultado = 10 - cont;
					System.out.println("Tu puntuacion es de:" + resultado);

					break;
				} else {

				}

				if (cont == 10) {
					System.out.println("GAME OVER");
					a = false;
					break;
				} else {

				}

			} while (cont < 10 || a == false);

			if (a == false) {
				System.out.println("Repetimos de Nuevo");
			} else {

			}

		} while (a == false);

	}

}
