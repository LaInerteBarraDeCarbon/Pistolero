package modulo;

/**
 * La clase Arma crea armas con su nombre, su cantidad de tiros, la distancia de
 * rango del arma y el da�o que produce. <br>
 */
public abstract class Arma {

	String nombre;
	int tiros;
	double distancia;
	int daño;

	/**
	 * Realiza la recarga del arma. <br>
	 */
	public abstract void recarga();

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
	 * Devuelve el da�o del arma. <br>
	 * 
	 * @return Da�o. <br>
	 */
	public int getDaño() {
		return daño;
	}

	/**
	 * Establece el da�o del arma. <br>
	 * 
	 * @param da�o
	 */
	public void setDaño(int daño) {
		this.daño = daño;
	}

	/**
	 * Descuenta un tiro del arma y reduce su durabilidad, si la tiene. <br>
	 * 
	 * @return true si se destruye, false de lo contrario. <br>
	 */
	public Boolean unTiroMenos() {
		this.tiros--;
		return false;
	}
}
