package model;

public class Controller{
    private Personaje[] personajes;
    
    public Controller(){
        this.personajes = new Personaje[1000];
        personajes[0] = new Personaje("Felthalas","Elfo", 50);
    }

    public String mostrarNumObjetEnMochila(){
        return personajes[0].mostrarMochila();
    }
    
}