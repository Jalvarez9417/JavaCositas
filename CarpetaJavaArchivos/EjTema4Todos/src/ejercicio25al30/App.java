package ejercicios.ejercicio25al30;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Curso curso = new Curso(3);
		curso.setIdentificador(1);
		curso.setDescripcion("DAM-DAW");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(">> Alumno en la posición " + i);
			Alumno alumno;
			do {
				System.out.println("Dime el DNI");
				String dni = sc.nextLine();
				alumno = new Alumno(dni);
			}
			while(!alumno.validarDni());
		
			System.out.println("Dime el nombre");
			alumno.setNombre(sc.nextLine());
			System.out.println("Dime la edad");
			alumno.setEdad(sc.nextInt());
			System.out.println("Dime la nota");
			alumno.setNota(sc.nextInt());
			sc.nextLine();
			alumno.setCurso(curso);
			
			curso.addAlumno(alumno);
		}
		
		System.out.println("Lista de alumnos:");
		for (Alumno alumno : curso.getAlumnos()) {
			System.out.println(alumno);
			if (alumno.validar()) {
				System.out.println("Este alumno es válido");
			}
			else {
				System.out.println("Este alumno no es válido");
			}
		}
		
		Alumno[] alumnos = curso.getAlumnos();
		if (alumnos[0].equals(alumnos[1])
				|| alumnos[0].equals(alumnos[2])
				|| alumnos[1].equals(alumnos[2])){
			System.out.println("Hay alumnos repetidos!!");
		}
		else {
			System.out.println("No hay alumnos repetidos");
		}
		
		
		sc.close();
	}
	
}
