package modulo;

public class Winchester extends Arma{

	
	public Winchester(){
		this.da�o = 3;
		this.tiros = 2;
		this.distancia = 4;
	}
	
	public void Recarga() {
		boolean flag = false;
		
		if(this.tiros == 0){
			this.tiros = 2;
			flag = true;
		}
	}
	
	
}
