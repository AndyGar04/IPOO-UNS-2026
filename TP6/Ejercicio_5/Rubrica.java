package TP6.Ejercicio_5;

public class Rubrica {
    // <Atb Instancia>
    protected int legajo;
    protected int comunicacion;
    protected int autonomia;
    protected int responsabilidad;

    // <Constructor>
    public Rubrica(int l, int c, int a, int r){
            legajo = l;
            comunicacion = c;
            autonomia = a;
            responsabilidad = r;
    }

    //<Comandos>
    public void establecerComunicacion(int p){
        if (p < 0){
            comunicacion = 0;
        }else{
            comunicacion = p;
        }
    }

    public void establecerAutonomia(int p){
        if (p < 0){
            autonomia = 0;
        }else{
            autonomia = p;
        }
    }

    public void establecerResponsabilidad(int p){
        if (p < 0){
            responsabilidad = 0;
        }else{
            responsabilidad = p;
        }
    }

    //<Consultas>
    public int obtenerLegajo(){
        return legajo;
    }

    public int obtenerComunicacion(){
        return comunicacion;
    }

    public int obtenerAutonomia(){
        return autonomia;
    }

    public int obtenerResponsabilidad(){
        return responsabilidad;
    }

    /* 
        En la clase Rubrica:
        • total(): entero. Computa la suma de los atributos comunicacion, autonomia y responsabilidad.
        • promedio(): real. Computa el promedio de los atributo comunicacion, autonomía y responsabilidad.
        • productividad(): real. Computa 2 por comunicación más 3 por autonomía más 5 por responsabilidad.
    */
    public int total(){
        return comunicacion + autonomia + responsabilidad;
    }

    public double promedio(){
        return (comunicacion + autonomia + responsabilidad)/3;
    }

    public double productividad(){
        return (2*comunicacion + 3*autonomia + 5*responsabilidad);
    }

}
