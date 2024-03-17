package ejercicio11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

	public Connection getConnection() throws SQLException {
		String urlConexion = "jdbc:mariadb://localhost:3306/programacion";
		String claseDriver = "org.mariadb.jdbc.Driver";
		String usuario = "programacion";
		String password = "programacion";

		try {
			Class.forName(claseDriver);
			return DriverManager.getConnection(urlConexion, usuario, password);
		} catch (ClassNotFoundException e) {
			System.err.println("No se ha encontrado la clase del driver" + claseDriver);
			throw new SQLException("No se ha encontrado la clase del driver", e);
		}

	}
}
