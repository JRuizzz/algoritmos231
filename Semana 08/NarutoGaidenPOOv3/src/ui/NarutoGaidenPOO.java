package ui;

import java.util.Scanner;
import model.Controladora;

public class NarutoGaidenPOO {

	private Scanner lector;
	private Controladora controladora;

	public NarutoGaidenPOO() {

		lector = new Scanner(System.in);
		controladora = new Controladora();
	}

	public void menu() {

		System.out.println("Bienvenido a NarutoGaidenPOO");

		boolean cond = false;

		while (!cond) {

			System.out.println("1. Registrar entrenamiento");
			System.out.println("2. Consultar informacion registrada");
			System.out.println("3. Registrar sesion de entrenamiento");
			System.out.println("4. Salir");
			int opcion = lector.nextInt();

			switch (opcion) {

			case 1:
				registrarTipoEntrenamiento();
				break;

			case 2:
				consultarInfo();
				break;

			case 3:
				registrarSesionDeEntrenamiento();
				break;

			case 4:
				cond = true;
				break;

			}

		}

	}

	public void registrarTipoEntrenamiento() {

		System.out.println("Digite a continuacion la informacion de un entrenamiento");

		// Limpieza de buffer
		lector.nextLine();

		System.out.println("Digite el tipo de entrenamiento. Ej.: Ninjutsu");
		String tipo = lector.nextLine();

		System.out.println("Digite el maximo numero de horas para el entrenamiento. Ej.: 200");
		int duracionMaxima = lector.nextInt();

		if (controladora.registrarTipoEntrenamiento2(tipo, duracionMaxima)) {

			System.out.println("Entrenamiento registrado exitosamente");

		} else {

			System.out.println("Memoria llena, no se pudo registrar el Entrenamiento");
		}
	}

	public void registrarSesionDeEntrenamiento() {

		String consulta = controladora.consultarEntrenamientosRegistrados();

		if (consulta.equals("")) {

			System.out.println("No hay entrenamientos registrados :(");
		} else {

			System.out.println("Estos son los tipos de entrenamiento registrados");
			System.out.println(consulta);

			System.out.println("Digite el tipo al cual le va a crear una sesión de entrenamiento");
			int opcion = lector.nextInt();

			System.out.println("Digite las horas de entrenamiento");
			int horas = lector.nextInt();

			controladora.registrarSesionDeEntrenamiento(opcion - 1, horas);

		}

	}

	public void consultarInfo() {

		System.out.println("Esta es la informacion registrada en el sistema");

		String consulta = controladora.consultarInfo();

		if (consulta.equals("")) {

			System.out.println("No hay entrenamientos registrados :(");
		} else {
			System.out.println(consulta);
		}

	}

	public static void main(String[] args) {

		NarutoGaidenPOO ejecutable = new NarutoGaidenPOO();
		ejecutable.menu();

		/*
		 * Entrenamiento ninjutsu = new Entrenamiento("Ninjutsu", 500, 0, 0);
		 * entrenamientos[0] = ninjutsu;
		 * 
		 * Entrenamiento taijutsu = new Entrenamiento("Taijutsu", 300, 0, 0);
		 * entrenamientos[1] = taijutsu;
		 * 
		 * Entrenamiento genjutsu = new Entrenamiento("Genjutsu", 200, 0, 0);
		 * entrenamientos[2] = genjutsu;
		 * 
		 * for(int i = 0; i<entrenamientos.length;i++){
		 * 
		 * System.out.println(entrenamientos[i].toString());
		 * 
		 * }
		 */

	}

}