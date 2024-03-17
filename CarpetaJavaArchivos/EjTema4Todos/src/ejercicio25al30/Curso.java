package ejercicios.ejercicio25al30;

public class Curso {

	private Integer identificador;
	private String descripcion;
	private Alumno[] alumnos;
	
	public Curso(Integer numAlumnos) {
		alumnos = new Alumno[numAlumnos];
	}
	
	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}
			
		}
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}
	
	
}
