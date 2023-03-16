package ui;

import java.util.Scanner;
import model.Controladora;

public class NarutoGaidenPOO{

    private Scanner lector;
    private Controladora controladora;

    public NarutoGaidenPOO(){

        lector = new Scanner(System.in);
        controladora = new Controladora();        
    }

    public void menu(){

        System.out.println("Bienvenido a NarutoGaidenPOO");

        boolean cond = false;

        while(!cond){

            System.out.println("1. Registrar entrenamiento");
            System.out.println("2. Consultar informacion registrada");
            System.out.println("3. Salir");
            int opcion = lector.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("Digite el tipo de entrenamiento");
                    System.out.println("1. Ninjutsu");
                    System.out.println("2. Taijutsu");
                    System.out.println("3. Genjutsu");
                    int opcion2 = lector.nextInt();





                break;

                case 2:
                    System.out.println("Aqui se va a presentar la información registrada");

                break;

                case 3:
                cond = true;
                break;


            }


        }



    }

    public static void main(String[] args) {
        
        NarutoGaidenPOO ejecutable = new NarutoGaidenPOO();
        ejecutable.menu();



        /* 
        Entrenamiento ninjutsu = new Entrenamiento("Ninjutsu", 500, 0, 0);
		entrenamientos[0] = ninjutsu;
		
		Entrenamiento taijutsu = new Entrenamiento("Taijutsu", 300, 0, 0);
		entrenamientos[1] = taijutsu;
		
		Entrenamiento genjutsu = new Entrenamiento("Genjutsu", 200, 0, 0);
		entrenamientos[2] = genjutsu;

        for(int i = 0; i<entrenamientos.length;i++){

            System.out.println(entrenamientos[i].toString());

        }
        */

    }






}