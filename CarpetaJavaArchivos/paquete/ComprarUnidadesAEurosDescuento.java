package paquete;

import java.util.Scanner;

public class ComprarUnidadesAEurosDescuento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer unidades;
		double precio;

		System.out.println("¿Cuantas unidades ha comprado?");
		unidades = scanner.nextInt();

		System.out.println("¿A que precio?");
		precio = scanner.nextDouble();

		if (unidades < 10) {
			double total0;
			total0 = unidades * precio;
			double descuento0 = total0 ;
			System.out.println("Subtotal= "+unidades+" x "+precio+"= "+ total0+ " euros");
			System.out.println();
		System.out.println("Total= " + unidades + "-" + descuento0 + "=" + (total0 - descuento0) + " euros");
		
		} else if (unidades <= 24 && unidades > 10) {
			double total1;
			total1 = unidades * precio;
			double descuento1 = total1 * 0.20 ;
			System.out.println("Subtotal= "+unidades+" x "+precio+"= "+ total1+ " euros");
			System.out.println("Descuento= "+"20%de "+total1+" =");
			System.out.println("Total= " + unidades + "-" + descuento1 + "=" + (total1 - descuento1) + " euros");
		}
		else if(unidades<100 && unidades>24) {
			double total2;
			total2 = unidades * precio;
			double descuento2 = total2 * 0.20 ;
			System.out.println("Subtotal= "+unidades+" x "+precio+"= "+ total2+ " euros");
			System.out.println("Descuento= "+ "");
			System.out.println("Total= " + unidades + "-" + descuento2 + "=" + (total2 - descuento2) + " euros");
		}

		scanner.close();
	}

}
