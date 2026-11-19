package TP8.Ejercicio_2;

public class Coleccion{
    private Elemento[] col;
    private int cant;

    public Coleccion(int max){
        col = new Elemento[max];
        cant=0;
    }

    //Comandos
    /* • insertar(e: Elemento). Inserta el elemento e en la primera posición libre e incrementa cant. Asume que la estructura no está llena y e está ligada y no hay un elemento equivalente en la colección */
    public void insertar(Elemento e){
        if (!estaLlena() && e != null && estaElemento(e)){
            col[cant] = e;
            cant++;
        }
    }

    /* eliminar(e: Elemento). Busca un elemento equivalente a e. Si existe y ocupa la posición p, asigna cada elemento de la posición i, con p<i<cant, a la posición i-1 y decrementa cant.  */
    public void eliminar(Elemento e){
        if (e != null){
            int posP = -1;
            for (int i=0; i<cant && posP==-1; i++){
                if (col[i].esEquivalente(e)){
                    posP=i;
                }
            }

            if (posP != -1){
                for (int i = posP; i < cant - 1; i++){
                    col[i] = col[i+1];
                }
                cant--;
                col[cant] = null;
            }
        }
    }        


    /* ordenada(). Aplica el método shakesort para reordenar los elementos de la colección. */
    public void ordenada(){
        int izq = 0;
        int der = cant - 1;
        boolean huboCambio = true;

        while (izq < der && huboCambio){
            huboCambio = false;
            
            // Pasada de izquierda a derecha (el mayor va hacia la derecha)
            for (int i = izq; i < der; i++){
                if (col[i] != null && col[i+1] != null && col[i].esMayor(col[i+1])){
                    Elemento aux = col[i];
                    col[i] = col[i+1];
                    col[i+1] = aux;
                    huboCambio = true;
                }
            }
            der--;

            // Si no hubo cambios, ya está ordenada, cortamos
            if (huboCambio){
                huboCambio = false;
                
                // Pasada de derecha a izquierda (el menor va hacia la izquierda)
                for (int i = der; i > izq; i--){
                    if (col[i] != null && col[i-1] != null && col[i-1].esMayor(col[i])){
                        Elemento aux = col[i];
                        col[i] = col[i-1];
                        col[i-1] = aux;
                        huboCambio = true;
                    }
                }
                izq++;
            }
        }
    }

    //Consulta
    /* estaLlena(): boolean. Retorna true si cant es igual a la cantidad de elementos del arreglo.  */
    public boolean estaLlena(){
        return cant == col.length;
    }

    /* hayElementos(): boolean. Retorna true si cant > 0.*/
    public boolean hayElementos(){
        return cant > 0;
    }

    /* cantElementos(): entero. Retorna cant. */
    public int cantElementos(){
        return cant;
    }

    /*  existePosicion(p: entero): boolean. Retorna true si 0<=p<cant  */
    public boolean existePosicion(int p){
        return p >= 0 && p < cant;
    }

    /*  recuperarElemento(p: entero): Elemento. Retorna el elemento asignado a la posición p, si p no es válida retorna nulo. */
    public Elemento recuperarElemento(int p){
        Elemento E = null;
        if (existePosicion(p)){
            E = col[p]; 
        }
        return E;
    }

    /* estaElemento(e: Elemento): boolean. Retorna true si algún elemento de la colección es equivalente a e, asume e ligada. */
    public boolean estaElemento(Elemento e){
        boolean encontre = false;
        for (int i=0; i < cant && !encontre; i++){
            if (e.esEquivalente(col[i])){
                encontre = true;
            }
        }
        return encontre;
    }
}