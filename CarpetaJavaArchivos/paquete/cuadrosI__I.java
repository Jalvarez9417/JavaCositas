package paquete;

import java.util.Scanner;

public class cuadrosI__I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Dime un numero");
		n = sc.nextInt();
		System.out.print(" ");
		
		int l=1;
		if ( l <= n) {
			
		for ( l = 1; l < n; l++) {
			System.out.print("___");
		}
			
		}
		System.out.print("__");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {

				System.out.print("|__");
			}

			System.out.println("|");
		}
		sc.close();
	}
}
