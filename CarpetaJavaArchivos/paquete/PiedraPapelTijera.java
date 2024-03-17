package paquete;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String eleccionUsuario;
		String eleccionUsu;
		String siOno;

		int derrota = 0;
		int victoria = 0;

		do {

			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");

			int eleccionM = (int) (Math.random() * 3) + 1;
			System.out.println("La Maquina ya ha elegido.");

			System.out.println("¿Que eliges? Piedra, Papel, Tijera: ");
			eleccionUsuario = sc.nextLine();

			eleccionUsu = eleccionUsuario.toLowerCase();

			System.out.print("La Maquina habia elegido: ");
			switch (eleccionM) {

			case 1:

				System.out.println("Piedra");

				switch (eleccionUsu) {

				case "piedra":

					System.out.println("Empate!");
					break;
				case "papel":

					System.out.println("Has ganado!");
					victoria = victoria + 1;
					break;
				case "tijera":

					System.out.println("La Maquina gana!");
					derrota = derrota + 1;
					break;
				}
				break;

			case 2:

				System.out.println("Papel");

				switch (eleccionUsu) {

				case "piedra":

					System.out.println("La Maquina gana!");
					derrota = derrota + 1;
					break;
				case "papel":

					System.out.println("Empate!");
					break;
				case "tijera":

					System.out.println("Has ganado!");
					victoria = victoria + 1;
					break;
				}

				break;

			case 3:

				System.out.println("Tijera");

				switch (eleccionUsu) {

				case "piedra":

					System.out.println("Has ganado!");
					victoria = victoria + 1;
					break;
				case "papel":

					System.out.println("La Maquina gana!");
					derrota = derrota + 1;
					break;
				case "tijera":

					System.out.println("Empate!");
					break;
				}
				break;
			}
			System.out.println("Quieres jugar otra partida?");
			siOno = sc.nextLine();

		} while (siOno.contains("si"));
		System.out.println("Tu marcador de Victorias y Derrotas es de: ");
		System.out.println("Victorias: " + victoria);
		System.out.println("Derrotas: " + derrota);

		sc.close();
	}

}
