package TP8.Ejercicio_6;

public class TesterConjunto {

    public static void main(String[] args) {
        Elemento a = new Letra('a');
        Elemento b = new Letra('b');
        Elemento c = new Letra('c');
        Elemento d = new Letra('d');

        Conjunto vacio = new Conjunto(5);

        Conjunto c1 = new Conjunto(10);
        c1.insertar(a);
        c1.insertar(b);
        c1.insertar(c);

        Conjunto c2 = new Conjunto(10);
        c2.insertar(c);
        c2.insertar(a);
        c2.insertar(b);

        Conjunto c3 = new Conjunto(10);
        c3.insertar(b);
        c3.insertar(d);

        probar("c1 y c2 equivalentes", c1, c2);
        probar("c1 y c3 solapados", c1, c3);
        probar("c1 y vacio", c1, vacio);
        probar("Vacio y otro vacio", vacio, new Conjunto(5));
    }

    private static void probar(String caso, Conjunto x, Conjunto y) {
        System.out.println("--- " + caso + " ---");

        boolean prop1 = x.esEquivalente(y) == (x.incluido(y) && y.incluido(x));
        System.out.println("esEquivalente <=> (X incl Y && Y incl X): " + prop1);

        boolean prop2 = x.esEquivalente(y) == (x.diferencia(y).vacio() && y.diferencia(x).vacio());
        System.out.println("esEquivalente <=> (X-Y vacio && Y-X vacio): " + prop2);

        boolean prop3 = x.disjunto(y) == x.interseccion(y).vacio();
        System.out.println("disjunto <=> (X inter Y).vacio(): " + prop3);

        boolean prop4 = x.disjunto(y) == (x.union(y).cardinalidad() == x.cardinalidad() + y.cardinalidad());
        System.out.println("disjunto <=> |X U Y| == |X| + |Y|: " + prop4);

        Conjunto unionEsperada = x.diferencia(y).union(x.interseccion(y)).union(y.diferencia(x));
        boolean prop5 = x.union(y).esEquivalente(unionEsperada);
        System.out.println("X U Y == ((X-Y) U (X inter Y) U (Y-X)): " + prop5);

        System.out.println();
    }
}