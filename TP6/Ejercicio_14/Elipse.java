package TP6.Ejercicio_14;

public class Elipse extends Figura {
    private double ejeMayor;
    private double ejeMenor;
    private Punto centro;

    public Elipse(double eMa, double eMe, Punto c) {
        this.ejeMayor = eMa;
        this.ejeMenor = eMe;
        this.centro = c;
    }

    public double area() {
        return Math.PI * ejeMayor * ejeMenor;
    }

    public double perimetro() {
        double a = ejeMayor / 2.0;
        double b = ejeMenor / 2.0;
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2.0);
    }

    public Punto centro() {
        return centro;
    }

    public boolean equals(Figura f) {
        boolean eq = false;
        if (f != null && this.getClass() == f.getClass()) {
            Elipse otra = (Elipse) f;
            eq = (this.ejeMayor == otra.ejeMayor) && 
                 (this.ejeMenor == otra.ejeMenor) && 
                 (this.centro.equals(otra.centro()));
        }
        return eq;
    }
}