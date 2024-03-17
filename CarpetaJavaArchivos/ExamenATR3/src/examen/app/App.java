package examen.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import examen.modelo.Articulo;
import examen.modelo.Empleado;
import examen.modelo.Gerente;
import examen.modelo.Tienda;
import examen.service.ArticulosService;
import examen.service.ErrorArticuloException;
import examen.service.SinArticulosException;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numeroTienda = 0;
		do {
			System.out.println("Dime un numero para la tienda(entre 1 y 20)");
			try {
				numeroTienda = sc.nextInt();
			} catch (Exception e) {
				System.err.println("No es un numero valido");
			}

		} while (numeroTienda > 20 || numeroTienda < 1);

		Tienda tienda = new Tienda(numeroTienda);

		ArticulosService articulosService = new ArticulosService();
		try {
			tienda.setArticulos(articulosService.consultarArticulosPorPrecio(new BigDecimal(4)));
		} catch (SinArticulosException | ErrorArticuloException e) {
			e.printStackTrace();
		}
		Empleado empleado1 = new Empleado("111A", LocalDate.of(2022, 05, 15));
		empleado1.setSueldo(new BigDecimal(20000));
		Empleado empleado2 = new Empleado("222B", LocalDate.of(2013, 11, 28));
		empleado2.setSueldo(new BigDecimal(20000));
		Gerente gerente1 = new Gerente("333C", LocalDate.of(2021, 12, 9));
		gerente1.setSueldo(new BigDecimal(25000));
		Gerente gerente2 = new Gerente("444D", LocalDate.of(2008, 01, 15));
		gerente2.setSueldo(new BigDecimal(35000));

		System.out.println("Coste total del personal de la tieda: " + tienda.getCostePersonal());
		List<Empleado> listaAniversario = tienda.getEmpleadosAniversario();
		System.out.println("Lista de empleados con aniversario: " + listaAniversario);
		Articulo articulo = tienda.getArticuloMasBarato();
		System.out.println("Articulo mas barato: " + articulo);
		Map<Integer, Integer> mapa = tienda.getMapaArticulosEnStock();
//		for (Articulo i : mapa.size()) {
//			if (articulo.getCodigo() == i) {
//
//			}
//
//		}
		Articulo articuloActualizar = new Articulo();
		articulo.setCodigo(13);
		try {
			articulosService.actualizarStockArticulo(articuloActualizar);
		} catch (SinArticulosException e) {
			e.printStackTrace();
		} catch (ErrorArticuloException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
