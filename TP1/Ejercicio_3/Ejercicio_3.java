package Ejercicio_3;

public class Ejercicio_3 {
    public static void main (String[] args){
        /* Dadas las siguientes declaraciones */

        int a, b;

        /* Analice cada uno de los siguientes segmentos de código y determine si es sintácticamente 
        correcto. En los casos que así sea, muestre el valor de a y b. Si no es correcto, indique cuál 
        es el error.  */

        /*
        Es correcto y su salida es 1 y 3
        a = 1;
        b = 2;
        if (a>b) b++;
        System.out.print(a++);
        //1
        System.out.print(++b);
        //3
        */

        /*
        a = 1; 
        b = 2;
        if (a > b); Mala sintaxis, el if debe tener abierta las llaves o en su defecto en caso de tener una sola linea no tener nada
        a = b-1;
        else
        b = a+1;
        */ 

        /* 
        int d =10;
        if (a == d) Da error porque no esta inicializada "a" y no utiliza "b"
        d=0;
        */

        /* 
        a= 1;
        b= 2;
        if((a=20)>(b=10)) La sintaxis es correcta, e invierte los valores de a y b (los dos son 10) , sin embargo no devuelve nada
            a = b;
        else
            b = a; 
        */

        /*a= 1; b= 2; Sintaxis incorrecta, faltan las llaves en el if
        if (a == b+1)
        b = a;
        a = 0;
        else
        a = b;
        b = 0;
        */

        /*a = 1; b = 2;
        if (a == b) {
            a=b++;
            b++;
        }else{
            b=a++;
            a--; } Sintaxis correcta, si tuviera salida, seria b=2 y a=1
        */
    }
}
