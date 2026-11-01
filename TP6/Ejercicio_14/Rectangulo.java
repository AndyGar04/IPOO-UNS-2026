package TP6.Ejercicio_14;

public class Rectangulo extends Figura {
    private double ladoMayor;
    private double ladoMenor;
    private Punto centro;

    public Rectangulo(double lMa, double lMe, Punto c) {
        this.ladoMayor = lMa;
        this.ladoMenor = lMe;
        this.centro = c;
    }

    public double area() {
        return ladoMayor * ladoMenor;
    }

    public double perimetro() {
        return 2 * (ladoMayor + ladoMenor);
    }

    public Punto centro() {
        return centro;
    }

    public boolean equals(Figura f) {
        boolean eq = false;
        if (f != null && this.getClass() == f.getClass()) {
            Rectangulo otro = (Rectangulo) f;
            eq = (this.ladoMayor == otro.ladoMayor) && 
                 (this.ladoMenor == otro.ladoMenor) && 
                 (this.centro.equals(otro.centro()));
        }
        return eq;
    }
}