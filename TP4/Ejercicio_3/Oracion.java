package TP4.Ejercicio_3;

import TP4.Ejercicio_2.SecuenciaEnteros;

public class Oracion {
    // <<Atributos de instancia>>    
    private char[] s; 
    
    // <<Constructor>>
    /*
    • Oracion(str: String). Requiere que:
        - la cadena stresté formada por una o más palabras separadas por al menos un blanco
        - comienza con una palabra y termina con un blanco
        - cada palabra de la oración esté formada por una o más letras mayúsculas
    */
    public Oracion(String str){
        s = new char[str.length()];

        for (int i = 0; i < str.length(); i++){
            s[i] = str.charAt(i);
        }
    }

    // <<Comandos>>
    public void establecerLetra(int pos, char l){
        s[pos] = l;
    }

    /*
    • reducirBlancos(). Reemplaza las secuencias de dos o más blancos por un solo blanco, excepto al
        final de la oración. La oración
        "HOY VA A LLOVER A LA TARDE " se transforma en
        "HOY VA A LLOVER A LA TARDE "" 
    */
    private void arrastrar(int pos){
        for (int i = pos; i < longitud()-1; i++){
            s[i] = s[i+1];
        }
        s[longitud()-1]=' ';
    }

    public void reducirBlancos(){
        for (int i=0; i < longitud()-1; i++){
            if (s[i] == ' ' && s[i+1] == ' '){
                arrastrar(i+1);
            }
        }
    }

    // <<Consultas>>
    /*
        • obtenerLetra(pos:entero):char y establecerLetra(pos:entero, l:char). Requieren que la posición
        possea válida y l sea una letra mayúscula o un espacio en blanco. 
    */
    public char obtenerLetra(int pos){
        return s[pos];
    }

    /*
     • esLetra(pos:entero):boolean. Retorna verdadero siempre que pos sea una posición válida y en
        esa posición se haya asignado una letra, sino retorna falso. 
    */
    public boolean esLetra(int pos){
        boolean esLetra = false;
        if (pos < s.length && pos >= 0 && s[pos] != ' '){
            esLetra = true;
        }

        return esLetra;
    }

    public int longitud(){
        return s.length;
    }

    /*
    • esPrimeraPalabra(pos:entero):boolean. Retorna verdadero siempre que pos sea una posición
        válida, en esa posición se haya asignado una letra y sea la primera de una palabra. 
    */
    public boolean esPrimeraPalabra(int pos){
        boolean esPri = false;
        if (pos < longitud() && pos >=0){
            esPri = (esLetra(pos) && (pos == 0 || s[pos - 1] == ' '));
        }
        return esPri;
    }

    /* 
    contarPalabras(): entero. Retorna la cantidad de palabras de la oración.
    */
    public int contarPalabras(){
        int cant = 0;
        for (int i = 0; i < longitud(); i++) {
            if (esPrimeraPalabra(i)) {
                cant++;
            }
        }
        return cant;
    }

    // masLarga():entero. Retorna la longitud de la palabra más larga.
    public int masLarga(){
        int max = 0;
        int actual = 0;
        for (int i = 0; i < longitud(); i++) {
            if (esLetra(i)) {
                actual++;
                if (actual > max) {
                    max = actual;
                }
            } else {
                actual = 0;
            }
        }
        return max;
    }

    /*
    • hayNVocales(n: entero): boolean. Retorna true si y solo sí la oración contiene exactamente n
        vocales. 
    */
    public boolean hayNVocales(int n){
        int contVocales = 0;
        if (n < longitud() && n <= 0){
            for (int i = 0; i < longitud() && contVocales <=n ; i++){
                if (esVocal(i)){
                    contVocales++;
                }
            }
        }
        return contVocales == n;
    }

    /*
        • dosVocalesConsecutivas():boolean. Retorna true si alguna palabra contiene dos vocales en
        posiciones consecutivas. 
    */
    private boolean esVocal(int pos){
        return (s[pos] == 'a' || s[pos] == 'A' || s[pos] == 'e' || s[pos] == 'E' || s[pos] == 'i' ||
         s[pos] == 'I' || s[pos] == 'o' || s[pos] == 'O' || s[pos] == 'u' || s[pos] == 'U'); 
    }

    public boolean dosVocalesConsecutivas(){
        boolean dosConsec = false;
        for (int i = 0; i < longitud()-1 && !dosConsec; i++){
                if (esVocal(i) && esVocal(i+1)){
                    dosConsec = true;
                }    
            }
        return dosConsec;
    }

    /*
    • histograma():SecuenciaEnteros. Retorna un objeto de clase SecuenciaEnteros que registra la
        cantidad de apariciones de cada letra del alfabeto en la oración que recibe el mensaje. Observe
        que la cantidad de elementos de SecuenciaEnteros corresponde a la cantidad de letras del
        alfabeto
    */
    public SecuenciaEnteros histograma() {
        SecuenciaEnteros seq = new SecuenciaEnteros(26);
        
        for (int i = 0; i < longitud(); i++) {
            if (esLetra(i)) {
                int indice = s[i] - 'A'; 
                
                // Verificamos que sea una letra válida del abecedario inglés (A-Z)
                if (indice >= 0 && indice < 26) {
                    int cantidadActual = seq.obtenerEntero(indice);
                    seq.establecerEntero(indice, cantidadActual + 1);
                }
            }
        }
        return seq;
    }

}
