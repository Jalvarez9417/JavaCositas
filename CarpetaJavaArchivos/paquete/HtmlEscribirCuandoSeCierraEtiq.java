package paquete;

import java.util.Scanner;

public class HtmlEscribirCuandoSeCierraEtiq {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe tu HTML");
		String html = scanner.nextLine();

		System.out.println("Texto extrado:");
		String[] caracteres = html.split("");
		Boolean etiquetaAbierta = false;
		Boolean textoEscrito = false;
		for (String caracter : caracteres) {
			if (caracter.equals("<")) {
				if (textoEscrito) {
					System.out.println();
				}
				textoEscrito = false;
				etiquetaAbierta = true;
			} else if (caracter.equals(">")) {
				etiquetaAbierta = false;
			} else if (!etiquetaAbierta) {
				System.out.print(caracter);
				textoEscrito = true;
			}
		}

		scanner.close();

	}

}
