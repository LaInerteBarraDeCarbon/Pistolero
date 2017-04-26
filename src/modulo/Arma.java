package modulo;

/**
 * La clase Arma crea armas con su nombre, su cantidad de tiros, la distancia de
 * rango del arma y el da�o que produce. <br>
 */
public abstract class Arma {

	String nombre;
	int tiros;
	double distancia;
	int da�o;

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
	 * Devuelve el da�o del arma. <br>
	 * 
	 * @return Da�o. <br>
	 */
	public int getDa�o() {
		return da�o;
	}

	/**
	 * Establece el da�o del arma. <br>
	 * 
	 * @param da�o
	 */
	public void setDa�o(int da�o) {
		this.da�o = da�o;
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
