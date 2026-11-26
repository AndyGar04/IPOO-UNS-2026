package Repaso_Coloquio;

public class MatrizRacional extends MatrizGenerica{
    public MatrizRacional(int n, int m){
        super(n, m);
    }

    /* 
    columnasConUnos(n: entero): entero computa y retorna la cantidad de columnas de la matriz que 
    contienen al menos n elementos consecutivos donde el numerador dividido el denominador sea igual a 1.
    */
    public int columnasConUnos(int n){
        int contColsUnos = 0;
        int contUnosCons = 0;
        if (n <= cantFilas()){
            for (int j=0; j < cantCol(); j++){
                contUnosCons = 0;
                for (int i=0; i < cantFilas() && n > contUnosCons; i++){
                    if (mat[i][j]!=null){
                        Racional r = (Racional) mat[i][j];
                        if ((double) r.obtenerNum() / r.obtenerDen() == 1.0){
                            contUnosCons++;
                        }else{
                            contUnosCons = 0;
                        }
                    }else{
                        contUnosCons = 0;
                    }
                }
                if (contUnosCons >= n){
                    contColsUnos++;
                }
            }
        }
        return contColsUnos;
    }
}
