
public class Main3 {

	public static void main(String[] args) {
		// crear varios objetos de la clase Coche
		// funciona Coche porque estan en el mismo paquete
		// paquete es un conjunto de clases
		Coche audi = new Coche(0.0f, 350.0f, 4, 0);
		//Coche nissan = new Coche(0.0f, 90.0f, 4, 0 );
		//System.out.println(audi.getVelocidad());
		audi.acelerar();
		audi.acelerar();
		audi.acelerar();
		audi.acelerar(20);
		audi.acelerar(20);
		audi.acelerar(20);
		audi.acelerar(20);
		audi.acelerar(20);
		//System.out.println(audi.getVelocidad());
		
		// objeto de la clase avion 
		Avion avion1 = new Avion(0.0f, 50, 0, true);
		avion1.acelerar();
		
		// objeto de la clase bicicleta
		Bicicleta bici1 = new Bicicleta(20.0f, 1, 5, 21);
		bici1.parar();
		
		// no se puede crear un objeto de una clase abstracta
		// Vehiculo vehiculo = new Vehiculo();
		
		
		//System.out.println(audi.getCaballos());
		//audi.setCaballos(230.0f);
		//System.out.println(audi.getCaballos());
		
		// la forma de invicarlo mejor esta
		float kw = Coche.convertirCvKw(350.0f);
		//System.out.println(kw);
		float cv = Coche.convertirKwCv(kw);
		//System.out.println(cv);
		// esta no 
		//audi.convertirCvKw(6);
		
		// crear varios objetos de la clase estudiante
		Estudiante estudiante1 = new Estudiante(1, 25, 666666455, 0, 0.0, 0.0);
		Estudiante estudiante2 = new Estudiante(2, 32);
		
		estudiante1.agregarNuevaNota(5.0);
		estudiante1.agregarNuevaNota(6.0);
		estudiante1.agregarNuevaNota(7.0);
		//System.out.println(estudiante1);

	}

}
