package antiguo;

import java.util.ArrayList;


public class Ejercicio13ArrayList {

	public static void main(String[] args) {

		/*
		 * Ejercicio: escribe un programa con un ArrayList que almacene los nombres
		 * de tres colores. A continuacion, crea otro ArrayList vacio e inserta en el
		 * todos los elementos del primer ArrayList mediante un forEach.
		 */
		
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("rojo");
		colores.add("azul");
		colores.add("verde");
		
		ArrayList<String> colores2 = new ArrayList<String>();
		
		// forEach iterar arrays, y lo hace con todos los elementos
		// for normal hace falta extraer con get pasandole la posicion del elemento
		for (String color : colores) {
			colores2.add(color);
		}
		
		// System.out.println(colores2);
		
		// for clasico
		for(int i = 0; i < colores.size(); i++) {
			colores2.add(colores.get(i));
		}
		
		System.out.print(colores2);
		// importante: los ArrayList tienen que ser del mismo tipo 

	}

}
