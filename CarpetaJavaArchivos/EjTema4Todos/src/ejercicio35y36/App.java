package ejercicios.ejercicio35y36;

import java.util.List;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Curso curso = new Curso();
		curso.setIdentificador(1);
		curso.setDescripcion("DAM-DAW");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(">> Alumno en la posición " + i);
			Alumno a;
			do {
				System.out.println("Dime el DNI");
				String dni = sc.nextLine();
				a = new Alumno(dni);
			}
			while(!a.validarDni());
		
			curso.addAlumno(a);
			System.out.println("Dime el nombre");
			a.setNombre(sc.nextLine());
			System.out.println("Dime la edad");
			a.setEdad(sc.nextInt());
			System.out.println("Dime la nota");
			a.setNota(sc.nextInt());
			sc.nextLine();
			a.setCurso(curso);
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
		
		List<Alumno> alumnos = curso.getAlumnos();
		if (alumnos.get(0).equals(alumnos.get(1))
				|| alumnos.get(0).equals(alumnos.get(2))
				|| alumnos.get(1).equals(alumnos.get(2))){
			System.out.println("Hay alumnos repetidos!!");
		}
		else {
			System.out.println("No hay alumnos repetidos");
		}
		
		
		sc.close();
	}
	
}
