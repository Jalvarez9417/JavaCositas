package ejercicios.ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BigDecimal> numeros = new ArrayList<>();

		
		while (numeros.size() < 5) {
			System.out.println("Dame un número decimal");
			BigDecimal numero = sc.nextBigDecimal();
			if (!numeros.isEmpty()) {
				BigDecimal ultimo = numeros.get(numeros.size()-1);
				if (numero.compareTo(ultimo) > 0) {
					numeros.add(numero);
				}
				else {
					System.out.println("No es válido. Tiene que ser mayor al anterior");
				}
			}
			else {
				numeros.add(numero);
			}
		}
		
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal x : numeros) {
			suma = suma.add(x);
		}
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(suma);
		
		BigDecimal division = numeros.get(0).divide(numeros.get(1), 3, RoundingMode.HALF_UP);
		System.out.println(division);
		
		sc.close();
		
		
		
		
	}
	
	
	
}
