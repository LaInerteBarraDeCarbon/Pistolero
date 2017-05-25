package modulo;

public class Winchester extends Arma {

	public Winchester() {
		this.daño = 3;
		this.tiros = 2;
		this.distancia = 4;
	}

	public void recarga() {
		if (this.tiros == 0) {
			this.tiros = 2;
		}
	}
}
