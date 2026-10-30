package TP6.Ejercicio_7;

public class Departamento extends Alojamiento{
    // <Atributos de intancia>
    protected int ambientes;
    protected boolean balcon; 

    // <Constructor>
    public Departamento(int id, int p, int a, boolean b){
        super(id, p);
        ambientes = a;
        balcon = b;
    }

    //<Consultas>
    public boolean tieneBalcon(){
        return balcon;
    }

    /*
    • costoDiario(p: entero): real. Computa la cantidad de ambientes por p y suma 150 si tiene balcón.
    */
    public double costoDiario(int p){
        double ret = ambientes * obtenerPersonas() * p;
        if (balcon){
            ret += 150; 
        }
        return ret; 
    }
}
