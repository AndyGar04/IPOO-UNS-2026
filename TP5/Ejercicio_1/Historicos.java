package TP5.Ejercicio_1;

public class Historicos {
    private int cant;
    private Jugador [] jugadoresHistoricos;

    // <<Constructor>>
    /* Historicos(n: entero) . Requiere n mayor a 0 */
    public Historicos(int n){
        jugadoresHistoricos = new Jugador[n];
        cant = 0; 
    }

    // <<Comandos>>
    /* establecerJugador(j: Jugador). Requiere que la colección no esté llena y j ligada. Asigna j a la posición
    cant e incrementa cant en 1. */
    public void establecerJugador(Jugador j){
        jugadoresHistoricos[cant]=j;
        cant++;
    }
    
    /* • ordenar(). Ordena la estructura por nombre de jugador usando el método de la burbuja.  */
    public void ordenar() {
        Jugador aux;
        for (int i = 0; i < cant - 1; i++) {
            for (int j = 0; j < cant - 1 - i; j++) {
                // compareTo retorna > 0 si el primer string es alfabéticamente mayor
                if (jugadoresHistoricos[j].obtenerNombre().compareTo(jugadoresHistoricos[j + 1].obtenerNombre()) > 0) {
                    aux = jugadoresHistoricos[j];
                    jugadoresHistoricos[j] = jugadoresHistoricos[j + 1];
                    jugadoresHistoricos[j + 1] = aux;
                }
            }
        }
    }

    //<<Consultas>>
    /* obtenerJugador(p: entero): Jugador. Requiere p válida. */
    public Jugador obtenerJugador(int p){
        return jugadoresHistoricos[p];
    }
    
    /* • mMayores(g, m: entero): boolean. Retorna true si la colección mantiene exactamente m jugadores
    con más de g goles convertidos. */
    public boolean mMayores(int g, int m){
        int cont = 0;
        if (m > 0 && m <= cant && g >= 0){
            for (int i=0; i < cant && cont <= m; i++){
                if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                    cont++;
                }
            }
        }
        return (cont == m);
    }

    /* • alMenosMMayores(g, m: entero): boolean. Retorna true si la colección mantiene al menos m
    jugadores con más de g goles convertidos. */
    public boolean alMenosMMayores(int g, int m){
        int cont = 0;
        if (m > 0 && m <= cant && g >= 0){
            for (int i=0; i < cant && cont < m ; i++){
                if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                    cont++;
                }
            }
        }
        return (cont == m);
    }

    /* goleadores(g: entero): Historicos. Retorna una nueva colección con los jugadores que hicieron más
    de g goles. */
    public Historicos goleadores(int g){
        Historicos nGoleadoras = new Historicos(cant);
        for (int i=0; i < cant; i++){
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                nGoleadoras.establecerJugador(jugadoresHistoricos[i]);
            }
        }
        return nGoleadoras;
    }
    

}
