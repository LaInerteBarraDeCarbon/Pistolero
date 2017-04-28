package modulo;

/**
 * La clase personaje se encarga de crear los personajes que participan en el
 * duelo con sus armas. <br>
 */
public abstract class Personaje {

	/**
	 * Nombre del personaje. <br>
	 */
	String nombre;
	/**
	 * Salud del personaje. <br>
	 */
	Integer salud;
	/**
	 * Indica si el personaje se encuentra vivo. <br>
	 */
	boolean vivo = true;
	/**
	 * Indica si el personaje posee un arma. <br>
	 */
	boolean tieneArma;
	/**
	 * Posición del personaje. <br>
	 */
	double posicion;
	/**
	 * Arma que utiliza el personaje. <br>
	 */
	Arma arma;

	/**
	 * Crea un personaje con su posición y su arma. <br>
	 * 
	 * @param posicion
	 * @param arma
	 */
	public Personaje(int posicion, Arma arma) {
		this.posicion = posicion;
		this.arma = arma;
		this.tieneArma = true;
	}

	/**
	 * Crea un personaje con su posición pero sin arma. <br>
	 * 
	 * @param posicion
	 */
	public Personaje(int posicion) {
		this.posicion = posicion;
		this.tieneArma = false;
	}

	public abstract void cambiaArma();

	/**
	 * Devuelve el nombre del tipo de personaje. <br>
	 * 
	 * @return Nombre del personaje. <br>
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Guarda el nombre del tipo de personaje. <br>
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la salud del personaje. <br>
	 * 
	 * @return Salud del personaje. <br>
	 */
	public Integer getSalud() {
		return this.salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	/**
	 * Indica si el personaje se encuentra vivo. <br>
	 * 
	 * @return true si sigue vivo, false si esta muerto. <br>
	 */
	public boolean estaVivo() {
		return this.vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * Indica si el personaje tiene arma. <br>
	 * 
	 * @return true si tiene arma, false de lo contrario. <br>
	 */
	public boolean getTieneArma() {
		return this.tieneArma;
	}

	/**
	 * Devuelve la distancia de rango del arma. <br>
	 * 
	 * @return Distancia de rango. <br>
	 */
	public double getDistanciaArma() {
		return this.arma.getDistancia();
	}
	
	/**
	 * Asigna un arma al personaje en caso de que no posea una. <br>
	 * 
	 * @param arma
	 * @return true si asignó el arma, false si ya tenía una.
	 */
	public boolean asignaArma(Arma arma) {
		if(this.tieneArma) return false;
		
		this.arma = arma;
		this.tieneArma = true;
		return true;
	}

	/**
	 * El personaje realiza un disparo hacia otro personaje. Si el personaje se
	 * encuentra muerto o no posee arma no puede realizar el ataque.<br>
	 * 
	 * @param personaje
	 */
	public void disparar(Personaje personaje) {
		if (!this.vivo || !this.tieneArma)
			return;
		if (Math.abs(this.posicion - personaje.posicion) <= getDistanciaArma()) {
			if (this.nombre.equals("Sherif") && this.arma.getNombre().equals("Winchester"))
				personaje.salud -= 5;
			else
				personaje.salud -= this.arma.daño;
			if (this.arma.unTiroMenos().equals(true)) {
				System.out.println("El arma se destruyó");
				this.tieneArma = false;
			}
		}
	}
}
