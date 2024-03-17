package ejercicios.ejercicio38;

public class App {
	public static void main(String[] args) {
		PilaCadenas cola = new PilaCadenas();
		cola.añadirCadena("primero");
		System.out.println(cola);
		
		cola.añadirCadena("segundo");
		System.out.println(cola);
		
		String sacado = cola.sacarCadena();
		System.out.println(sacado);
		System.out.println(cola);
		
		cola.añadirCadena("tercero");
		System.out.println(cola);
		
		while(cola.getTamaño() > 0) {
			sacado = cola.sacarCadena();
			System.out.println(sacado);
		}
		System.out.println(cola);
		
	}

}
