package model;

public class Personaje{

    private String nombre;
    private String raza;
    private int nivel;

    private Objeto[] mochila;

    public Personaje(String nombre, String raza, int nivel){
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;

        this.mochila = new Objeto[50];

        mochila[0] = new Arma(5.0, 5000, "S", "Tajante", 50, 50, 2500);
        mochila[1] = new Armadura(nivel, nivel, nombre, raza, nivel, nivel, nivel);
        mochila[2] = new Consumible(nivel, nivel, nombre, raza, nivel, nivel, nivel);
    }

    public String mostrarMochila(){
        String contenido = "";
        
        int numArma = 0;
        int numArmadura = 0;
        int numConsumible = 0;
        
        for(int i=0; i<mochila.length; i++){
            if(mochila[i] != null){
                if(mochila[i] instanceof Arma){
                    numArma++;
                }
                else if(mochila[i] instanceof Armadura){
                    numArmadura++;
                }
                else{
                    numConsumible++;
                }
            }
        }

        contenido += "\nEl personaje "+ nombre 
        + " de raza " + raza
        + " con nivel " + nivel 
        + "\nTiene en su mochila lo siguiente."
        + "\nEl número de armas en la mochila es: " + numArma 
        + "\nEl numero de armaduras en la mochila es: " 
        + numArmadura + "\nEl numero de consumibles en la mochila es: " + numConsumible;

        return contenido;
    }
}