package TP6.Ejercicio_13;

public class Dispositivo {
    protected final static double max = 0.01;

    protected double p1;
    protected double p2;

    public Dispositivo(double pU, double pD){
        p1 = pU;
        p2 = pD;
    }

    public void establecerP1(double p){
        p1 = p;
    }

    public void establecerP2(double p){
        p2 = p;
    }

    public void copy(Dispositivo d){
        if (d != null){
            p1 = d.obtenerP1();
            p2 = d.obtenerP2();
        }
    }

    public double obtenerP1(){
        return p1;
    }

    public double obtenerP2(){
        return p2;
    }
    
    // • riesgo(): boolean. Retorna true si p2 es mayor que p1.
    public boolean riesgo(){
        return p2 > p1;
    }

    // • emergencia(): boolean. Retorna true si p1 es menor a max.
    public boolean emergencia(){
        return p1 < max;
    }

    // • equals(d: Dispositivo): boolean. Dos instancias de Dispositivo son equivalentes si tienen el mismo estado interno.
    public boolean equals( Dispositivo s ) {
        boolean ig;
        if (this == s)
            ig = true;
        else if (s == null)
            ig = false;
        else if(getClass()!= s.getClass())
            ig = false;
        else {
            ig = (p1 == s.p1) && (p2 == s.p2);
        }
        return ig;
    }



}
