package TP4.Ejercicio_2;

public class SecuenciaEnteros {
    //<<Atributos de instancia>>
    private int [] sec;

    //<<Constructor>>
    // SecuenciaEnteros(cant: entero). Requiere cant> 10
    public SecuenciaEnteros(int cant){
        sec = new int[cant];
    }

    //<<Comandos>>
    //  establecerEntero(p,n:entero). Requiere 0 <= p <cantElementos().
    public void establecerEntero(int p, int n){
        sec [p] = n;
    }

    //reemplazar(n1,n2:entero). Reemplaza toda aparición de n1 por n2 en sec.
    public void reemplazar(int n1, int n2){
        for (int i=0; i< cantElementos() ; i++){
            if (sec[i] == n1){
                sec[i] = n2;
            }
        }
    }

    /* 
        reemplazar(n:entero). Reemplaza la primera y la última aparición de n por 0 en sec. Si solo hay 
        una aparición de n en sec, la reemplaza por 0 y si no hay ninguna no provoca ningún efecto. 
    */
    public void reemplazar(int n){
        int contadorDeN = 0;
        int pos = -1;

        for (int i=0; i < cantElementos(); i++){
            if (sec[i] == n){
                if (contadorDeN < 1){
                    sec[i] = 0;
                }
                contadorDeN++;
                pos = i;
            }
        }

        if (contadorDeN > 1){
            sec [pos] = 0;   
        }

    }

    /*
        intercambiar(p1,p2:entero):boolean. Si 0 <= p1, p2 <cantElementos() intercambia los elementos
    que ocupan las posiciones p1 y p2 en sec y retorna true, sino retorna false.  
    */
    public void intercambiar(int p1, int p2){
        if (p1 <= 0 && p2 < cantElementos()){
            sec[p1] = sec[p2];
        }
    }

    /* 
            copy(a:SecuenciaEnteros):boolean. Si el parámetro a está ligado y tiene la misma cantidad de
        elementos que el objeto que recibe el mensaje, retorna true y copia cada elemento de la secuencia
        en el objeto que recibe el mensaje, manteniendo la misma posición; sino retorna false. 
    */
    public boolean copy(SecuenciaEnteros a){
        boolean esEvaluable = false;
        if (a != null && a.cantElementos() == cantElementos()){
            for (int i = 0; i < cantElementos(); i++){
                establecerEntero(i, sec[i]);
            }
        }
        return esEvaluable;
    }
    
    //<<Consultas>>
    public int cantElementos(){
        return sec.length;
    }

    public int obtenerEntero(int p){
        return sec[p];
    }

    public int total(){
        int suma = 0;
        for (int i=0; i < cantElementos();i++){
            suma+= sec[i];
        }
        return suma;
    }

    //estaNum(n:entero): boolean. Retorna true si y solo sí al menos un número en la secuencia es igual a n
    public boolean estaNum(int n){
        boolean esta = false;
        for (int i=0; i < cantElementos() && !esta; i++){
            esta = true;
        }
        return esta;
    }

    //cantidadMayores(n:entero):entero. Retorna la cantidad de números mayores a n.
    public int cantidadMayores(int n){
        int cont = 0;
        for (int i=0; i < cantElementos(); i++){
            if (sec[i] > n){
                cont++;
            }
        }
        return cont;
    }

    //mitadMayores(n:entero):boolean. Retorna true si al menos la mitad de los números son mayores a n
    public boolean mitadMayores(int n){
        int contMayores = 0;
        boolean mitadMayor = false;
        for(int i=0; i < cantElementos(); i++){
            if (sec[i] < n){
                contMayores++;
            }
        }
        if (contMayores > cantElementos()/2){
            mitadMayor = true;
        }
        return mitadMayor;
    }


    /*
        equals(a:SecuenciaEnteros)
        clone():SecuenciaEnteros
    */

    public boolean equals(SecuenciaEnteros a){
        boolean esIgual = true;
        if (a != null){
            for(int i=0; i<cantElementos() && esIgual; i++){
                if (sec[i] != a.obtenerEntero(i)){
                    esIgual = false;
                }
            }
        }
        return esIgual;
    }

    public SecuenciaEnteros clone(){
        SecuenciaEnteros se = new SecuenciaEnteros(cantElementos());
        for (int i=0; i<cantElementos(); i++){
            se.establecerEntero(i, sec[i]);
        }
        return se;
    }
}
