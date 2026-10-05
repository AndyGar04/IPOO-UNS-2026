package TP4.Ejercicio_4;

public class Sensor {
    //Atributos de clase
    private static final double max = 0.01;
    //Atributos de instancia
    float p1, p2;

    Sensor(float p1, float p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    //Constructor
    public void establecerP1(float p){
        p1 = p;
    }

    public void establecerP2(float p){
        p2 = p;
    }

    public void copy(Sensor s){
        if (s != null){
            p1 = s.obtenerP1();
            p2 = s.obtenerP2();
        }
    }

    public float obtenerP1(){
        return p1;
    } 

    public float obtenerP2(){
        return p2;
    }

    public boolean riesgo(){
        return p2 > p1;
    }

    public boolean emergencia(){
        return p1 > max;
    }

    public boolean equals(Sensor s){
        boolean aux = false;
        if (s != null && p1 == s.obtenerP1() && p2 == s.obtenerP2()){
            aux = true;
        }
        return aux;
    }

    public Sensor clone() {
        return new Sensor(this.p1, this.p2);
    }
}    