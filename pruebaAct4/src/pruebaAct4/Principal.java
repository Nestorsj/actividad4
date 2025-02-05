package pruebaAct4;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hola, sigue sin funcionar la importacion de LocalDate");
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Hoy es: " + hoy);

		System.out.println("Ya si que funciona todo correctamente");
		
		System.out.println(factorialFacil(5));
		
		System.out.println(factorialRecusivo(6));
	}
	
	public static int factorialFacil(int num) {
		
		int fact = 1;
		
		for(int i=2;i<=num;i++) {
			fact = fact * i;
		}
		
		return fact;
	}

	public static int factorialRecusivo(int num) {
		
		if(num == 0) {
			return 1;
		}else {
			return num * factorialRecusivo(num-1);
		}
	}
}
