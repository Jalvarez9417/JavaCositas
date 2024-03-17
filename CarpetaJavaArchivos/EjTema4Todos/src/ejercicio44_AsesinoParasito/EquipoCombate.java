package ejercicio44_AsesinoParasito;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {

	private List<Personaje> personajes;

	public EquipoCombate() {
		personajes = new ArrayList<>();
	}

	
	
	public List<Personaje> getPersonajes() {
		return personajes;
	}



	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}



	public void addPersonaje(Personaje personaje) {
		if (personajes.size() < 5 && !personajes.contains(personaje)) {
			personajes.add(personaje);
		}
	}

	public Integer getVida() {
		Integer suma = 0;
		for (Personaje personaje : personajes) {
			suma += personaje.getVida();
		}
		return suma;
	}

	@Override
	public String toString() {
		return "EquipoCombate [personajes=" + personajes + "]";
	}
	
	

}
