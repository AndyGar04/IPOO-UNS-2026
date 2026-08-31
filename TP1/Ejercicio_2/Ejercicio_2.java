package Ejercicio_2;
//EJERCICIO 2. EXPRESIONES -> Muestre la salida del siguiente segmento de código:

public class Ejercicio_2 {
    public static void main(String[] args) {
        int a, b;
        int c = 10;
        int d = 10;
        
        a = 2;
        a++;
        b = a++;
        c = ++a;

        System.out.println(a + " " + b);
        // Salida 5 3
        System.out.println(c + " " + d);
        // Salida 5 10

        a += b;
        b *= 2;
        c--;
        --d;
        
        System.out.println(a + " " + b);
        // Salida 8 6
        System.out.println(c + " " + d);
        // Salida 4 9
        
        a = 1; b = 1; c = 10; d = 10;
        System.out.println((a == b) || (a++ == b));
        // Salida true
        System.out.println((c == d) | (c++ == d));
        // Salida true
        System.out.println(a + " " + b);
        // Salida 1 1
        System.out.println(c + " " + d);
        // Salida 11 10
        
        a = 1; b = 1; c = 10; d = 10;
        System.out.println((a != b) & (--a != b));
        // Salida false
        System.out.println((c != d) && (--c != d));
        // Salida false
        System.out.println(a + " " + b);
        // Salida 0 1
        System.out.println(c + " " + d);
        // Salida 10 10
    }
}
