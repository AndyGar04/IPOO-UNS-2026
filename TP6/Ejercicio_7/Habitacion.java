package TP6.Ejercicio_7;

public class Habitacion extends Alojamiento {
    // <Atributos de instancia>
    protected int camas;

    // <Constructor>
    public Habitacion(int id, int p, int c){
        super(id, p);
        camas = c;
    }

    // <Consultas>
    public int obtenerCamas(){
        return camas;
    }

    public double costoDiario(int p){
        return camas * p * obtenerPersonas() / 2;
    }

}
