package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private Guionista guionista;
	private Director director;
	private String titulo;
	private List<Actor> actores;
	private Integer añoEstreno;

	public Pelicula() {
		actores = new ArrayList<>();
	}

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

}
