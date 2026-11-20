package TP8.Ejercicio_4;

public class Empleado extends Elemento{
    protected  int legajo;
    protected String nombre;
    protected int cantHoras;
    protected double valorHoras;

    public Empleado(int leg, String nombre, int canth, double valorh){
        legajo = leg;
        this.nombre = nombre;
        cantHoras = canth;
        valorHoras = valorh; 
    }

    public int obtenerLegajo(){
        return legajo;
    }

    /* • obtenerSueldo(): real. Computa la cantidad de horas por el valor de la hora.  */
    public double obtenerSueldo(){
        return cantHoras*valorHoras;
    }

    public int obtenerCantHoras(){
        return cantHoras;
    }

    public double obtenerValorHoras(){
        return valorHoras;
    }

    public String obtenerNombre(){
        return nombre;
    }

    /*  • esEquivalente(e: Elemento): boolean y esMayor(e: Elemento): boolean. Comparan el legajo. Requieren que e 
    sea de clase Empleado.   */
    public boolean esEquivalente(Elemento e){
        boolean eq = false;
        if(e != null){    
            if (e == this){
                eq = true;
            }else if(getClass() == e.getClass()){
                Empleado em = (Empleado) e;
                eq = obtenerLegajo() == em.obtenerLegajo();
            }
        }
        return eq;        
    }

    public boolean esMayor(Elemento e){
        boolean esMayor = false;
        if (e != null && getClass() == e.getClass()){
            Empleado em = (Empleado) e; 
            esMayor = em.obtenerLegajo() < obtenerLegajo();
        }
        return esMayor;
    }
}
