package TP3.Ejercicio_5;

public class A {
    private B a1;
    private int a2;
    public A (B p1, int p2) {
        a1 = p1;
        a2 = p2;
    }
    public B obtenerA1(){
        return a1;
    }
    public int obtenerA2(){
        return a2;
    }
    public A clone () {
        return new A(a1.clone(), a2);
    }
    public boolean equals(A p) {
        return(a1.equals(p.obtenerA1()) && a2 == p.obtenerA2());
    }
    public void copy(A a){
        a1 = a.obtenerA1().clone();
        a2 = a.obtenerA2();
    }
}
