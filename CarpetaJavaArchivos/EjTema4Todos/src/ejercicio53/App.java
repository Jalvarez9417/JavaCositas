package ejercicios.ejercicio53;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		Hucha hucha = new Hucha();
		System.out.println(hucha);
		
		hucha.meterDinero(new BigDecimal(100));
		System.out.println(hucha);
		
		hucha.meterDinero(new BigDecimal(50.59));
		System.out.println(hucha);
		
		hucha.sacarDinero(new BigDecimal(20.5));
		System.out.println(hucha);
		
		BigDecimal sacado = hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);
		
		hucha.meterDinero(sacado);
		System.out.println(hucha);
		
		BigDecimal contado = hucha.contarDinero();
		hucha.meterDinero(contado);
		System.out.println(hucha);
		
		BigDecimal roto = hucha.romperHucha();
		hucha.meterDinero(roto);
		System.out.println(hucha);
	}
}
