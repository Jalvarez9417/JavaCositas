package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Actor actorBlas = new Actor("Blas Blau", 1983, "Espa�a");
		Actor actorLaura = new Actor("Laura Pozo", 1981, "Italia");
		Actor actorMarcel = new Actor("Marcel Cade", 2001, "Suiza");
		Actor actorVioleta = new Actor("Violeta Volo", 1999, "Rusia");

		Director directora = new Director("Sara Marea", 1994, "Portugal");

		Guionista guionistaMarco = new Guionista("Marco Smith", 1988, "Reino Unido");
		Guionista guionistaSheng = new Guionista("Cheng Shu", 1977, "China");

		Pelicula peli1 = new Pelicula();
		peli1.setAñoEstreno(2027);
		peli1.setTitulo("Do you know Joe Blas?");
		peli1.setDirector(directora);
		peli1.setGuionista(guionistaMarco);

		peli1.getActores().add(actorBlas);
		peli1.getActores().add(actorLaura);

		Pelicula peli2 = new Pelicula();
		peli2.setAñoEstreno(2027);
		peli2.setTitulo("Muerte en la sombra");
		peli2.setDirector(directora);
		peli2.setGuionista(guionistaSheng);
		peli2.getActores().add(actorBlas);
		peli2.getActores().add(actorLaura);
		peli2.getActores().add(actorMarcel);
		peli2.getActores().add(actorVioleta);

		System.out.println(peli1.getActores());

		System.out.println(peli1.getGuionista().getSueldo());
		System.out.println(peli1.getGuionista().getAñoNacimiento());

		peli2.getActores().remove(actorMarcel);
		peli1.getActores().add(actorMarcel);

		System.out.println(peli1.getActores());
		System.out.println(peli2.getActores());

	}

}
