package ejercicios.ejercicio18al24;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el DNI");
		String dni = sc.nextLine();
		Alumno a = new Alumno(dni);
		System.out.println("Dime el nombre");
		a.setNombre(sc.nextLine());
		System.out.println("Dime la edad");
		a.setEdad(sc.nextInt());
		System.out.println("Dime la nota");
		a.setNota(sc.nextInt());
		
		// Pedimos los datos del curso
		System.out.println("Dime el identificador del curso");
		Integer idCurso = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime la descripción del curso");
		String desCurso = sc.nextLine();
		
		// Creamos un objeto curso y seteamos sus valores
		Curso c = new Curso();
		c.setIdentificador(idCurso);
		c.setDescripcion(desCurso);
		
		
		System.out.println(a);
		a.aprobar();
		System.out.println(a);
		
		Profesor profesor = new Profesor();
		System.out.println("Dime el nombre del profesor");
		profesor.setNombre(sc.nextLine());
		System.out.println("Dime la edad");
		profesor.setEdad(sc.nextInt());	
		
		System.out.println(profesor);
		
		sc.close();
	}
	
}
