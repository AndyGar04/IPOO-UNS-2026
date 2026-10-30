package TP6.Ejercicio_2;

public class PolizaEscolar extends Poliza {
    //<Atributos de insancia>
    protected int cantAlumnos;
    protected int cantDocentes;
    
    //<Constructor>
    public PolizaEscolar(int np){
        super(np);
    }
    public PolizaEscolar(int np, float i, float r, int ca, int cd){
        super(np, i, r);
        cantAlumnos = ca;
        cantDocentes = cd;
    }

    // <Comandos>
    public void establecerCantAlumnos(int n){
        if (n < 0){
            cantAlumnos = 0;
        }else{
            cantAlumnos = n;
        }
    }

    public void establecerCantDocentes(int n){
        if (n < 0){
            cantDocentes = 0;
        }else{
            cantDocentes = n;
        }
    }

    // <Consultas>
    public int obtenerCantAlumnos(){
        return cantAlumnos;
    }

    public int obtenerCantOperarios(){
        return cantDocentes;
    }

    /* • obtenerCostoPoliza(p: entero): real. Se computa como el costo de cualquier póliza, más cantAlumnos por p por 1.5, más cantDocentes por p. */
    public double obtenerCostoPoliza(int p){
        return (super.obtenerCostoPoliza() + cantAlumnos * p * 1.5 + cantDocentes * p);
    }
}
