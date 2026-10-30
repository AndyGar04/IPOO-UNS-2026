package TP6.Ejercicio_1;

public class PlanBase {
    // <Atributos de instancia>
    protected int usuarios;
    protected int base;
    
    // <Constructor>
    public PlanBase(int u,int b){
        usuarios = u;
        base = b;
    }

    // <Consultas>
    public int obtenerUsuarios(){
        return usuarios;
    }

    public int obtenerBase(){
        return base;
    }

    /* • costoPlan():  entero.  Retorna  el  valor  del  atributo  base  multiplicado  por  2,  más  la  cantidad  de usuarios multiplicada por 10.  */
    public int costoPlan(){
        return base * 2 + usuarios * 10;
    }
}
