package modulo;

public class Derringer extends Arma {

	/**
	 * Cantidad de disparos hasta que el arma se destruya. <br>
	 */
	int disparos;

	public Derringer() {
		super.daño = 1;
		super.distancia = 1.5;
		super.tiros = 2;
		this.disparos = 8;
	}

	public void Recarga() {
		if (super.tiros == 0)
			super.tiros = 2;
	}

	@Override
	public Boolean unTiroMenos() {
		super.tiros--;
		this.disparos--;
		return (this.disparos == 0);
	}
}
