package ejercicios.ejercicio32;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24H;

	public Reloj() {
		horas = 0;
		minutos = 0;
		segundos = 0;
		formato24H = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		formato24H = true;
	}

	public Boolean getFormato24H() {
		return formato24H;
	}

	public void setFormato24H(Boolean formato24h) {
		formato24H = formato24h;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	
	public Boolean check() {
		return ( horas >= 0 
				&& horas <= 23
				&& minutos >= 0
				&& minutos <= 59
				&& segundos >= 0
				&& segundos <= 59);
	}
	

	
	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		if (formato24H) {
			return getDobleDigito(horas) + ":" + getDobleDigito(minutos) + ":" + getDobleDigito(segundos);
		}
		if (horas<=12) {
			return getDobleDigito(horas) + ":" + getDobleDigito(minutos) + ":" + getDobleDigito(segundos) + " AM";
		}
		return getDobleDigito(horas-12) + ":" + getDobleDigito(minutos) + ":" + getDobleDigito(segundos) + " PM";
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
	
	
	
	
	
	
	private String getDobleDigito(Integer num) {
		if (num < 10) {
			return "0" + num;
		}
		return num.toString();
	}
	
//	@Override // ALTERNATIVA
//	public String toString() {
//		if (!check()) {
//			return "HORA INCORRECTA";
//		}
//		String parteFinal = "";
//		Integer horasCalculadas = horas;
//		
//		if (!formato24H) {
//			if (horas<=12) {
//				parteFinal = " AM";
//			}
//			else {
//				horasCalculadas = horas-12;
//				parteFinal = " PM";
//			}
//		}
//		return getDobleDigito(horasCalculadas) 
//				+ ":" + getDobleDigito(minutos) 
//				+ ":" + getDobleDigito(segundos) 
//				+ parteFinal;
//	}
}












