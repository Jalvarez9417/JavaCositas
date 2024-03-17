package paquete;

import java.util.Random;
import java.util.Scanner;

public class DadosDel1Al6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Cuántas veces quieres tirar el dado?");
		int veces = sc.nextInt();

		for (int i = 0; i < veces; i++) {
			int aleatorio = rand.nextInt(1, 7);

			System.out.print(aleatorio+" ");
		}
		sc.close();
	}

}
