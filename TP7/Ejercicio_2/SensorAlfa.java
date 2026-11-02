package TP7.Ejercicio_2;

public class SensorAlfa extends Sensor {
    protected float p3, p4;

    public SensorAlfa(float pU, float pD, float pT, float pC) {
        super(pU, pD);
        p3 = pT;
        p4 = pC;
    }

    public void establecerP3(float p) { p3 = p; }
    public void establecerP4(float p) { p4 = p; }
    public float obtenerP3() { return p3; }
    public float obtenerP4() { return p4; }

    public boolean riesgo() {
        // Redefinición
        return super.riesgo() || p4 > p3;
    }

    public boolean emergencia() {
        return p4 < max;
    }

    public void copy(SensorAlfa s) {
        if (s != null) {
            super.copy(s); // Copia p1 y p2
            p3 = s.obtenerP3();
            p4 = s.obtenerP4();
        }
    }

    public boolean equals(Sensor s) {
        boolean ig = false;
        if (this == s) {
            ig = true;
        } else if (s != null && this.getClass() == s.getClass()) {
            SensorAlfa sAlfa = (SensorAlfa) s;
            ig = super.equals(s) && (p3 == sAlfa.obtenerP3() && p4 == sAlfa.obtenerP4());
        }
        return ig;
    }

    public SensorAlfa clone() {
        return new SensorAlfa(p1, p2, p3, p4);
    }
}