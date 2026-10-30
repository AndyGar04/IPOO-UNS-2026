package TP6.Ejercicio_7;

public abstract class Alojamiento {
    //<Atributo de instancia>
    protected int id;
    protected int personas;

    //<Constructor>
    public Alojamiento(int id, int p){
        this.id = id;
        personas = p;
    }

    //<Consultas>
    public int obtenerId(){
        return id;
    }

    public int obtenerPersonas(){
        return personas;
    }

    public String toString(){
        return ("Este Alojamiento tiene: Id: "+ id + " y Personas: " + personas + ". ");
    }

    public abstract double costoDiario(int p);
}
