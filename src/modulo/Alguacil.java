package modulo;

public class Alguacil extends Personaje {

	/**
	 * Crea un personaje Alguacil. <br>
	 * 
	 * @param posicion
	 * @param arma
	 */
	public Alguacil(int posicion, Arma arma) {
		super(posicion, arma);
		super.setNombre("Alguacil");
		super.setSalud(6);
	}

	@Override
	public void cambiaArma() {
		// TODO Auto-generated method stub

	}
}
