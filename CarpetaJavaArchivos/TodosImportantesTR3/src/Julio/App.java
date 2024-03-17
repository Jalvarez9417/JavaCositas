package Julio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String grupo;
		do {
			System.out.println("Dime un grupo que quieres qu actue: ");
			grupo = sc.nextLine();
		} while (grupo.isBlank()); // TODO: ABEL: sería isEmpty()

		Concierto con1 = new Concierto(grupo);

		LocalDate fechaMas1Año = con1.getFechaCelebracion().plusYears(1);

		con1.setFechaCelebracion(fechaMas1Año);

		EntradaNormal entNormal1 = new EntradaNormal(111);
		entNormal1.setEmpresa("TicketMaster");
		entNormal1.setVendida(true);

		EntradaNormal entNormal2 = new EntradaNormal(222);
		entNormal2.setEmpresa("TicketMaster");

		EntradaSubvencionada entSub1 = new EntradaSubvencionada(333);

		entSub1.setEmpresa("CEUAndalucia");
		entSub1.setSuplemento(new BigDecimal("0.20"));

		List<Entrada> entradas = new ArrayList<>();
		entradas.add(entNormal1);
		entradas.add(entNormal2);
		entradas.add(entSub1);

		con1.setEntradas(entradas);
		BigDecimal precio = new BigDecimal("0");
		BigDecimal precioMax = new BigDecimal("200");

		// do {
		System.out.println("Dime el precio de los asientos: ");
		precio = sc.nextBigDecimal();
		// } while (precio>precioMax); No se porque no me funciona // TODO: ABEL: porque para comparar BigDecimal tienes que usar compareTo

		con1.cambiarPrecioEstandarEntradas(precio);

		System.out.println(con1);
		System.out.println("Meses Restantes: " + con1.getMesesRestantes()); 
		// TODO: ABEL: te faltan algunas llamadas 
		System.out.println("Lista entradas sin vender: " + con1.getListaEntradasSinVender());
		System.out.println("Total Recaudacion: " + con1.getTotalRecaudacion());
		con1.eliminarEntradasComercializadora("TicketMaster");
		System.out.println("Entrada mas economica" + con1.getEntradaMasEconomica());

		sc.close();
	}
}
