package TP4.Ejercicio_6;

public class TableroSensores {
    // <<Atributos de instancia>>
    Sensor [][] grilla;

    //<<Constructor>>
    public TableroSensores(int cantFil, int cantCol){ //Requiere cantFil, cantCol> 0.
        grilla = new Sensor[cantFil][cantCol];
    }

    // <<Comandos>>
    //• establecerSensor(f, c: entero, s: Sensor ). Requiere 0 <= f <cantFilas() y 0 <= c <cantColumnas().
    public void establecerSensor(int f, int c, Sensor s){
        grilla[f][c] = s;
    }

    // • intercambiar(f1,f2:entero). Requiere 1 <= f1,f2<= cantFilas(). Intercambia los sensores de las filas f1 y f2.
    public void intercambiar(int f1, int f2) {
        int i1 = f1 - 1;
        int i2 = f2 - 1;
        Sensor[] aux = grilla[i1];
        grilla[i1] = grilla[i2];
        grilla[i2] = aux;
    }

    /* 
        • copy(t: TableroSensores). Si el parámetro t está ligado y el tablero que recibe el mensaje y el que
        pasa como parámetro tienen la misma cantidad de filas y columnas, implementa copy superficial,
        en caso contrario no tiene ningún efecto. 
    */
    public void copy(TableroSensores t) {
        if (t != null && t.cantColumnas() == cantColumnas() && t.cantFilas() == cantFilas()) {
            for (int i = 0; i < cantFilas(); i++) {
                for (int j = 0; j < cantColumnas(); j++) {
                    establecerSensor(i, j, t.obtenerSensor(i, j));
                }
            }
        }       
    }

    // <<Consultas>>
    public int cantFilas(){
        return grilla[0].length;
    }

    public int cantColumnas(){
        return grilla.length;
    }

    // • obtenerSensor(f,c:entero):Sensor. Requiere 0 <=f <cantFilas() y 0 <=c <cantColumnas().
    public Sensor obtenerSensor(int f, int c){
        return grilla[f][c];
    }

    // • cantidadFilasRiesgo():entero. Retorna la cantidad de filas que contienen al menos un sensor en riesgo.
    public int cantidadFilasRiesgo() {
        int contFilas = 0;
        if (grilla != null) {
            for (int i = 0; i < cantFilas(); i++) {
                boolean hayUnaEnRiesgo = false;
                for (int j = 0; j < cantColumnas() && !hayUnaEnRiesgo; j++) {
                    if (grilla[i][j] != null && grilla[i][j].riesgo()) {    
                        contFilas++;
                        hayUnaEnRiesgo = true;
                    }    
                }
            }
        }
        return contFilas;    
    }

    // • todosEnEmergencia():boolean. Retorna true si todos los sensores de la grilla están en riesgo.
    public boolean todosEnEmergencia() {
        boolean estanTodos = false;
        if (grilla != null) { 
            estanTodos = true;
            for (int i = 0; i < cantFilas() && estanTodos; i++) {
                for (int j = 0; j < cantColumnas() && estanTodos; j++) {
                    // Protegemos contra null y unificamos el criterio (riesgo vs emergencia)
                    if (grilla[i][j] == null || !grilla[i][j].riesgo()) {
                        estanTodos = false;
                    }
                }
            }
        }    
        return estanTodos;
    }

    /*
        • hayNRiesgoCol(c,n:entero): boolean. Retorna true si hay a lo sumo n sensores en riesgo en la
    columna c. Requiere 0 <=c <cantColumnas().
    */
    public boolean hayNRiesgoCol(int c, int n) {
        int cont = 0;
        for (int i = 0; i < cantFilas() && cont <= n; i++) {
            if (grilla[i][c] != null && grilla[i][c].riesgo()) {
                cont++;
            }
        }
        return cont <= n;
    }

    /* 
        • dosConsecutivosEmergenciaFila(f:entero):boolean. Requiere 0 <=f <cantFilas(). Retorna true si la fila
        f contiene dos sensores en riesgo en posiciones consecutivas. 
    */
    public boolean dosConsecutivosEmergenciaFila(int f) {
        boolean dosConsec = false;
        for(int i = 0; i < cantColumnas() - 1 && !dosConsec; i++) {
            if (grilla[f][i] != null && grilla[f][i+1] != null && 
                grilla[f][i].emergencia() && grilla[f][i+1].emergencia()) {
                dosConsec = true;
            }
        }
        return dosConsec;
    }

    /*
        • contarCoincidencias(gs:TableroSensores):entero. Retorna la cantidad de sensores que, ocupando la
        misma posición en las dos grillas, tienen el mismo estado interno. 
    */
    public int contarCoincidencias(TableroSensores gs) {
        int cont = 0;
        if (gs != null && gs.cantColumnas() == cantColumnas() && gs.cantFilas() == cantFilas()) {
            for(int i = 0; i < cantFilas(); i++) {
                for(int j = 0; j < cantColumnas(); j++) {
                    if (grilla[i][j] != null && grilla[i][j].equals(gs.obtenerSensor(i, j))) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    
    /* • equals(t: TableroSensores):boolean. Retorna true si y solo sí el tablero que recibe el     
    mensaje y el que pasa como parámetro tienen sensores equivalentes en exactamente las mismas 
    posiciones. */
    public boolean equals(TableroSensores t) {
        boolean eq = false;
        if (t != null && t.cantColumnas() == cantColumnas() && t.cantFilas() == cantFilas()) {
            eq = true;
            for (int i = 0; i < cantFilas() && eq; i++) {
                for (int j = 0; j < cantColumnas() && eq; j++) {
                    if (grilla[i][j] != null) {
                        eq = grilla[i][j].equals(t.obtenerSensor(i, j));
                    } else {
                        eq = (t.obtenerSensor(i, j) == null);
                    }
                }
            }
        }
        return eq;
    }
    
    /*
    • clone():TableroSensores. Implementa clone en profundidad. Requiere que todas las referencias del
    arreglo estén ligadas al momento de clonar.
    */

    public TableroSensores clone() {
        TableroSensores nuevoTs = new TableroSensores(cantFilas(), cantColumnas());
        for (int i = 0; i < cantFilas(); i++) {
            for (int j = 0; j < cantColumnas(); j++) {
                if (grilla[i][j] != null) {
                    // Clonación en profundidad utilizando el clone del propio TDA
                    nuevoTs.establecerSensor(i, j, grilla[i][j].clone());
                }
            }
        }
        return nuevoTs;
    }

}



