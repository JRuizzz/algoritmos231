package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

	private Scanner reader;
	private Controller controller;

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}

	public void menu() {

		System.out.println("Bienvenido a APO-RPG");

		boolean flag = false;

		while (!flag) {

			System.out.println("\n1. Ver número de armas");
			System.out.println("2. Salir del programa");
			int option = reader.nextInt();

			switch (option) {

			case 1:
				System.out.println(controller.mostrarNumObjetEnMochila());
				break;
			case 2:
				System.exit(0);
				break;
			}
		}
	}
}