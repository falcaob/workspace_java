package antiguo;
import java.util.Scanner;

public class Ejercicio9Metodos {
	
	public static int suma(int numero1, int numero2) {
		int resultadoSuma = numero1 + numero2;
		return resultadoSuma;
	}
	
	public static int restar(int numero1, int numero2) {
		int resultadoResta = numero1 - numero2;
		return resultadoResta;
	}
	
	public static int multiplicar(int numero1, int numero2) {
		int resultadoMultiplicacion = numero1 * numero2;
		return resultadoMultiplicacion;
	}
	
	public static int dividir(int numero1, int numero2) {
		int resultadoDivision = numero1 / numero2;
		return resultadoDivision;
	}

	public static void main(String[] args) {
		
		/*
		 * Implementar metodos restar, multiplicar y dividir. Tienen que devolver un entero
		 * (int). Invocar los tres metodos con los dos numeros introducidos por el usuario
		 * y mostrar el resultado por pantalla
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		int numero1 = keyboard.nextInt();
		
		System.out.print("Introduzca el segundo numero: ");
		int numero2 = keyboard.nextInt();
		
		System.out.println("Introduzca la operación: 1=+, 2=-, 3=*, 4=/");
		int operacion = keyboard.nextInt();
		
		if (operacion == 1) {
			int sumar = Ejercicio9Metodos.suma(numero1, numero2);
			System.out.println("La suma es: " + sumar);
		}
		else if (operacion == 2) {
			int restar = Ejercicio9Metodos.restar(numero1, numero2);
			System.out.println("La resta es: " + restar);
		}
		else if (operacion == 3) {
			int multiplicar = Ejercicio9Metodos.multiplicar(numero1, numero2);
			System.out.println("La multiplicación es: " + multiplicar);
		}
		else if (operacion == 4) {
			int dividir = Ejercicio9Metodos.dividir(numero1, numero2);
			System.out.println("La division es " + dividir);
		}
		else {
			System.out.println("No existe la operación");
		}
	
		
		keyboard.close();
	}

}
