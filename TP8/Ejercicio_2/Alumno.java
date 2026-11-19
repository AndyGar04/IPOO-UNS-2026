package TP8.Ejercicio_2;

public class Alumno extends Elemento{
    private int nroIngreso;
    private String nombre;
    private float promedio;

    public Alumno(int l, String n, float p){
        nroIngreso = l;
        nombre = n;
        promedio = p;
    }

    public int obtenerNroIngreso(){
        return nroIngreso;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public float obtenerPromedio(){
        return promedio;
    }

    /*
    • esEquivalente(e: Elemento): boolean. Compara el estado interno del alumno que recibe el mensaje y el 
    que pasa como parámetro. Requiere que e sea de clase Alumno. 
    */
    public boolean esEquivalente(Elemento e){
        boolean eq=false;
        if (e == this){
            eq = true;
        }else if(getClass() == e.getClass()){
            Alumno a = (Alumno) e;
            eq = a.obtenerNroIngreso()==obtenerNroIngreso() && a.obtenerNombre()==obtenerNombre() && a.obtenerPromedio()==obtenerPromedio();
        }
        return eq;
    }

    /*
    esMayor(e: Elemento): boolean. Retorna true si el legajo del alumno que recibe el mensaje es mayor al 
    legajo del alumno que pasa como parámetro. Requiere que e sea de clase Alumno.
    */
    public boolean esMayor(Elemento e){
        boolean masViejo=false;
        if(getClass() == e.getClass()){
            Alumno a = (Alumno) e;
            masViejo = obtenerNroIngreso() > a.obtenerNroIngreso();
        }
        return masViejo;
    }
}
