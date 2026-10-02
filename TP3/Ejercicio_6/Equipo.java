package TP3.Ejercicio_6;

/* 
• equals(e: Equipo): boolean. Requiere e ligado, se implementa en profundidad. 
*/

public class Equipo {
    // <<Atributos de instancia>>
    private String nombre;
    private Jugador capitan;
    private int pG, pE, pP;
    private int gFavor, gContra;
    
    // <<Constructor>>
    /* • Equipo(nom: String, cap: Jugador). Requiere nom y cap ligados */
    public Equipo(String nom, Jugador cap){
        nombre = nom;
        capitan = cap;
    }

    // <<Consultas>>

    public String obtenerNombre(){
        return nombre;
    }
    
    public Jugador obtenerCapitan(){
        return capitan;
    }

    public int obtenerPG(){
        return pG;
    }

    public int obtenerPE(){
        return pE;
    }

    public int obtenerPP(){
        return pP;
    }

    public int obtenerGFavor(){
        return gFavor;
    }

    public int obtenerGContra(){
        return gContra;
    }
   
    /*
     • obtenerPuntos(): entero. Se computa considerando que por cada partido ganado se obtienen 3
    puntos y por cada empate se logra 1.
    */
    public int obtenerPuntos(){
        return pG * 3 + pE; 
    }

    /*
     • obtenerPartidos(): entero. La cantidad de partidos es la suma de los partidos ganados, perdidos y
    empatados.
    */
    public int obtenerPartidos(){
        return pE + pG + pP;
    }

    /*
     • mejorPuntaje(e: Equipo): Equipo. Retorna el equipo con más puntaje, si los dos equipos tienen los
    mismos puntos, devuelve el que tiene mayor cantidad de goles a favor y si también hay coincidencia,
    el que tiene menos goles en contra. Si hay coincidencia devuelve el equipo que recibe el mensaje.
    */

    public Equipo mejorPuntaje(Equipo e){
        Equipo mejor = null;
        if (this.obtenerPuntos() > e.obtenerPuntos()){
            mejor = this;
        } else if (this.obtenerPuntos() < e.obtenerPuntos()){
            mejor = e;
        } else {
            if (this.obtenerGFavor() > e.obtenerGFavor()){
                mejor = this;
            } else if (this.obtenerGFavor() < e.obtenerGFavor()){
                mejor = e;
            } else {
                if (this.obtenerGContra() < e.obtenerGContra()){
                    mejor = this;
                } else if (this.obtenerGContra() > e.obtenerGContra()){
                    mejor = e;
                } else {
                    mejor = this;
                }
            }
        }
        return mejor;
    }

    public Jugador capitanConMasGoles(Equipo e){
        Jugador capitanMasGoles = null;
        if (this.capitan.obtenerGolesConvertidos() > e.capitan.obtenerGolesConvertidos()){
            capitanMasGoles = this.capitan;
        } else if (this.capitan.obtenerGolesConvertidos() < e.capitan.obtenerGolesConvertidos()){
            capitanMasGoles = e.capitan;
        } else {
            capitanMasGoles = this.capitan;
        }
        return capitanMasGoles;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nCapitan: " + capitan.obtenerNombre() + "\nPartidos Ganados: " + pG + "\nPartidos Empatados: " + pE + "\nPartidos Perdidos: " + pP + "\nGoles a Favor: " + gFavor + "\nGoles en Contra: " + gContra;
    }

    // equals(e:Equipo): boolean. Si e no está ligado retorna false, se implementa superficial. 

    public boolean equals(Equipo e){
        boolean iguales = false;
        if (e != null){
            iguales = this.nombre.equals(e.nombre) && this.capitan.equals(e.capitan) && this.pG == e.pG && this.pE == e.pE && this.pP == e.pP && this.gFavor == e.gFavor && this.gContra == e.gContra;
        }
        return iguales;
    }
    // <<Comandos>>
    /*
      • incrementarPG(jugoElCap: boolean), incrementarPE(jugoElCap: boolean) incrementarPP(jugoElCap:boolean).
     Aumentan en 1 los partidos del equipo y si corresponde envía un mensaje al capitán para que 
     incremente en 1 sus partidos. 
    */
    public void incrementarPG(boolean jugoElCap){
        pG++;
        if (jugoElCap){
            capitan.aumentarUnPartido();
        }
    }

    public void incrementarPE(boolean jugoElCap){
        pE++;
        if (jugoElCap){
            capitan.aumentarUnPartido();
        }
    }

    public void incrementarPP(boolean jugoElCap){
        pP++;
        if (jugoElCap){
            capitan.aumentarUnPartido();
        }
    }

    /* 
     • aumentarGfavor(total, delCap: entero). Aumenta los goles del equipo y si corresponde envía un
    mensaje al capitán para actualizar sus goles. delCap indica cuántos goles marcados son del capitán.
    */
    public void aumentarGfavor(int total, int delCap){
        if (total >= 0 && delCap >= 0){
            gFavor =+ total;
            capitan.aumentarGoles(delCap); 
        }
    }

    public void aumentarGcontra(int total){
        if (total >= 0){
            gContra =+ total;
        }
    }

}
