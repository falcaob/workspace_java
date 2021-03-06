package cursoherencia;

public abstract class Persona {
	
	// esta clase no se ejecuta porque solo tiene info de la persona
	
	/*
	 * En cada clase creamos:
	 * - Atributos
	 * - Constructor
	 * - Metodos publicos no estaticos y estaticos
	 * - Metodos getters and setters
	 */
	
	// atributos
	protected int id;
	protected int edad;
	protected int telefono;
	
	// constructor por defecto
		public Persona() {
		}
	
	// constructor parametrizado
	public Persona(int id, int edad, int telefono) {
		super();
		//System.out.println("Constructor de la clase Persona");
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	// metodo abstracto
	public abstract void mostrarID ();
	
	// metodo publico no estaticos
	public void mostrarInfo() {
		//System.out.println("Metodo mostrarInfo de Persona");
	}
	
	// metodos getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
