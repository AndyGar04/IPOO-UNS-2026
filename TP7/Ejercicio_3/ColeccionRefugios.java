package TP7.Ejercicio_3;

public class ColeccionRefugios {
    /*
    • hayNSeguidosHabitables(n: entero): boolean. Retorna true 
    si la colección mantiene al menos n refugios habitables en 
    posiciones consecutivas.  
    • equals(c: ColeccionRefugios): boolean. Se implementa en 
    profundidad, es decir, retorna true si las dos colecciones 
    tienen el mismo tamaño, la misma cantidad de refugios y los 
    refugios que ocupan la misma posición en los dos territorios, son equivalentes.   
    */

    protected Refugio[] col;
    protected int cant;

    /*
    En la clase ColeccionRefugios, el constructor requiere el 
    parámetro mayor a 0.  
    */
    public ColeccionRefugios(int n){
        col = new Refugio[n];
        cant = 0;
    }

    /*
    • insertarRefugio(r: Refugio). Si la colección no está llena,
    asigna el refugio r a la primera posición libre 
    en la colección e incrementa la cantidad de posiciones ligadas.
    Requiere r ligado. 
    */
    public void insertarRefugio(Refugio r){
        if (!estaLlena()){
            col[cant]=r;
            cant++;
        }
    }

    /*
    • eliminarEscasaSupervivencia(). Elimina de la colección 
    todos los refugios que tienen a lo sumo 1 día de supervivencia y 
    arrastra de modo que el arreglo siga modelando a una colección.   
    */
    public void eliminarEscasaSupervivencia(){
        int posLibre = cant - 1; 
        for (int i = cant - 1; i >= 0; i--){
            if (col[i].diasSupervivencia() > 1){
                col[posLibre] = col[i];
                posLibre--;
            }
        }
        
        
        for (int i = posLibre; i >= 0; i--){
            col[i] = null;
        }
    }


    public boolean estaLlena(){
        return cant == col.length;
    }

    public int cantRefugios(){
        return cant;
    }

    public int cantElementos(){
        return col.length;
    }

    /*
    • obtenerRefugio(pos: entero): Refugio. 
    Si 0 <= pos < cantRefugios() retorna el refugio de las 
    posición pos sino retorna nulo.  
    */
    public Refugio obtenerRefugio(int pos){
        Refugio ref=null;
        if (pos < cantRefugios() && pos >=0){
            ref = col[pos];
        }
        return ref;
    }




}
