package TP6.Ejercicio_1;

public class EnNube extends PlanBase {
    //<Atributo de instancia>
    protected int espacio;

    //<Constructor>
    public EnNube(int u, int b, int e){
        super(u, b);
        espacio = e;
    }

    //<Consultas>
    public int obtenerEspacio(){
        return espacio;
    }

    /* costoPlan(p:  entero):  entero.  Retorna  el valor  de  espacio  multiplicado  por p,  más  el  valor  base, más la cantidad de usuarios.  */
    public int costoPlan(int p){
        return espacio * p + usuarios;
    }
}
