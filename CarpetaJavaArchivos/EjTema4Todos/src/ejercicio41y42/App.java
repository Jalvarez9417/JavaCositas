package ejercicios.ejercicio41y42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipoLocal = crearEquipo(sc);
		Equipo equipoVisitante = crearEquipo(sc);
		System.out.println(equipoLocal);
		System.out.println(equipoVisitante);
		
		Partido partido = new Partido();
		partido.setEquipoLocal(equipoLocal);
		partido.setEquipoVisitante(equipoVisitante);
		partido.setResultado(new Resultado());
		System.out.println(partido);
		
		System.out.println("Dame el resultado (goles locales)");
		partido.getResultado().setGolesLocales(sc.nextInt());
		System.out.println("Dame el resultado (goles visitantes)");
		partido.getResultado().setGolesVisitantes(sc.nextInt());
		
		System.out.println("Equipo ganador: " + partido.getEquipoGanador());
		
		Jugador jugador = new Jugador("Blas infiltrado", 99);
		equipoVisitante.getJugadores().add(jugador);
		System.out.println(equipoVisitante);
		
		Integer ultimoJugador = equipoLocal.getJugadores().size()-1;
		equipoLocal.setCapitan(equipoLocal.getJugadores().get(ultimoJugador));
		System.out.println(equipoLocal);
		
		equipoLocal.setCompeticion("Liga nacional");
		System.out.println(equipoVisitante.getCompeticion());
		equipoVisitante.setCompeticion("Copa internacional");
		System.out.println(equipoLocal.getCompeticion());
		
		sc.close();
	}
	
	public static Equipo crearEquipo(Scanner sc) {
		System.out.println("Dame nombre del equipo");
		String nombreEquipo = sc.nextLine();
		Equipo equipo = new Equipo(nombreEquipo);
		List<Jugador> jugadores = new ArrayList<>();
		equipo.setJugadores(jugadores);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Dame dorsal del jugador " + i);
			Integer dorsal = sc.nextInt();
			sc.nextLine();
			System.out.println("Dame nombre del jugador " + i);
			String nombreJugador = sc.nextLine();
			Jugador jugador = new Jugador(nombreJugador, dorsal);
			jugadores.add(jugador);
			if (i==1) {
				equipo.setCapitan(jugador);
			}
		}
		// alternativa para meter capitan
//		equipo.setCapitan(equipo.getJugadores().get(0)); 
		return equipo;
	}
}
