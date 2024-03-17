package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	protected List<String> cola;

	public ColaCadenas() {
		cola = new ArrayList<>();
	}

	public void añadirCadena(String cadena) {
		cola.add(cadena);
	}

	public String sacarCadena() {
		if (cola.isEmpty()) {
			return null;
		}
		String masAntiguo = cola.get(0);
		cola.remove(0);
		return masAntiguo;
	}

	public Integer getTamaño() {
		return cola.size();
	}

	@Override
	public String toString() {
		return cola.toString();
	}

}
