package TP3.Ejercicio_5;

public class B {
    private C b1;
    private char b2;
    public B (C p1, char p2) {
        b1 = p1;
        b2 = p2;
    }
    public C obtenerB1() {
        return b1;
    }
    public char obtenerB2() {
        return b2;
    }
    public B clone () {
        return new B(b1,b2);
    }
    public boolean equals(B p) {
        return (b1 == p.obtenerB1()&& b2 == p.obtenerB2());
    }
    public void copy(B b){
        b1 = b.obtenerB1();
        b2 = b.obtenerB2();
    }    
}
