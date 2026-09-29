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
}
