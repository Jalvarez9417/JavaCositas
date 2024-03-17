package ejercicios.ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dame la cadena número " + i);
			String cadena = sc.nextLine();
			lista.add(cadena);
		}
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		System.out.println(lista);
		
		if (lista.contains("")) {
			System.out.println("La lista contiene alguna cadena vacía");
		}
		else {
			System.out.println("No hay cadenas vacía");
		}
		
//		for (Iterator<String> it = lista.iterator(); it.hasNext();) {
//			String siguiente = it.next();
//			if (siguiente.length()<6) {
//				it.remove();
//			}
//		}
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String siguiente = it.next();
			if (siguiente.length()<6) {
				it.remove();
			}
		}
		System.out.println(lista);
		
		
		sc.close();
	}
}






