package model;

public class Controladora {

	private Entrenamiento[] entrenamientos;

	public Controladora() {

		entrenamientos = new Entrenamiento[3];

	}

	public boolean registrarTipoEntrenamiento(String tipo, int duracionMaxima) {

		Entrenamiento nuevoEntrenamiento = new Entrenamiento(tipo, duracionMaxima);
		boolean indicador = false;

		for (int i = 0; i < entrenamientos.length; i++) {

			if (entrenamientos[i] == null && !indicador) {
				entrenamientos[i] = nuevoEntrenamiento;
				indicador = true;
			}

		}

		return indicador;

	}

	public boolean registrarTipoEntrenamiento2(String tipo, int duracionMaxima) {

		Entrenamiento nuevoEntrenamiento = new Entrenamiento(tipo, duracionMaxima);

		for (int i = 0; i < entrenamientos.length; i++) {

			if (entrenamientos[i] == null) {
				entrenamientos[i] = nuevoEntrenamiento;
				return true;
			}

		}

		return false;

	}

	public String consultarInfo() {

		String msg = "";

		for (int i = 0; i < entrenamientos.length; i++) {

			if (entrenamientos[i] != null) {
				msg += "\n" + entrenamientos[i].toString();
			}

		}

		return msg;

	}

	public String consultarEntrenamientosRegistrados() {

		String msg = "";

		for (int i = 0; i < entrenamientos.length; i++) {

			if (entrenamientos[i] != null) {
				msg += "\n" + (i + 1) + ". " + entrenamientos[i].getTipo();
			}

		}

		return msg;

	}

	public void registrarSesionDeEntrenamiento(int tipo, int horas) {

		// Obtenemos el objeto temporal
		Entrenamiento temp = entrenamientos[tipo];

		// Obtenemos los atributos del objeto temporal
		int sesiones = temp.getSesiones();
		int duracionAcumulada = temp.getDuracionAcumulada();

		// Modificamos los atributos
		sesiones++;
		duracionAcumulada += horas;

		// Asignamos los atributos al objeto temporal
		temp.setSesiones(sesiones);
		temp.setDuracionAcumulada(duracionAcumulada);

		// Modificamos el arrreglo con el objeto temporal
		entrenamientos[tipo] = temp;

	}

}
