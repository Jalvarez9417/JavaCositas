package ejercicio11;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws SQLException, PedidoException, NotFoundException {
		Scanner sc = new Scanner(System.in);
		Boolean menu;
		PedidosService pedidoService = new PedidosService();
		Pedido pedido = new Pedido();
		PedidoLinea pedidoLinea = new PedidoLinea();
		List<PedidoLinea> pedidos = new ArrayList<>();
		do {
			menu = true;
			System.out.println("Que opción quieres?");
			System.out.println("\t(a)- Crear nuevo Pedido");
			System.out.println("\t(b)- Ver pedido");
			System.out.println("\t(c)- Cambiar Fecha entrega");
			System.out.println("\t(d)- Salir");
			String opcion = sc.nextLine();

			if (opcion.equalsIgnoreCase("a")) {
				pedido = obtenerDatosPedido(sc);
				pedidoService.crearPedidoCompleto(pedido);

			} else if (opcion.equalsIgnoreCase("b")) {
				System.out.println("Has elegido ver Perdido");
				System.out.println("Que numero de pedido quieres ver?");
				Integer npedido = sc.nextInt();
				sc.nextLine();
				try {
					System.out.println(pedidoService.consultarPedidoCompleto(npedido));
				} catch (NotFoundException e) {
					e.printStackTrace();
				} catch (PedidoException e) {
					e.printStackTrace();
				}
			} else if (opcion.equalsIgnoreCase("c")) {
				System.out.println("Has seleccionado Cambiar Fecha entrega");
				System.out.println("Dame numero del pedido");
				Integer nPedido = sc.nextInt();
				sc.nextLine();
				System.out.println("Dame fecha de pedido (dd/MM/yyyy)");
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				pedidoService.cambiarFechaEntrega(nPedido, LocalDate.parse(sc.nextLine(), format));

			} else if (opcion.equalsIgnoreCase("d")) {
				System.out.println("Has elegido Salir");
				menu = false;

			} else {
				System.out.println("Esa opción no existe");
			}
		} while (menu);

		sc.close();
	}

	private static Integer obtenerNumeroPedido(Scanner sc) {
		System.out.println("Dame nmero pedido");
		Integer numPedido = sc.nextInt();
		sc.nextLine();
		return numPedido;
	}

	private static Pedido obtenerDatosPedido(Scanner sc) {
		Pedido pedido = new Pedido();
		pedido.setNumero(obtenerNumeroPedido(sc));

		System.out.println("Dame cliente del pedido");
		pedido.setCliente(sc.nextLine());

		System.out.println("Dame fecha de pedido (dd/MM/yyyy)");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		pedido.setFechaEntrega(LocalDate.parse(sc.nextLine(), format));

		System.out.println("Dame nmero de artculos");
		Integer cant = sc.nextInt();
		sc.nextLine();

		List<PedidoLinea> lineas = new ArrayList<>();
		for (int i = 0; i < cant; i++) {
			PedidoLinea linea = new PedidoLinea();
			System.out.println("Dame el articulo de la lnea " + (i + 1));
			linea.setArticulo(sc.nextLine());
			System.out.println("Dame la cantidad de articulos de la lnea " + (i + 1));
			linea.setCantidad(sc.nextInt());
			System.out.println("Dame el precio de articulo de la lnea " + (i + 1));
			linea.setPrecioUnitario(sc.nextBigDecimal());
			sc.nextLine();
			lineas.add(linea);
		}
		pedido.setPedido(lineas);
		return pedido;

	}

}
