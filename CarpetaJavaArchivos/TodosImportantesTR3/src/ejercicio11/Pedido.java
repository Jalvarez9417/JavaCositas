package ejercicio11;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public class Pedido {
	private List<PedidoLinea> pedido;
	private Integer numero;
	private String cliente;
	private LocalDate fechaEntrega;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;

	public List<PedidoLinea> getPedido() {
		return pedido;
	}

	public void setPedido(List<PedidoLinea> pedido) {
		this.pedido = pedido;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public void calcularTotales() {
		subtotal = new BigDecimal("0");
		for (PedidoLinea pedidoLinea : pedido) {
			BigDecimal cantidad = new BigDecimal(pedidoLinea.getCantidad());
			BigDecimal importe = cantidad.multiply(pedidoLinea.getPrecioUnitario().setScale(2, RoundingMode.HALF_UP));
			subtotal = subtotal.add(importe);

		}
		iva = subtotal.multiply(new BigDecimal("0.21")).setScale(2, RoundingMode.HALF_UP);
		total = subtotal.add(iva);
	}

	@Override
	public String toString() {
		return "Pedido [pedido=" + pedido + ", numero=" + numero + ", cliente=" + cliente + ", fechaEntrega="
				+ fechaEntrega + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}

}
