package ejercicio44_AsesinoParasito;

public class App {

	public static void main(String[] args) {
		Jugador jugador = new Jugador();
		EquipoCombate equipo = new EquipoCombate();
		jugador.setNombre("Mario");
		jugador.setEquipo(equipo);
		Asesino a1 = new Asesino();
		Asesino a2 = new Asesino();
		Asesino a3 = new Asesino();
		a1.setCodigo("01");
		a2.setCodigo("02");
		a3.setCodigo("03");
		a1.setNombre("Asesino 1");
		a2.setNombre("Asesino 2");
		a3.setNombre("Asesino 3");
		equipo.addPersonaje(a1);
		equipo.addPersonaje(a2);
		equipo.addPersonaje(a3);
		
		Parasito p = new Parasito();
		p.setCodigo("B69");
		p.setNombre("Blas");
		System.out.println("Da�o " + p.getDaño() + " cada " + p.getPeriodoSegundosDaño() + " seg.");
		
		jugador.getEquipo().addPersonaje(p);

		System.out.println("Vida equipo " + jugador.getEquipo().getVida());
		
		jugador.getEquipo().addPersonaje(p);
		
		System.out.println(equipo);
		
		Parasito p2 = new Parasito();
		p2.setCodigo("B61");
		p2.setNombre("Blas22");
		Parasito p3 = new Parasito();
		p3.setCodigo("B62");
		p3.setNombre("Blas23");
		jugador.getEquipo().addPersonaje(p2);
		jugador.getEquipo().addPersonaje(p3);
		
		System.out.println(equipo);
		
		System.out.println("Vida equipo " + jugador.getEquipo().getVida());
		
	}

}





