package ejercicios.ejercicio33;

public class App {
	public static void main(String[] args) {
		Semaforo sema = new Semaforo();
		System.out.println(sema);
		
		sema.setColor("AZUL");
		System.out.println(sema);
		
		sema.setColor(Semaforo.COLOR_VERDE);
		System.out.println(sema);
		
		sema.setParpadeando(true);
		System.out.println(sema);
		
		sema.setColor(Semaforo.COLOR_AMBAR);
		System.out.println(sema);
		
		sema.setParpadeando(true);
		System.out.println(sema);
		
		for (int i = 0; i < 5; i++) {
			sema.cambiarEstado();
		}
		System.out.println(sema);
		
		Semaforo copia = new Semaforo();
		copia.setColor(sema.getColor());
		copia.setParpadeando(sema.getParpadeando());
		System.out.println(copia);
	}
}
