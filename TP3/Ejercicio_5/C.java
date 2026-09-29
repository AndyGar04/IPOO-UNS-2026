package TP3.Ejercicio_5;

public class C {
    private int c1;
    private char c2;
    public C (int p1, char p2) {
        c1 = p1;
        c2 = p2;
    }
    public int obtenerC1() {
        return c1;
    }
    public char obtenerC2() {
        return c2;
    }
    public C clone () {
        return new C (c1,c2);
    }
    public boolean equals(C p) {
        return (c1 == p.obtenerC1() && c2 == p.obtenerC2());
    }
    public void copy(C c){
        c1 = c.obtenerC1();
        c2 = c.obtenerC2();
    }
}
