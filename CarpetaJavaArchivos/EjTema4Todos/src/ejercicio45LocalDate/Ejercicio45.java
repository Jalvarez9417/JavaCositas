package ejercicio45LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fechaNacimiento;
		LocalDate hoy = LocalDate.now();
		do {
			System.out.println("Dame tu fecha de nacimiento. Empieza por el dia:");
			Integer dia = sc.nextInt();
			System.out.println("Ahora el mes:");
			Integer mes = sc.nextInt();
			System.out.println("Ahora el año:");
			Integer año = sc.nextInt();
			fechaNacimiento = LocalDate.of(año, mes, dia);
			if (!fechaNacimiento.isBefore(hoy)) {
				System.out.println("Todavia no has nacido?? itentalo de nuevo");
			}
		} while (!fechaNacimiento.isBefore(hoy));

		if (fechaNacimiento.isLeapYear()) {
			System.out.println("Naciste en un a�o bisiesto");
		}
		System.out.println("Naciste un " + fechaNacimiento.getDayOfWeek());

		Period periodo = fechaNacimiento.until(hoy);
		System.out.println("Tienes " + periodo.getYears() + " años");

		LocalDate fechaDeceso = fechaNacimiento.plusYears(100);
		periodo = hoy.until(fechaDeceso);
		System.out.println("Te quedan " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y "
				+ periodo.getDays() + " dias");

		LocalTime hora = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("La hora es " + hora.format(formatter));

		sc.close();
	}

}
