package modulo;

public class Colt45 extends Arma {

	public Colt45() {
		super.daño = 2;
		super.tiros = 6;
		super.distancia = 10;
	}

	public void recarga() {
		if (super.tiros == 0)
			super.tiros = 6;
	}
}
