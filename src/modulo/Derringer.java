package modulo;

public class Derringer extends Arma{
	
	int disparos;
	
	public Derringer(){
		this.daño = 1;
		this.distancia = 1.5;
		this.tiros = 2;
		this.disparos = 8;
	}
	
	public boolean durabilidad(){
		if(this.disparos > 0)
			return true;
		else
			return false;
	}
	

	public void Recarga() {
		if(this.tiros == 0)
			this.tiros = 2;		
	}

	public int getDisparos() {
		return disparos;
	}

	public void setDisparos(int disparos) {
		this.disparos = disparos;
	}
	
	

	
	
}
