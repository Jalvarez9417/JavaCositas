package ejercicio44_AsesinoParasito;

public class Parasito extends Personaje {

	public Parasito() {
		vida = 200;
	}

	@Override
	public Integer getDaño() {
		return 2;
	}

	@Override
	public Integer getPeriodoSegundosDaño() {
		return 1;
	}

}
