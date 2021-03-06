
public abstract class Vehiculo {
	
	// atributos que van a heredar Coche, Avion y Bicicleta
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;
	
	// metodos que van a heredar Coche, Avion y Bicicleta
	public abstract void parar ();
	
	
	public void acelerar() {
		System.out.println("Metodo de acelerar de vehiculo");
	}
	
	
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}
	
	// constructor de la clase 
	public Vehiculo(float velocidad, int asientos, int orientacionRuedas) {
		super();
		this.velocidad = velocidad;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	public int getOrientacionRuedas() {
		return orientacionRuedas;
	}
	public void setOrientacionRuedas(int orientacionRuedas) {
		this.orientacionRuedas = orientacionRuedas;
	}
	
	

}
