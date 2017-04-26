package modulo;

public class Sheriff extends Personaje {

	/**
	 * Crea un personaje Sheriff. <br>
	 * 
	 * @param posicion
	 * @param arma
	 */
	public Sheriff(int posicion, Arma arma) {
		super(posicion, arma);
		super.setNombre("Sheriff");
		super.setSalud(10);
	}

	@Override
	public void cambiaArma() {
		// TODO Auto-generated method stub
	}
}
