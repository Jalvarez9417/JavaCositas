package ejercicios.ejercicio32;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		System.out.println(reloj);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dame la hora");
			Integer hora = sc.nextInt();
			System.out.println("Dame los minutos");
			Integer minutos = sc.nextInt();
			System.out.println("Dame los segundos");
			Integer segundos = sc.nextInt();
			reloj.ponerEnHora(hora, minutos, segundos);
			System.out.println(reloj);
		}
		while(!reloj.check());
		
		reloj.setFormato24H(false);
		System.out.println(reloj);
		
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);

		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		
		Reloj reloj2 = new Reloj(17, 16, 15);
		System.out.println(reloj2);
		
		if (reloj.equals(reloj2)) {
			System.out.println("Relojes iguales");
		}
		else {
			System.out.println("Relojes diferentes");
		}
		
		sc.close();
	}
	
	
}





