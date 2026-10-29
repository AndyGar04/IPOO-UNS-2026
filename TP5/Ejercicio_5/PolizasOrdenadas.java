package TP5.Ejercicio_5;

public class PolizasOrdenadas {
    //<Atributos de instancia>
    private Poliza [] polOrd;
    private int n;

    //<Constructor>
    //• PolizasOrdenadas(max: entero). Requiere max >0. 
    public PolizasOrdenadas(int max){
        polOrd = new Poliza[max];
        n=0;
    }

    //<Comandos>
    /* • insertar(pol: Poliza). Requiere pol ligado, que la colección no tenga una póliza con el mismo número que  pol  y  no  está  completa.  Agrega  la  nueva  póliza  de  manera  tal  que  los  elementos  quedan ordenados por número de póliza.  */
    public void insertar(Poliza pol){
        polOrd[cantPolizas()]=pol;
        n++;
        if(n > 0){
            Poliza aux;
            for (int i=0; i < cantPolizas()-1; i++){
                if(polOrd[i].obtenerNroPoliza() > polOrd[i+1].obtenerNroPoliza()){
                    aux = polOrd[i];
                    polOrd[i] = polOrd[i+1];
                    polOrd[i+1] = aux;
                }
            }
        }
    }

    /* • actualizar(d, h, p: entero). Actualiza todas las pólizas con costo mayor a d y menor a  h en un p  por  ciento.  Requiere d<=h.  */
    public void actualizar(int d, int h, int p){
        for (int i=0; i<cantPolizas(); i++){
            if (polOrd[i].obtenerCostoPoliza() > d && polOrd[i].obtenerCostoPoliza() < h){
                polOrd[i].actualizarPorcentaje(p);
            }
        }
    }

    /* • copy(p:  PolizasOrdenadas).  Implementa  copia  superficial.  Si  ambas  colecciones  tienen  la  misma  cantidad de elementos, copia cada póliza de p en la colección que recibe el mensaje. Si la cantidad de elementos no coincide no provoca ningún cambio.   */
    public void copy(PolizasOrdenadas p){
        if (p.cantElementos() == cantElementos()){
            for (int i=0; i < cantElementos(); i++){
                polOrd[i] = p.obtenerPoliza(i);
            }
        }
    }

    //<Consultas>
    public int cantPolizas(){
        return n;
    }

    public int cantElementos(){
        return polOrd.length;
    }

    /* • obtenerPoliza(pos:entero):Poliza. Retorna la póliza asignada a la posición  pos  si pos es válida, si no retorna nulo.   */
    public Poliza obtenerPoliza(int pos){
        Poliza aux = null;
        if (pos < cantPolizas() && pos >= 0){
            aux = polOrd[pos];
        }
        return aux;
    }

    public boolean estaLlena(){
        return cantElementos() == cantPolizas();
    }

    /* • existePoliza(nro: entero): boolean. Retorna true si la colección contiene una póliza con número igual a nro. */
    public boolean existePoliza(int nro){
        boolean esta = false;
        boolean sePaso = false;
        for(int i=0; i< cantPolizas() && !esta && !sePaso; i++){
            if (nro == polOrd[i].obtenerNroPoliza()){
                esta = true;
            }
            if (nro < polOrd[i].obtenerNroPoliza()){
                sePaso=true; 
            }
        }
        return esta;
    }

    /*• existePoliza (pol:Poliza):boolean. Retorna true si la colección contiene una póliza con el mismo estado interno que pol.  Implementa búsqueda binaria iterativa. */
    public boolean existePoliza(Poliza pol){
        boolean existe = false;
        
        for (int ini = 0, fin = cantPolizas() - 1; !existe && ini <= fin; ) {
            int mitad = (ini + fin) / 2;
            
            if (polOrd[mitad].equals(pol)) {
                existe = true;
            } else if (polOrd[mitad].obtenerNroPoliza() < pol.obtenerNroPoliza()) {
                ini = mitad + 1; 
            } else {
                fin = mitad - 1; 
            }
        }
        return existe;
    }

    /*• intercalar(p:  PolizasOrdenadas):  PolizasOrdenadas.  Retorna  una  nueva  colección  que  se  genera  intercalando ordenadamente las dos colecciones, recorriendo solo una vez cada una de ellas.  Si hay dos pólizas con el mismo número agrega a la nueva colección la póliza de la colección que recibió el mensaje. */
    public PolizasOrdenadas intercalar(PolizasOrdenadas p){
        PolizasOrdenadas nPo = null;
        if (cantElementos() == p.cantElementos()){
            nPo = new PolizasOrdenadas(cantElementos());
            for(int i=0; i < cantElementos(); i++){
                if(i % 2 == 0){
                    nPo.insertar(obtenerPoliza(i));
                }else{
                    nPo.insertar(obtenerPoliza(i));
                }
            }
        }
        return nPo;
    }

    /* • equals(p: PolizasOrdenadas): boolean. Si la comparación es posible implementa igualdad superficial en caso contrario retorna false. */
    public boolean equals(PolizasOrdenadas p){
        boolean eq = false;
        if (p != null & p.cantElementos() == cantElementos()){
            eq = true;
            for (int i=0; i<cantElementos() && eq; i++){
                if (p.obtenerPoliza(i) != obtenerPoliza(i)){
                    eq = false;
                }
            }
        }
        return eq;
    }


}
