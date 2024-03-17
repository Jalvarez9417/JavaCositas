package examen.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen.modelo.Articulo;

public class ArticulosService {

	public List<Articulo> consultarArticulosPorPrecio(BigDecimal filtro)
			throws SinArticulosException, ErrorArticuloException {

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		List<Articulo> articulos = new ArrayList<>();
		try {
			Conectar conexion = new Conectar();
			conn = conexion.getConnection();

			stmt = conn.createStatement();

			String sql = "SELECT * FROM articulos where precio < " + filtro;
			rs = stmt.executeQuery(sql);
			int cantidad = stmt.executeUpdate(sql);
			if (cantidad == 0) {
				throw new SinArticulosException("No hay articulos con precio inferior al indicado");
			}

			if (rs.next()) {
				Integer codigo = rs.getInt("codigo");
				String descripcion = rs.getString("articulo");
				BigDecimal precio = rs.getBigDecimal("precio");
				Integer stock = rs.getInt("stock");

				Articulo articulo = new Articulo();
				articulo.setCodigo(codigo);
				articulo.setDescipcion(descripcion);
				articulo.setPrecio(precio.setScale(2, RoundingMode.HALF_UP));
				articulo.setStock(stock);
				articulos.add(articulo);
			}
		} catch (SQLException e) {
			throw new ErrorArticuloException();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return articulos;
	}

	public void actualizarStockArticulo(Articulo articulo) throws SinArticulosException, ErrorArticuloException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Conectar conexion = new Conectar();

			conn = conexion.getConnection();
			String sql = "UPDATE articulos SET codigo=?, descripcion=?, precio=?,stock = ? WHERE codigo = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, articulo.getCodigo());
			stmt.setString(2, articulo.getDescipcion());
			stmt.setBigDecimal(3, articulo.getPrecio());
			stmt.setInt(4, articulo.getStock());
			stmt.setInt(5, articulo.getCodigo());

			Integer cantActualizada = stmt.executeUpdate();
			if (cantActualizada == 0) {
				throw new SinArticulosException("El articulo indicado no existe en BDD");
			} else {
				System.out.println("Se ha actualizado correctamente");
			}
		} catch (SQLException e) {
			throw new ErrorArticuloException("Error", e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
