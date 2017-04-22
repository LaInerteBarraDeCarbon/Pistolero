package modulo;

public class Alguacil extends Personaje{

	public Alguacil() {
		super.setNombre("Alguacil");
		super.setSalud(6);
	}
	
	@Override
	public boolean estaVivo() {
		
		return false;
	}

	@Override
	public void cambiaArma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tieneArma() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
