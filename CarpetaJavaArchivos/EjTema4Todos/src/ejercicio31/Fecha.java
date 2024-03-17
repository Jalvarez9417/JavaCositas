package ejercicios.ejercicio31;

public interface Fecha {

	public Boolean validar();
	public Integer getDia();
	public Integer getMes();
	public Integer getAño();
	public Integer getGmt();
	public String getFormato();
	public void setDia(Integer dia);
	public void setMes(Integer mes);
	public void setAño(Integer año);
	public void setGmt(Integer gmt);
	public void setFormato(String formato);
	public Boolean isMayor(Fecha fecha);
	public Boolean isMenor(Fecha fecha);
	public Integer restarFecha(Fecha fecha);
	public Boolean isBisiesto();
	public Boolean isFestivo();
	public void sumarDias(Integer dias);
	public Integer getNumSemana();
	public String toString();
	public boolean equals(Object o);
	
	
	
	
	
}
