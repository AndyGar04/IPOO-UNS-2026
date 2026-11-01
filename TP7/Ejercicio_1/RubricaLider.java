package TP6.Ejercicio_5;

public class RubricaLider extends Rubrica{
    //<Atr Instancia>
    protected int gestionConflictos;
    protected int gestionCambios;

    //<Constructor>
    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l, c, a, r);
        gestionConflictos = go;
        gestionCambios = ga;
    }

    //<Comandos>
    public void establecerConflictos(int p){
        if(p < 0){
            gestionConflictos = 0;
        }else{
            gestionConflictos = p;
        }
    }

    public void establecerCambios(int p){
        if (p < 0){
            gestionCambios = 0;
        }else{
            gestionCambios = p;
        }
    }

    //<Consultas>
    public int obtenerConflictos(){
        return gestionConflictos;
    }

    public int obtenerCambios(){
        return gestionCambios;
    }

    public String toString(){
        return (super.toString() + " Gestion Cambios: " + gestionCambios + " Gestion Conflictos: " + gestionConflictos);
    }

    /* 
        En la clase RubricaLider:
            • total(): entero. Computa la suma de los atributos comunicacion, autonomía, responsabilidad,
            gestionConflictos y gestionCambios.
            • promedio(): real. Computa el promedio de los atributos comunicacion, autonomía,
            responsabilidad, gestionConflictos y gestionCambios. 
    */
    public int total(){
        return (super.total() + gestionCambios + gestionConflictos);
    }

    public double promedio(){
        return (comunicacion + autonomia + responsabilidad + gestionCambios + gestionConflictos)/5;
    }

    
}
