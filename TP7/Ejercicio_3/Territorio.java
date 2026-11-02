package TP7.Ejercicio_3;

public class Territorio {
    protected Refugio[][] t;

    public Territorio(int nf, int nc){
            t = new Refugio[nf][nc];
    }

    /* establecerRefugio(r: Refugio, f, c: entero): boolean. Asigna el refugio r a la posición f, c y retorna true si 0 <= f < cantFilas() y 0 <= c < cantColumnas, sino retorna false.  */
    public boolean establecerRefugio(Refugio r, int f, int c){
        boolean establecio = false;
        if (0 <=f && f < cantFilas() && 0<=c && c < cantColumas()){
            t[f][c] = r;
            establecio = true;
        }
        return establecio;
    }

    public int cantFilas(){
        return t.length;
    }
    
    public int cantColumas(){
        return t[0].length;
    }

    public int cantRefugios(){
        int cont=0;
        for (int i = 0; i<cantFilas(); i++){
            for (int j = 0; j < cantColumas(); j++){
                if (t[i][j] != null){
                    cont ++;
                }
            }
        }
        return cont;
    }

    /*
    filaMasPoblada(): entero. Retorna la fila con mayor número de refugios, si hay más de una con ese valor retorna la primera.  
    */
    public int filaMasPoblada(){
        int filaMP=0;
        int cont=0;
        int contMasPoblada=0;
        for (int i=0; i < cantFilas(); i++){
            cont = 0;
            for (int j=0; j < cantColumas(); j++){
                if(t[i][j] != null){
                    cont++;
                }
            }
            if (cont > contMasPoblada){
                filaMP=i;
                contMasPoblada = cont;
            }
        }
        return filaMP;
    }

    /* maximoNRefugiosHabitables(f,  n:  entero):  boolean Retorna  true  si  la  fila  f  contiene,  a  lo  sumo,  n  refugios habitables. */
    public boolean maximoNRefugiosHabitables(int f, int n){
        int cont=0;
        if (f < cantFilas() && f >= 0 && n >= 0 && n < cantFilas()){
            for (int j = 0; j < cantColumas() && cont <= n; j++){
                if (t[f][j] != null && t[f][j].esHabitable()){
                    cont ++;
                }
            }
        }
        return cont <=n;
    }

    /*
    cantConDisponibilidadMayor(m:  entero):  entero.  Computa  cuántas  columnas  tienen  un  refugio  con disponibilidad mayor a m.   
    */
    public int cantConDisponibilidadMayor(int m){
        int cont=0;
        boolean hayUno;
        for (int j=0; j < cantColumas() ; j++){
            hayUno = false;
            for (int i=0; i < cantFilas() && !hayUno; i++){
                if (t[i][j] != null && t[i][j].disponibilidad() > m){
                    cont++;
                    hayUno = true;
                }
            }
        }
        return cont;
    }

    /*
    territorioEspejo(): boolean. Retorna true si la cantidad de columnas es impar y el territorio a la derecha de  la  columna  central  es  la  imagen  espejo  del  territorio  a  la  izquierda  de  la  columna  central, comparando el estado interno de los refugios.  
    */
    public boolean territorioEspejo(){
        boolean esEspejo = false;
        if (cantColumas() % 2 != 0){
            esEspejo = true;
            int mitad = cantColumas()/2;
            for (int i = 0; i < cantFilas() && esEspejo; i++){
                if (t[i][mitad - 1] != null && t[i][mitad + 1]!= null){
                    esEspejo = t[i][mitad - 1].equals(t[i][mitad+1]);
                }else if((t[i][mitad - 1] == null && t[i][mitad + 1]== null)){
                    esEspejo = true;
                }else{
                    esEspejo = false;
                }
            }
        }
        return esEspejo;
    }

    /*
    coleccionFila(): ColeccionRefugios. Crea y retorna una colección con la primera referencia ligada de cada fila del territorio que recibe el mensaje. Si una fila del territorio no tiene ninguna referencia ligada, no se inserta ningún refugio correspondiente a esa fila.  
    *
    public ColeccionRefugios coleccionFila(){
        
    }
    */

    public Territorio clone(){
        Territorio tClon = new Territorio(cantFilas(), cantColumas());

        for (int i=0; i < cantFilas(); i++){
            for (int j=0; j < cantColumas(); j++){
                if (t[i][j] != null){
                    tClon.establecerRefugio(t[i][j].clone(), i, j);
                }else{
                    tClon.establecerRefugio(null, i, j);
                }
            }
        }

        return tClon;
    }
    


}
