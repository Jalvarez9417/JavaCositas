package ejercicios.ejercicio38;

import ejercicios.ejercicio37.ColaCadenas;

public class PilaCadenas2 extends ColaCadenas{

	public PilaCadenas2() {
		super();
	}
	
	@Override
	public String sacarCadena() {
		if (cola.isEmpty()) {
			return null;
		}
		String masReciente = cola.get(cola.size()-1);
		cola.remove(cola.size()-1);
		return masReciente;
	}
}
