package model;

public class Controladora {
 
    private Entrenamiento[] entrenamientos; 

    public Controladora(){
       
        entrenamientos = new Entrenamiento[3];

    }

    public boolean registrarTipoEntrenamiento(String tipo, int duracionMaxima){

        Entrenamiento nuevoEntrenamiento = new Entrenamiento(tipo, duracionMaxima);
        boolean indicador = false;

        for(int i =0; i<entrenamientos.length;i++){
            
            if(entrenamientos[i]==null && !indicador){
                entrenamientos[i] = nuevoEntrenamiento;
                indicador = true;
            }
           

        }
        
        return indicador;

    }

    public boolean registrarTipoEntrenamiento2(String tipo, int duracionMaxima){

        Entrenamiento nuevoEntrenamiento = new Entrenamiento(tipo, duracionMaxima);
       
        for(int i =0; i<entrenamientos.length;i++){
            
            if(entrenamientos[i]==null){
                entrenamientos[i] = nuevoEntrenamiento;
                return true;
            }
           

        }
        
        return false;

    }

    public String consultarInfo(){

        String msg = "";

            for(int i=0; i<entrenamientos.length; i++){

                if(entrenamientos[i]!=null){
                    msg += "\n"+entrenamientos[i].toString();
                }
               

            }

        return msg;


    }


}
