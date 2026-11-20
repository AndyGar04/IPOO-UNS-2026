package TP8.Ejercicio_5;

public class MatrizGenerica {
    private Elemento[][] m;

    public MatrizGenerica(int nf, int nc){
        if (nf > 0 && nc > 0){
            m = new Elemento[nf][nc];
        }else{
            m = new Elemento[1][1];
        }
    }

    public void establecer(int f, int c, Elemento e){
        if (esPosValida(f, c)){
            m[f][c] = e;
        }
    }

    public Elemento obtener(int f, int c){
        Elemento e = null;
        if (esPosValida(f, c)){
            e = m[f][c];
        }
        return e;
    }

    public int cantFilas(){
        return m.length;
    }

    public int cantColumnas(){
        return m[0].length;
    }

    private boolean esPosValida(int f, int c){
        return (f < cantFilas() && f >=0 && c < cantColumnas() && c >= 0);
    }
    
    public boolean pertenece(Elemento e){
        boolean pertenece = false;
        for(int i = 0; i < m.length && !pertenece; i++){
            for(int j = 0; j < m[0].length && !pertenece; j++){
                if(m[i][j] != null && m[i][j].equals(e)){
                    pertenece = true;
                }
            }
        }
        return pertenece;
    }

    public int contarElem(Elemento e){
        int contador = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(m[i][j] != null && m[i][j].equals(e)){
                    contador++;
                }
            }
        }
        return contador;
    }

    public boolean esEquivalente(MatrizGenerica c){
        boolean esIgual = false;
        if (c != null && cantColumnas() == c.cantColumnas() && cantFilas() == c.cantFilas()){
            esIgual = true;
            for (int i = 0; i < cantFilas() && esIgual; i++){
                for (int j = 0; j < cantColumnas() && esIgual; j++){
                    if (c.obtener(i, j) != null && obtener(i, j) != null){
                        esIgual=true;
                    }else if (c.obtener(i, j) != null || obtener(i, j) != null){
                        esIgual=false;
                    }else{
                        esIgual = c.equals(obtener(i, j));
                    }
                }
            }
        }
        return esIgual;
    }


    /* • esComplemento(c: MatrizGenerica): boolean. Retorna true si cada elemento de la matriz que recibe el 
    mensaje es equivalente al complemento del elemento que ocupa la misma fila y columna en la matriz que 
    pasa como parámetro.  */
    public boolean esComplemento(MatrizGenerica c){
        boolean esComp = false;
        if (c != null && cantColumnas() == c.cantColumnas() && cantFilas() == c.cantFilas()){
            esComp = true;
            for (int i = 0; i < cantFilas() && esComp; i++){
                for (int j = 0; j < cantColumnas() && esComp; j++){
                    if (c.obtener(i, j) == null && obtener(i, j) == null){
                        esComp=true;
                    }else if (c.obtener(i, j) != null || obtener(i, j) != null){
                        esComp=false;
                    }else{
                        esComp = (obtener(i, j).complemento()).equals(c.obtener(i, j).complemento());
                    }
                }
            }
        }
        return esComp;
    }
    
    
    /*
    • clone(): MatrizGenerica . Genera un nuevo objeto de clase MatrizGenerica tal que el elemento de cada 
    posición es un clone del elemento que ocupa la misma posición en la matriz que recibe el mensaje. 
    */
    public MatrizGenerica clone(){
        MatrizGenerica mg = new MatrizGenerica(cantFilas(), cantColumnas());
        for (int i=0; i < cantFilas(); i++){
            for (int j=0; j < cantColumnas(); j++){
                if(obtener(i, j) == null){
                    mg.establecer(i, j, obtener(i, j));
                }else{
                    mg.establecer(i, j, obtener(i, j).clone());
                }
            }
        }
        return mg;
    }
}
