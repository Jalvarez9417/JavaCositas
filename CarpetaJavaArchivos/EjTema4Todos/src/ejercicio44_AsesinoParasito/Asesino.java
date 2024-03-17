package ejercicio44_AsesinoParasito;

public class Asesino extends Personaje{

	public Asesino() {
		vida = 100;
	}
	
	@Override
	public Integer getDaño() {
		return 10;
	}

	@Override
	public Integer getPeriodoSegundosDaño() {
		return 5;
	}

	
}
