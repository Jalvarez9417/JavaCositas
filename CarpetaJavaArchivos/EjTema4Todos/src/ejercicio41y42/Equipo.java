package ejercicios.ejercicio41y42;

import java.util.List;
import java.util.Objects;

public class Equipo {

	private String nombre;
	private Jugador capitan;
	private List<Jugador> jugadores;
	private static String competicion;
	
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador getCapitan() {
		return capitan;
	}
	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	public static String getCompeticion() {
		return competicion;
	}
	public static void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		String resultado =  nombre + " - Capit�n: " + capitan.getNombre() + " - Jugadores: " + jugadores; 
		return resultado;
	
	}
	
}
