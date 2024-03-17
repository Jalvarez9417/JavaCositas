package ejercicios.ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private String numCuenta;
	private List<Movimiento> movimientos;
	
	public CuentaAhorros(String numCuenta) {
		movimientos = new ArrayList<>();
		this.numCuenta = numCuenta;
	}
	
	public void addMovimiento(Movimiento mov) {
		movimientos.add(mov);
	}
	
	public BigDecimal getTotal() {
		BigDecimal saldoTotal = BigDecimal.ZERO;
		for (Movimiento movimiento : movimientos) {
			saldoTotal = saldoTotal.add(movimiento.getOperacion());
		}
		return saldoTotal.setScale(2, RoundingMode.HALF_DOWN);
	}
	
	public List<String> getMovimientosString(){
		List<String> resultado = new ArrayList<>();
		for (Movimiento mov : movimientos) {
			resultado.add(mov.toString());
		}
		return resultado;
	}
	
	public List<String> getMovimientosCargoString(){
		List<String> resultado = new ArrayList<>();
		for (Movimiento mov : movimientos) {
			if (mov instanceof Cargo) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}
	public List<String> getMovimientosRetiradaString(){
		List<String> resultado = new ArrayList<>();
		for (Movimiento mov : movimientos) {
			if (mov instanceof Retirada) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}
	public List<String> getMovimientosIngresoString(){
		List<String> resultado = new ArrayList<>();
		for (Movimiento mov : movimientos) {
			if (mov instanceof Ingreso) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	
}




