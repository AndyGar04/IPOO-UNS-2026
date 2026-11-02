package TP7.Ejercicio_2;

public class Sensor {
    protected static final double max = 0.01;
    protected float p1, p2;

    public Sensor(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void establecerP1(float p) {
        p1 = p;
    }

    public void establecerP2(float p) {
        p2 = p;
    }

    public void copy(Sensor s) {
        if (s != null) {
            p1 = s.obtenerP1();
            p2 = s.obtenerP2();
        }
    }

    public float obtenerP1() { return p1; }
    public float obtenerP2() { return p2; }

    public boolean riesgo() {
        return p2 > p1;
    }

    public boolean emergencia() {
        return p1 > max;
    }

    public boolean equals(Sensor s) {
        boolean aux = false;
        if (this == s) {
            aux = true;
        } else if (s != null && this.getClass() == s.getClass()) {
            aux = (p1 == s.obtenerP1() && p2 == s.obtenerP2());
        }
        return aux;
    }

    public Sensor clone() {
        return new Sensor(this.p1, this.p2);
    }
}