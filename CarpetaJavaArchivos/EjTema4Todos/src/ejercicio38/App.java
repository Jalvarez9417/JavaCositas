package ejercicios.ejercicio38;

public class App {
	public static void main(String[] args) {
		PilaCadenas cola = new PilaCadenas();
		cola.a�adirCadena("primero");
		System.out.println(cola);
		
		cola.a�adirCadena("segundo");
		System.out.println(cola);
		
		String sacado = cola.sacarCadena();
		System.out.println(sacado);
		System.out.println(cola);
		
		cola.a�adirCadena("tercero");
		System.out.println(cola);
		
		while(cola.getTama�o() > 0) {
			sacado = cola.sacarCadena();
			System.out.println(sacado);
		}
		System.out.println(cola);
		
	}

}
