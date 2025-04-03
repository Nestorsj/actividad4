package pruebaAct4;

import java.time.LocalDate;

/**
 * <h2>Esto es un ejemplo de documetación</h2>
 * Puedo añadir etiquetas html para <b>mejorar</b> la presentación. * 
 * 
 * @author nesto
 * @version v1.2025
 * @see <a href="http://www.google.es">Google</a>
 */

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hola, sigue sin funcionar la importacion de LocalDate");
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Hoy es: " + hoy);

		System.out.println("Ya si que funciona todo correctamente");
		
		System.out.println(factorialFacil(5));
		
		System.out.println(factorialRecusivo(6));
		
		sumaFactoriales(7, 9);
	}
	
	//Metodos publicos
	
	/**
	 * Realiza el factorial de un número con bucle for
	 * 
	 * @param num
	 * @return c
	 */
	
	public static int factorialFacil(int num) {
		
		int fact = 1;
		
		if(fact>0) {
			for(int i=2;i<=num;i++) {
				fact = fact * i;
			}
			
			return fact;
		}
		return 0;
	}
	
	/**
	 * Realiza el factorial de num de forma recursiva
	 * 
	 * @param num
	 * @return <ul>
	 * 			<li>num: se calcula el factorial en la misma variable de entrada</li>
	 * 			<li>1: El numero pasado es cero</li>
	 * 		</ul>
	 */

	public static int factorialRecusivo(int num) {
		
		if(num == 0) {
			return 1;
		}else {
			return num * factorialRecusivo(num-1);
		}
	}
	
	/**
	 * Crea una salida String con la suma de dos numeros, a los cuales se les calcula el factorial con los metodos
	 * factorialFacil y factorialRecursivo
	 * 
	 * @param fact1
	 * @param fact2
	 */
	
	public static void sumaFactoriales(int fact1, int fact2) {
		
		System.out.println("La suma de los dos factoriales es: " + (factorialFacil(fact1) + factorialRecusivo(fact2)));
	}
}
