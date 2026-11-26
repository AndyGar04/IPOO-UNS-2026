package Repaso_Coloquio;

public class Racional extends Elemento{
    
    private int num;
    private int den;

    //<Constructor>
    public Racional(int n, int d){
        num = n;
        den = d;
    }

    //<Comandos>
    public void establecerNum(int n){
        num = n;
    }

    public void establecerDenom(int d){
        if (d != 0){
            den = d;
        }
    }

    //<Consultas>
    public int obtenerNum(){
        return num;
    }

    public int obtenerDen(){
        return den;
    }

    /*
    esNeutro: retorna true si el numerador es 1 o el denominador es 1 
    */
    public boolean esNeutro(){
        return (den == 1 || num == 1);
    }

    /*
    esComplemento(e: Elemento): boolena retorna true si el producto del objeto que recibe el mensaje por el
    objeto que pasa como parámetro da como resultado otro racional donde el numerador es igual al denominador.  
    */
    public boolean esComplemento(Elemento e) {
        boolean esComp = false;
        if (getClass() == e.getClass()){
            Racional r = (Racional) e;
            if (r != null && this != null){
                esComp = (r.obtenerDen()*den == r.obtenerNum()*num);
            }
        }
        return esComp;
    }
}
