package model;

public abstract class Objeto{

    private double peso;
    private double valor;
    private String tier;
    private String efecto;
    private int durabilidad;
    private double probabilidad;

    public Objeto(double peso, double valor, String tier, String efecto, int durabilidad, double probabilidad){
        this.peso = peso;
        this.valor = valor;
        this.tier = tier;
        this.efecto = efecto;
        this.durabilidad = durabilidad;
        this.probabilidad = probabilidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    
}