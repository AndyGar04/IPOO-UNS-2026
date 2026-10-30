package TP6.Ejercicio_10;

public class TestEje10 {
    public static void main(String[] args) {
        Uno u1, u2, u3, u4;
        Dos d1, d2, d3;
        Tres t1, t2;
        u1 = new Uno();
        u2 = new Dos();
        u3 = new Tres();
        t1 = new Tres();
        t2 = (Tres) u3;
        u4 = t1;
        d1 = new Dos();
        d2 = new Tres();
        d3 = t2;

        System.out.println("f "+u1.f()+" "+ u2.f()+" "+ u3.f()+" "+ u4.f()); // No da error
        System.out.println("g "+u1.g()+" "+ u2.g()+" "+ u3.g()+" "+ u4.g()); // No da error
        System.out.println("h "+u1.h()+" "+ u2.h()+" "+ u3.h()+" "+ u4.h()); // No da error
        System.out.println("m "+u1.m(8)+" "+ u2.m(8)+" "+ u3.m(8)+" "+ u4.m(8)); // No da error
        System.out.println("f "+d1.f() +" "+ d2.f()+" "+ d3.f() ); // No da error
        System.out.println("g "+d1.g()+" "+ d2.g()); // No da error
        System.out.println(("h "+d1.h()+" "+ d2.h())); //No da error
        System.out.println(("m "+d1.m(20)+" "+ d2.m(20))); 
        System.out.println(" f "+ t1.f()+" "+t2.f());
        System.out.println(" g "+ t1.g()+" "+t2.g());
        System.out.println(" h "+ t1.h()+" "+t2.h());
        System.out.println(" m "+ t1.m(3)+" "+t2.m(3));
        // System.out.println("l "+u2.l()+" "+ u4.l()); // Error en compilacion
        System.out.println("l "+d1.l()+" "+ d2.l());
        // System.out.println("n "+d1.n()+" "+ d2.n()); // Error de compilacion

    }
}
