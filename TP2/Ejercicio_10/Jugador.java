package TP2.Ejercicio_10;

class Jugador {
    //<<Atributos de instancia>>
    private String nombre;
    private int nroCamiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;

    //<<Constructor>>
    public Jugador(String nom){
        nombre = nom;
    }

    //<<Comandos>>
    public void establecerNroCamiseta(int n){
        nroCamiseta = n;
    }

    public void establecerPosicion(int n){
        posicion = n;
    }

    public void establecerGolesConvertidos(int n){
        golesConvertidos = n;
    }

    public void establecerPartidosJugados(int n){
        partidosJugados = n;
    }

    public void aumentarGoles(int n){
        golesConvertidos += n;
    }

    public void aumentarUnPartido(){
        partidosJugados += 1;
    }

    //<<Consultas>>
    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }

    public int obtenerPosicion(){
        return posicion;
    }

    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }

    public int promedioGolesXPart(){
        return golesConvertidos/partidosJugados;
    }

    /* masGoles(j: Jugador): boolean. Devuelve true si el jugador que recibe el mensaje tiene más goles 
    que el jugador que pasa como parámetro, en caso contrario retorna false.  */

    public boolean masGoles(Jugador j){
        boolean aux = false;
        if (golesConvertidos >= j.obtenerGolesConvertidos()){
            aux = true;
        }
        return aux;
    }
}
