package paquete;

import java.util.Scanner;

public class NombreyNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuntos alumnos hay en clase?");
		Integer cantAlumnos = scanner.nextInt();
		scanner.nextLine();

		Integer[] notas = new Integer[cantAlumnos];
		String[] nombres = new String[cantAlumnos];
		Integer sumaNotas;

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Cul es el nombre el alumno " + (i + 1));
			String nombre = scanner.nextLine();
			nombres[i] = nombre;
			sumaNotas = 0;
			for (int examen = 1; examen <= 3; examen++) {
				System.out.println("Cul es la nota de " + nombre + " para el examen " + examen + "?");
				sumaNotas += scanner.nextInt();
			}
			scanner.nextLine();
			notas[i] = sumaNotas / 3;
		}
		System.out.println("LISTADO DE NOTAS");
		sumaNotas = 0;
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("\tAlumno: " + nombres[i] + " - Nota media: " + notas[i]);
			sumaNotas += notas[i];
		}
		System.out.println("Media de los alumnos: " + (sumaNotas / cantAlumnos));

		scanner.close();

	}

}
