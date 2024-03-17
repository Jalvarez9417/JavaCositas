package ejercicios.ejercicio18al24;

public class Alumno extends Persona {
	private String dni;
	private Integer nota;
	private Curso curso;
	
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
	
	
	

	

	
	
}
