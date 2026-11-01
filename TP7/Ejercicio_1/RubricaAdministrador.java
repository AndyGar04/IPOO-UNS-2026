package TP6.Ejercicio_5;

public class RubricaAdministrador extends RubricaLider{
    protected int proyectos;

    public RubricaAdministrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l,c,a,r,go,ga);
        proyectos = p;
    }

    public void aumentarProyectos(){
        proyectos++;
    }

    public int obtenerProyectos(){
        return proyectos;
    }

    public String toString(){
        return super.toString() + " Proyectos: " + proyectos;
    }

    /* 
    En la clase RubricaAdministrador:
    • productividad(): real. Computa 4 por su promedio más proyectos por 10. 
    */
    public double productividad(){
        return 4 * promedio() + proyectos * 10;
    }
}
