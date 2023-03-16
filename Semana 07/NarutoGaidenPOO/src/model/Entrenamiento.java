package model;

public class Entrenamiento{

    private String tipo;
    private int duracionMaxima;
	private int sesiones;
	private int duracionAcumulada;

    public Entrenamiento(String tipo, int duracionMaxima, int sesiones, int duracionAcumulada) {

        this.tipo = tipo;
		this.duracionMaxima = duracionMaxima;
		this.sesiones = sesiones;
		this.duracionAcumulada = duracionAcumulada;
	}

    public String getTipo() {

		return tipo;
	}
	
	public void setTipo(String tipo) {

		this.tipo = tipo;
	}

	public int getDuracionMaxima() {

		return duracionMaxima;
	}

	public void setDuracionMaxima(int duracionMaxima) {

		this.duracionMaxima = duracionMaxima;
	}
	
	public int getSesiones() {

		return sesiones;
	}
	
	public void setSesiones(int sesiones) {

		this.sesiones = sesiones;
	}

	public int getDuracionAcumulada() {

		return duracionAcumulada;

	}
	
	public void setDuracionAcumulada(int duracionAcumulada) {

		this.duracionAcumulada = duracionAcumulada;
	}
	
	public String toString() {

		String msg = "";

		msg = "\nTipo: " + tipo + "\nDuracion maxima: " + duracionMaxima + "\nSesiones de entrenamiento: " + sesiones
				+ "\nDuracion acumulada de entrenamientos: " + duracionAcumulada;

		return msg;

	}





}