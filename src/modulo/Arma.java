package modulo;

/**
 * La clase Arma crea armas con su nombre, su cantidad de tiros, la distancia de
 * rango del arma y el daño que produce. <br>
 */
public abstract class Arma {

	String nombre;
	int tiros;
	double distancia;
	int daño;

	/**
	 * Realiza la recarga del arma. <br>
	 */
	public abstract void Recarga();

	/**
	 * Devuelve el nombre del arma. <br>
	 * 
	 * @return Nombre del arma. <br>
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del arma. <br>
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve los tiros disponibles del arma. <br>
	 * 
	 * @return Tiros. <br>
	 */
	public int getTiros() {
		return tiros;
	}

	public void setTiros(int tiros) {
		this.tiros = tiros;
	}

	/**
	 * Devuelve el rango del arma. <br>
	 * 
	 * @return Rango del arma. <br>
	 */
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	/**
	 * Devuelve el daño del arma. <br>
	 * 
	 * @return Daño. <br>
	 */
	public int getDaño() {
		return daño;
	}

	/**
	 * Establece el daño del arma. <br>
	 * 
	 * @param daño
	 */
	public void setDaño(int daño) {
		this.daño = daño;
	}

	/**
	 * Descuenta un tiro del arma y reduce su durabilidad de poseer. <br>
	 * 
	 * @return true si se destruye, false de lo contrario. <br>
	 */
	public Boolean unTiroMenos() {
		this.tiros--;
		return false;
	}
}
