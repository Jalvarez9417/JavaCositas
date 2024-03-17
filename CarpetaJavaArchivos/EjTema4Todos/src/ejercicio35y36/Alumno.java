package ejercicios.ejercicio35y36;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;
	private Integer nota;
	private Curso curso;

	public Alumno(String dni) {
		super();
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void aprobar() {
		if (nota == null || nota < 5) {
			nota = 5;
		}
	}

	public Boolean validarDni() {
		if (dni == null) {
			return false;
		}
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			return true;
		}
		return false;
		

	}

	public Boolean validar() {
		return (validarDni() 
				&& curso!=null 
				&& getNombre()!=null
				&& getNombre().length() >= 10
				&& getEdad() != null
				&& getEdad() >= 12
				&& getEdad() <= 65);
	}
	
	
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
