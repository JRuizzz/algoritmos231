package model;

public class Armadura extends Objeto{

    private int defensa;

    public Armadura(double peso, double valor, String tier, String efecto, int durabilidad, double probabilidad, int defensa) {
        super(peso, valor, tier, efecto, durabilidad, probabilidad);
        this.defensa = defensa;
    }

    @Override
    public String toString(){
        return "La defensa de la armadura es: " + defensa;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }   
    
    
}
