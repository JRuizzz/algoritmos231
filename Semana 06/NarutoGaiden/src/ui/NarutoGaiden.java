package ui;

import java.util.Scanner;

public class NarutoGaiden {

	static Scanner lector;

	final static String[] TIPOS_JUTSU = { "Ninjutsu", "Taijutsu", "Genjutsu" };
	final static int[] HORAS_ENTRENAMIENTO = { 500, 300, 200 };
	static int[] registroEntrenamiento;
	static int contadorEntrenamientos = 0;

	public static void main(String[] args) {

		init();
		desplegarMenuPrincipal();
	}

	private static void init() {

		lector = new Scanner(System.in);
		registroEntrenamiento = new int[3];
		contadorEntrenamientos = 0;
	}

	public static void desplegarMenuPrincipal() {

		System.out.println("Bienvenido a Naruto Gaiden!");

		boolean parada = false;

		do {

			System.out.println("\nDigite una opción");
			System.out.println("1. Registrar sesión de entrenamiento");
			System.out.println("2. Consultar registros de entrenamiento");
			System.out.println("0. Salir");

			int opcionPrincipal = lector.nextInt();

			switch (opcionPrincipal) {

			case 1:

				++contadorEntrenamientos;
				while (!parada) {
					System.out.println("Esta es la sesión de entrenamiento " + contadorEntrenamientos);

					System.out.println("\nDigite el tipo de entrenamiento");
					System.out.println("1. Ninjutsu");
					System.out.println("2. Taijutsu");
					System.out.println("3. Genjutsu");
					int opcionJutsu = lector.nextInt();

					if (opcionJutsu == 1 || opcionJutsu == 2 || opcionJutsu == 3) {
						parada = true;
						registrarEntrenamiento(opcionJutsu - 1);
					} else {
						System.out.println("Debe digitar un tipo de entrenamiento válido");
					}

				}
				parada = false;
				break;
			case 2:

				System.out.println(consultarRegistrosEntrenamiento());
				break;

			case 0:
				System.out.println("Gracias por usar Naruto Gaiden! Adios.");
				parada = true;
				break;
			default:
				System.out.println("Debe digitar una opción válida");
				break;

			}

		} while (!parada);

	}

	public static void registrarEntrenamiento(int tipoJutsu) {

		System.out.println("Digite la cantidad de horas de entrenamiento realizadas en " + TIPOS_JUTSU[tipoJutsu]);
		int horasEntrenamiento = lector.nextInt();

		registroEntrenamiento[tipoJutsu] += horasEntrenamiento;
		alertas(tipoJutsu);

	}

	private static void alertas(int tipoJutsu) {

		System.out.println("\nNaruto ha entrenado en " + TIPOS_JUTSU[tipoJutsu] + " un total de "
				+ registroEntrenamiento[tipoJutsu] + " horas!");
		if (registroEntrenamiento[tipoJutsu] >= HORAS_ENTRENAMIENTO[tipoJutsu]) {
			System.out.println("\nLo has logrado Naruto! Has alcanzado el número de horas de entrenamiento en "
					+ TIPOS_JUTSU[tipoJutsu]);
		} else {
			System.out.println("\nAnimo Naruto!, te faltan al menos "
					+ (HORAS_ENTRENAMIENTO[tipoJutsu] - registroEntrenamiento[tipoJutsu])
					+ " horas de entrenamiento en " + TIPOS_JUTSU[tipoJutsu]);
			System.out.println("\nDattebayo!");
		}

	}

	private static String consultarRegistrosEntrenamiento() {

		String msg = "\nEsta es la información registrada en el sistema:\n";

		msg += "\nSe han registrado " + contadorEntrenamientos + " sesiones de entrenamiento\n";

		for (int i = 0; i < HORAS_ENTRENAMIENTO.length; i++) {

			msg += "\nNaruto ha entrenado " + registroEntrenamiento[i] + " horas en " + TIPOS_JUTSU[i]
					+ " de un total esperado de " + HORAS_ENTRENAMIENTO[i] + " horas";

		}

		return msg;
	}

}
