package antiguo;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 
		 * Solicitar al usuario un numero y si introduce una letra o un string, mostrar
		 * un mensaje por pantalla
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		
		int numero1 = 1;
		
		try {
			numero1 = keyboard.nextInt();
		}
		catch(Exception e) {
			System.out.println("Vuelve a intentarlo");
			return;
		}
		
		System.out.println(numero1);
		
		keyboard.close();

	}

}
