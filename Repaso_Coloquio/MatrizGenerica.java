package Repaso_Coloquio;

public class MatrizGenerica {
    protected Elemento[][] mat;

    // <Constructor>
    /*  MatrizGenerica(n, m: entero) crea una matriz de n filas por m columnas y la liga a mat. 
    Requiere n y m mayores a 0.
    */
    public MatrizGenerica(int n, int m){
        mat = new Elemento[n][m];
    }

    // <Comandos>
    public void establecer(int f, int c, Elemento e){
        if (f >= 0 && f < cantFilas() && c >=0 && c < cantCol()){
            mat[f][c] = e;
        }
    }

    // <Consultas>
    public Elemento obtener(int f, int c){
        Elemento rt = null;
        if (f >= 0 && f < cantFilas() && c >=0 && c < cantCol()){
            rt = mat[f][c];
        }
        return rt;
    }

    public int cantFilas(){
        return mat.length;
    }

    public int cantCol(){
        return mat[0].length;
    }

    /*
    enTodasUnNeutro(): booleano retorna true sí y solo sí todas las filas de la matriz contienen 
    exactamente un elemento que verifica la propiedad es neutro.
    */
    public boolean enTodasUnNeutro(){
        int neutros=0;
        int neutrosF=0;
        boolean sePaso = false;
        for (int i=0; i < cantFilas() && !sePaso; i++){
            for (int j=0; j < cantCol() && neutros <=1; j++){
                if (mat[i][j] != null && mat[i][j].esNeutro()){
                    neutros++;
                }
            }

            if (neutros == 1){
                neutros = 0;
                neutrosF++;
            }else{
                sePaso=true;
            }
        }
        return neutrosF == cantFilas();
    }


    /*
    filaComplemento(int f, MatrizGenerica m): booleano computa verdadero si todos los elementos de la 
    fila f de la matriz que recibe el mensaje son el complemento de los elementos que ocupan las mismas 
    posiciones en la fila f de la matriz m. Requiere que f sea una fila válida en las dos matrices y que 
    las dos matrices tengan la misma cantidad de columnas. 
    */
    public boolean filaComplemento(int f, MatrizGenerica m) {
        boolean esFilaComp = false;
        if (m != null) {
            esFilaComp = true;
            for (int j = 0; j < cantCol() && esFilaComp; j++) {
                Elemento a = mat[f][j];
                Elemento b = m.obtener(f, j);
                if (a != null && b != null) {
                    esFilaComp = a.esComplemento(b);
                } else {
                    esFilaComp = false;
                }
            }
        }
        return esFilaComp;
    }

}
