package modulo;

public abstract class Personaje {

	String nombre;
	Integer salud;
	boolean vivo;
	boolean tieneArma;
	double posicion;
	Arma arma;

	public abstract boolean estaVivo();

	public abstract void cambiaArma();

	public abstract boolean tieneArma();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public boolean isTieneArma() {
		return tieneArma;
	}

	public double getDistanciaArma(){
		return this.arma.getDistancia();
	}
	
	public void setTieneArma(boolean tieneArma) {
		this.tieneArma = tieneArma;
	}
	
	public void disparar(Personaje personaje){
		if(this.vivo == false) return;
		if(Math.abs(this.posicion-personaje.posicion) <= getDistanciaArma()){
			if(this.nombre.equals("Sherif") && this.arma.getNombre().equals("Winchester"))
				personaje.salud -= 5;
			else
				personaje.salud -= this.arma.daño;
			this.arma.unTiroMenos();
		}
		
	}
}
