package modulo;

public class Renegado extends Personaje {

	/**
	 * Crea un personaje renegado. <br>
	 * 
	 * @param posicion
	 * @param arma
	 */
	public Renegado(int posicion, Arma arma) {
		super(posicion, arma);
		setNombre("Renegado");
		setSalud(8);
	}

	@Override
	public void cambiaArma() {
		// TODO Auto-generated method stub

	}
}
