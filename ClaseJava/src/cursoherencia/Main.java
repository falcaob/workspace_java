package cursoherencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// crear un ArrayList vacio
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		// creamos el objeto de la clase Estudiante
		Estudiante estudiante = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
		
		// insertamos el objeto de la clase Estudiante en el ArrayList estudiantes
//		estudiantes.add(estudiante);
//		estudiantes.add(estudiante);
//		estudiantes.add(estudiante);
//		
//		for(int i=0; i<estudiantes.size(); i++) {
//			Estudiante estudiante1 = estudiantes.get(i); 
//			System.out.println(estudiantes.get(i).getId());
//		}
//		
//		for (Estudiante estudiante2 : estudiantes) {
//			System.out.println(estudiante2.getId());
//		}
		
		// insertamos 500 estudiantes dentro del ArrayList estudiantes
		for (int i=0; i<500; i++) {
			estudiantes.add(new Estudiante(i, 55, 55555, 0, 0.0, Math.round(Math.random()*10)));
			
		}
		
		//System.out.println(estudiantes.size());
		
		
		//for (int i=0; i<estudiantes.size(); i++) {
		//	System.out.println("id: " + estudiantes.get(i).getId() + " Nota media: " + 				estudiantes.get(i).getNotaMedia());
		//}
		
		// recorrer todos los estudiantes, pero no se utliza la variable i 
		for (Estudiante estudiante1 : estudiantes) {
			System.out.println("id: " + estudiante.getId() + " notamedia: " + 
					estudiante.getNotaMedia());
				}
		
		

		
		
		// muestra por pantalla el numero de elementos
//		System.out.println(estudiantes.size());
		
		// acceder a un elemento por una posicion y guardarlo como objeto
//		estudiante1 = estudiantes.get(0);
//		System.out.println(estudiante2.getEdad());
		
//		System.out.println(estudiantes.size());

//		for (int i = 0; i < 500; i++) {
//			Estudiante nuevoEstudiante = new Estudiante(i, 55, 55555, 0, 0.0, 0.0);
//			estudiantes.add(new Estudiante(i, 55, 55555, 0, 0.0, 0.0));
//		}
		
		
		// recorro el ArrayList desde la posicion inicial (0) hasta la posicion final
//		for (int i=0; i<estudiantes.size(); i++) {
//			Estudiante nuevoEstudiante = estudiantes.get(i);
//			System.out.printf("id: %d", nuevoEstudiante.getId()).println();
//		}
		
		
		
//		Estudiante estudiante2 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante3 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante4 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
//		Estudiante estudiante5 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
		
//		// invocacion a un metodo no estatico OBJETO.METODO_NO_ESTATICO
//		estudiante1.mostrarInfo();
		
		// invocacion a un metodo estatico: CLASE.METODO_ESTATICO
//		Estudiante.crearEstudiante();

	}

}
