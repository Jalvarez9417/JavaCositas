package ejercicio44_AsesinoParasito;

import java.util.Objects;

public abstract class Personaje {
	private String codigo;
	private String nombre;
	protected Integer vida;

	public abstract Integer getDaño();

	public abstract Integer getPeriodoSegundosDaño();

	public void serDañado(Personaje atacante) {
		vida = vida - atacante.getDaño();
	}

	public Integer getVida() {
		return vida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Personaje [codigo=" + codigo + ", nombre=" + nombre + ", vida=" + vida + "]";
	}

}
