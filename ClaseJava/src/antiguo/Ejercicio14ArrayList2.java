package antiguo;

import java.util.ArrayList;

public class Ejercicio14ArrayList2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el maximo y el minimo de
		 * esos numeros.
		 */
		
		// double numeroAleatorio = Math.random() * 100;
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		for(int i=0; i<50; i++) {
			numeros.add(Math.random() * 100);
		}
		
		// System.out.println(numeros);
	
		// suma de todos los numeros
		double suma = 0.0;
		for (Double numero : numeros) {
			suma += numero;
		}
		
		
		// media de todos los numero
		 double media = suma / numeros.size();
		 
		 // numero minimo de todos los minimos
		 double minimo = 100.0;
		 for (Double numero : numeros) {
			 if(numero < minimo) {
				 minimo = numero;
			 }
			
		}
		 
		 // número maximo de todos los numeros
		 double maximo = 0.0;
		 for (Double numero : numeros) {
			if(numero > maximo) {
				maximo = numero;
			}
		}
		 
		 System.out.println("Suma: " + suma);
		 System.out.println("Media: " + media);
		 System.out.println("Mínimo: " + minimo);
		 System.out.println("Máximo: " + maximo);
	}

}
