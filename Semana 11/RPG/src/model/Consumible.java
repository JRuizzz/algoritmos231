package model;

public class Consumible extends Objeto{

    private int recuperacion;

    public Consumible(double peso, double valor, String tier, String efecto, int durabilidad, double probabilidad, int recuperacion) {
        super(peso, valor, tier, efecto, durabilidad, probabilidad);
        this.recuperacion = recuperacion;
    }

    @Override
    public String toString(){
        return "La recuperación del consumible es: " + recuperacion;
    }

    public int getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(int recuperacion) {
        this.recuperacion = recuperacion;
    }   
    
    
}
