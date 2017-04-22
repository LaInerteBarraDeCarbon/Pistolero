package modulo;

public class Sheriff extends Personaje {

	public Sheriff() {
		super.setNombre("Sheriff");
		super.setSalud(10);
	}

	@Override
	public boolean estaVivo() {
		if (super.getSalud() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void cambiaArma() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean tieneArma() {
		if (super.isTieneArma())
			return true;
		return false;
	}
	/*
	 * public boolean tiene45(){ if(super.getArma.equals("Colt 45")){
	 * 
	 * } }
	 */
}
