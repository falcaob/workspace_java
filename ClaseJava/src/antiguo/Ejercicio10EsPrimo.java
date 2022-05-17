package antiguo;
import java.util.Scanner;

public class Ejercicio10EsPrimo {
	
	public static boolean esPrimo (int numero) {
		for(int i=numero-1; i >= 2; i--) {
			System.out.println(numero + "%" + i + " = " + numero%i);
			if(numero % i == 0) {
				//System.out.println("No es primo");
				return false;
			}
		}
		
		// es primo
		// la otra posibilidad de lo que puede devolver 
		return true;
	}
	
	

	public static void main(String[] args) {
		/*
		 * Crear un metodo que se llame esPrimo. Reciba un numero entero y devuelva un booleano.
		 * Si el nnmero es primo entonces tiene que devolver true y si no, false
		 * 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int numero1 = keyboard.nextInt();
		
		if(Ejercicio10EsPrimo.esPrimo(numero1)) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		
		

	}

}
