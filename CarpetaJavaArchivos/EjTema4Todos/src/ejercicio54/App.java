package ejercicios.ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class App {

	public static void main(String[] args) {
		CuentaAhorros cuenta = new CuentaAhorros("3240129387409182");
		System.out.println(cuenta.getTotal());
		
		Cargo c1 = new Cargo();
		c1.setCif("32423X");
		c1.setFecha(LocalDate.of(2023, 2, 28));
		c1.setImporte(new BigDecimal(200));
		Cargo c2 = new Cargo();
		c2.setCif("09999F");
		c2.setFecha(LocalDate.of(2023, 3, 2));
		c2.setImporte(new BigDecimal(63));
		
		Ingreso i1 = new Ingreso();
		i1.setFecha(LocalDate.of(2023, 2, 28));
		i1.setImporte(new BigDecimal(2923));
		i1.setDescripcion("Pago cuota tlfno");
		Ingreso i2 = new Ingreso();
		i2.setFecha(LocalDate.of(2023, 1, 30));
		i2.setImporte(new BigDecimal(393.98));
		i2.setDescripcion("Pago cuota gimnasio");
		
		Retirada r1 = new Retirada();
		r1.setFecha(LocalDate.of(2023, 1, 31));
		r1.setImporte(new BigDecimal(84.92));
		
		cuenta.addMovimiento(c1);
		cuenta.addMovimiento(c2);
		cuenta.addMovimiento(i1);
		cuenta.addMovimiento(i2);
		cuenta.addMovimiento(r1);
		
		System.out.println(cuenta.getTotal());
		
		List<String> movimientos = cuenta.getMovimientosString();
		for (String mov : movimientos) {
			System.out.println(mov);
		}
		movimientos = cuenta.getMovimientosIngresoString();
		System.out.println("Ingresos:");
		for (String mov : movimientos) {
			System.out.println(mov);
		}
		movimientos = cuenta.getMovimientosCargoString();
		System.out.println("Cargos:");
		for (String mov : movimientos) {
			System.out.println(mov);
		}
		movimientos = cuenta.getMovimientosRetiradaString();
		System.out.println("Retiradas:");
		for (String mov : movimientos) {
			System.out.println(mov);
		}
	}
}
