package ejercicios.ejercicio38;

public class App {
	public static void main(String[] args) {
		PilaCadenas cola = new PilaCadenas();
		cola.aņadirCadena("primero");
		System.out.println(cola);
		
		cola.aņadirCadena("segundo");
		System.out.println(cola);
		
		String sacado = cola.sacarCadena();
		System.out.println(sacado);
		System.out.println(cola);
		
		cola.aņadirCadena("tercero");
		System.out.println(cola);
		
		while(cola.getTamaņo() > 0) {
			sacado = cola.sacarCadena();
			System.out.println(sacado);
		}
		System.out.println(cola);
		
	}

}
