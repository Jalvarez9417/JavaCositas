package LocalDtes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pruebas {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();

		System.out.println(fecha);

		LocalDate fecha2 = fecha.withYear(2020);
		System.out.println(fecha2);
		fecha2 = LocalDate.of(2022, Month.APRIL, 8);
		System.out.println(fecha2);

		fecha2 = fecha2.plusDays(690);
		System.out.println(fecha2);

		Period p1 = fecha.until(fecha2);
		System.out.println("Fecha1 " + fecha);
		System.out.println("Fecha2 " + fecha2);

		System.out.println(p1);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String fechaCadena = fecha.format(formato);
		System.out.println(fechaCadena);
		

	}

}
