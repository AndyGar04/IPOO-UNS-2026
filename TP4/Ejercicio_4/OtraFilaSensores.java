package TP4.Ejercicio_4;

public class OtraFilaSensores {

    // <<Atributos de instancia>>
    private Sensor[] fs;

    /*
    • FilaSensores(cant: entero). Requiere cant> 0.
    */
    public OtraFilaSensores(int cant){
        fs = new Sensor[cant];
    }

    /* 
    • establecerSensor(p: entero, s:Sensor). Si la posición p es válida, asigna el sensor s al subíndice 
    p-1 en el arreglo fs, en caso contrario no tiene efecto.
    */
    public void establecerSensor(int p, Sensor s){
        if (s != null && posicionValida(p)){
            fs[p-1]= s;
        }
    }

    /*
    • intercambiar(p1,p2:entero). Si p1 y p2 son posiciones válidas en la fila, intercambia en el arreglo
    fslas referencias que corresponden a los subíndicesp1-1 y p2-1.
    */
    public void intercambiar(int p1, int p2){
        if (posicionValida(p1) && posicionValida(p2)){
            Sensor aux = fs[p1];
            fs[p1]=fs[p2];
            fs[p2]=aux;

        }
    }
    
    /*
    • copy(a:FilaSensores). Implementa copy en profundidad. Requiere que el parámetro a esté ligado,las
    dos filas tengan el mismo tamaño y que en ambas filas cada referencia esté ligada a un sensor.
    */
    public void copy(FilaSensores a){
        for (int i=0; i< cantFila(); i++){
            fs[i].copy(a.obtenerSensor(i+1));
        }
    }

    // <<Consultas>>
    /* 
    • obtenerSensor(p: entero): Sensor. Si la posición p es válida retorna el sensor asignado al 
    subíndice p1, en caso contrario retorna null.
    */
    public Sensor obtenerSensor(int p){
        Sensor s = null;
        if (posicionValida(p)){
            s = fs[p-1];
        }
        return s;
    }

    /*
    • posicionValida(p:entero):boolean. Retorna verdadero si p es una posición válida en la fila.
    */
    public boolean posicionValida(int p){
        return (p-1 < fs.length && p-1 >= 0);
    }

    /*
    • cantFila():entero. Retorna el tamaño de la fila, es decir la cantidad de componentes del arreglo fs.
    */
    public int cantFila(){
        return fs.length;
    }

    /*• cantSensores():entero. Retornala cantidad de sensores de la fila que recibe el mensaje, es decir 
    la cantidad de componentes ligadas en el arreglo fs.
    */
    public int cantSensores(){
        int cantLigados = 0;

        for (int i=0; i < cantFila(); i++){
            if (fs[i] != null){
                cantLigados++;
            }
        }
        return cantLigados;
    }

    /*
        - cantidadRiesgo(): entero. Retorna la cantidad de sensores en riesgo.
    */
    public int cantidadRiesgo(){
        int enRiesgo = 0;
        for (int i=0; i<cantFila();i++){
            if (fs[i] != null && fs[i].riesgo()){
                enRiesgo++;
            }
        }
        return enRiesgo;
    }

    /*
    • hayNRiesgo(n: entero): boolean. Retorna true si la fila contiene al menos n sensores en riesgo.
    */
    public boolean hayNRiesgo(int n){
        int contador=0;
        if (n < cantFila() && n >= 0){
            for (int i=0; i < cantFila() && contador < n; i++){
                if (fs[i] != null && fs[i].riesgo()){
                    contador++;
                }
            }
        }
        return n == contador;
    }

    /*
     • dosConsecutivosEmergencia(): boolean. Retorna true si la estructura contiene dos sensores en
        riesgo en posiciones consecutivas.
    */
    public boolean dosConsecutivosEmergencia(){
        boolean hayDosConsec=false;
        for (int i=0; i<cantFila()-1 && !hayDosConsec; i++){
            if (fs[i] != null && fs[i+1] != null && fs[i].riesgo() && fs[i+1].riesgo()){
                hayDosConsec = true;
            }
        }
        return hayDosConsec;
    }

    /*
    • equals(a: OtraFilaSensores): boolean. Implementa igualdad superficial.
    */
    public boolean equals(FilaSensores a) {
        boolean esIgual = true;
        if (a.cantFila() == cantFila()) { 
            for (int i = 0; i < cantFila() && esIgual; i++) {
                // Comparación superficial: usamos != para buscar la primera diferencia
                if (fs[i] != a.obtenerSensor(i + 1)) {
                    esIgual = false;
                }
            }
        } else {
            esIgual = false;
        }    
        return esIgual;
    }

    /*
    • clone(): OtraFilaSensores. Implementa clone superficial. 
    */
    public FilaSensores clone(){
        FilaSensores clon = new FilaSensores(cantFila());
        for (int i=0; i < cantFila(); i++){
            clon.establecerSensor(i+1, fs[i]);
        }
        return clon;
    }

    /*
    • filaCompleta(): FilaSensores. Retorna una nueva fila con los mismos sensores que la fila que recibe
    el mensaje, en el mismo orden (no necesariamente en las mismas posiciones), y con las referencias
    no ligadas al final de la estructura. 
    */
    public FilaSensores filaCompleta(){
        FilaSensores filaNullOrdenados = new FilaSensores(cantFila());
        int posNueva = 1;

        for (int i=0; i < cantFila(); i++){
            if (fs[i] != null){
                filaNullOrdenados.establecerSensor(posNueva, fs[i]);
                posNueva++;
            }    
        }
        return filaNullOrdenados;
    }
}
