package ejercicio11;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidosService {

	public List<PedidoLinea> consultarLineasPedido(Integer filtro) throws SQLException {

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		List<PedidoLinea> pedidos = new ArrayList<>();
		try {
			Conectar conexion = new Conectar();
			conn = conexion.getConnection();

			stmt = conn.createStatement();

			String sql = "SELECT * FROM pedidos_lineas where numero_pedido = " + filtro;

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Integer numeroPedido = rs.getInt("numero_pedido");
				String articulo = rs.getString("articulo");
				Integer cantidad = rs.getInt("cantidad");
				BigDecimal precioUnitario = rs.getBigDecimal("precio_unitario");

				PedidoLinea pedidoLinea = new PedidoLinea();
				pedidoLinea.setNumeroPedido(numeroPedido);
				pedidoLinea.setArticulo(articulo);
				pedidoLinea.setCantidad(cantidad);
				pedidoLinea.setPrecioUnitario(precioUnitario.setScale(2, RoundingMode.HALF_UP));
				pedidos.add(pedidoLinea);

			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return pedidos;
	}

	public Pedido consultarPedidoCompleto(Integer filtro) throws NotFoundException, PedidoException {
		Pedido pedido = new Pedido();

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		try {
			Conectar conexion = new Conectar();
			conn = conexion.getConnection();

			stmt = conn.createStatement();

			String sql = "SELECT * FROM pedidos where numero = " + filtro;

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				Integer numero = rs.getInt("numero");
				String cliente = rs.getString("cliente");
				Date fechaEntrega = rs.getDate("fecha_Entrega");

				pedido.setNumero(numero);
				pedido.setCliente(cliente);
				pedido.setFechaEntrega(fechaEntrega.toLocalDate());
				pedido.setPedido(consultarLineasPedido(filtro));
				pedido.calcularTotales();
			} else {
				throw new NotFoundException();
			}
		} catch (SQLException e) {
			throw new PedidoException();
		} finally {

			try {
				rs.close();
			} catch (SQLException e) {

			}

			try {
				stmt.close();
			} catch (SQLException e) {

			}

			try {
				conn.close();
			} catch (SQLException e) {

			}

		}
		return pedido;
	}

	public void insertarLineaPedido(Connection conn, PedidoLinea pedidoLinea) throws SQLException {
		PreparedStatement stmt = null;

		try {

			String sql = "INSERT INTO pedidos_lineas VALUES (?,?,?,?)";

			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, pedidoLinea.getNumeroPedido());
			stmt.setString(2, pedidoLinea.getArticulo());
			stmt.setInt(3, pedidoLinea.getCantidad());
			stmt.setBigDecimal(4, pedidoLinea.getPrecioUnitario().setScale(2, RoundingMode.HALF_UP));

			stmt.execute();
		} finally {

			if (stmt != null) {
				stmt.close();
			}

		}
	}

	public void crearPedidoCompleto(Pedido pedido) throws SQLException, PedidoException {
		Connection conn = null;

		PreparedStatement stmt = null;

		try {

			Conectar conexion = new Conectar();
			conn = conexion.getConnection();

			String sql = "INSERT INTO pedidos VALUES (?,?,?)";

			stmt = conn.prepareStatement(sql);
			conn.setAutoCommit(false);

			stmt.setInt(1, pedido.getNumero());
			stmt.setString(2, pedido.getCliente());
			stmt.setDate(3, Date.valueOf(pedido.getFechaEntrega()));

			stmt.execute();
			for (PedidoLinea pedidoLinea : pedido.getPedido()) {

				insertarLineaPedido(conn, pedidoLinea);
			}
			conn.commit();

		} catch (SQLException e) {
			conn.rollback();
			throw new PedidoException(e);
		} finally {

			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void cambiarFechaEntrega(Integer numPedido, LocalDate nuevaFecha) throws SQLException, PedidoException {
		Connection conn = null;

		PreparedStatement stmt = null;

		try {

			Conectar conexion = new Conectar();
			conn = conexion.getConnection();

			String sql = "UPDATE pedidos set fecha_entrega=? where numero=?";

			stmt = conn.prepareStatement(sql);

			stmt.setDate(1, Date.valueOf(nuevaFecha));
			stmt.setInt(2, numPedido);

			int cantidad = stmt.executeUpdate();
			if (cantidad == 0) {
				throw new PedidoException("No existe ningun regitro con numero de pedido: " + numPedido);
			} else {
				System.out.println("Registro Actualizado correctamente");

			}

		} finally {

			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
