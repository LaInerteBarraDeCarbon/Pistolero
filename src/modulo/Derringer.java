package modulo;

public class Derringer extends Arma {

	/**
	 * Cantidad de disparos hasta que el arma se destruya. <br>
	 */
	int durabilidad;

	public Derringer() {
		super.daño = 1;
		super.distancia = 1.5;
		super.tiros = 2;
		this.durabilidad = 8;
	}

	public void recarga() {
		if (super.tiros == 0)
			super.tiros = 2;
	}

	@Override
	public Boolean unTiroMenos() {
		super.tiros--;
		this.durabilidad--;
		return (this.durabilidad == 0);
	}
}
