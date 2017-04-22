package modulo;

public class Colt45 extends Arma {

	public Colt45(){
		this.daño = 2;
		this.tiros = 6;
		this.distancia = 10;
	}

	public void Recarga() {
		if(this.tiros == 0)
			this.tiros = 6;	
	}

}
