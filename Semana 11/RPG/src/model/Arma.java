package model;

public class Arma extends Objeto{

    private int daño;

    public Arma(double peso, double valor, String tier, String efecto, int durabilidad, double probabilidad, int daño) {
        super(peso, valor, tier, efecto, durabilidad, probabilidad);
        this.daño = daño;
    }

    @Override
    public String toString(){
        return "El daño del arma es: " + daño;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }   

    
    
}