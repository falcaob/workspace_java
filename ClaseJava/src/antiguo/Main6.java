package antiguo;

import java.util.HashMap;

public class Main6 {

	public static void main(String[] args) {
		
		// almacena elementos no ordenados por pares
		HashMap<String, String> capitales = new HashMap<String, String>();
		
		// agregar alementos
		capitales.put("Francia", "París");
		capitales.put("España", "Madrid");
		capitales.put("Mozambique", "Maputo");
		// cuenta en pares ej: españa=madrid es un 1 elemento
		
		// eliminar elementos
		capitales.remove("España");
		
		// extraer un elemento pero se le pasa la clave en vez del indice
		// System.out.println(capitales.get("Francia"));
		
		// comprueba si existe una determinada clave
		// System.out.println(capitales.containsKey("Mozambique"));
		
		// System.out.println(capitales);
		// System.out.println(capitales.size());
		
		// iterar HashMap por claves
		for (String clave : capitales.keySet()) {
			System.out.println(clave + ": " + capitales.get(clave));
		}

	}

}
