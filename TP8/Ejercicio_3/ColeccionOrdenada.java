package TP8.Ejercicio_3;

public class ColeccionOrdenada {
    private Elemento[] t;
    private int cant;

    //Constructor
    /* Coleccion(max: entero). Crea una colección para max elementos. Requiere max > 0.  */
    public ColeccionOrdenada(int max){
        t = new Elemento[max];
    }

    //Comandos
    /* insertar(e: Elemento). Inserta el elemento e manteniendo el orden la estructura e incrementa cant. Asume 
    que la estructura no está llena y e está ligada y no hay un elemento equivalente en la colección. */
    public void insertar(Elemento e){
        if (!estaLlena() && e != null && !estaElemento(e)) {
            int p = cant;

            for (int i = 0; i < cant && p == cant; i++) {
                if (!e.esMayor(t[i])) {
                    p = i;
                }
            }

            for (int i = cant; i > p; i--) {
                t[i] = t[i - 1];
            }

            t[p] = e;
            cant++;
        }
    }

    /* • eliminar(e: Elemento). Busca un elemento equivalente a e. Si existe y ocupa la posición p, asigna cada 
    elemento de la posición i, con p<i<cant a la posición i-1 y decrementa cant.  */
    public void eliminar(Elemento e){
    if (e != null){
        int p = -1;

        // Busca la posición del elemento equivalente
        for (int i = 0; i < cant && p == -1; i++){
            if (e.esEquivalente(t[i])){
                p = i;
            }
        }

        if (p != -1){
            for (int i = p + 1; i < cant; i++){
                t[i - 1] = t[i];
            }

            cant--;
            t[cant] = null;
        }
    }
}

    //Consultas
    /* estaLlena(): boolean. Retorna true si cant es igual a la cantidad de elementos del arreglo.  */
    public boolean estaLlena(){
        return cant == t.length;
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
            E = t[p]; 
        }
        return E;
    }

    /* estaElemento(e: Elemento): boolean. Retorna true si algún elemento de la colección es equivalente a e, asume e ligada. */
    public boolean estaElemento(Elemento e){
        boolean encontre = false;

        for (int i = 0; i < cant && !encontre; i++) {
            if (e.esEquivalente(t[i])) {
                encontre = true;
            }
        }

        return encontre;
    }

    /* intercarlar(c: ColeccionOrdenada): ColeccionOrdenada. Retorna una colección generada intercalando 
    ordenadamente y en un único recorrido, la colección que recibe el mensaje y la que pasa como parámetro.  */
    public ColeccionOrdenada intercalar(ColeccionOrdenada c){
        ColeccionOrdenada co = null;

        if (c != null){
            co = new ColeccionOrdenada(cant + c.cantElementos());

            int i = 0;
            int j = 0;

            while (i < cant && j < c.cant){
                if (t[i].esEquivalente(c.t[j])){
                    co.insertar(t[i]);
                    i++;
                    j++;
                } else if (t[i].esMayor(c.t[j])){
                    co.insertar(c.t[j]);
                    j++;
                } else {
                    co.insertar(t[i]);
                    i++;
                }
            }

            while (i < cant){
                co.insertar(t[i]);
                i++;
            }

            while (j < c.cant){
                co.insertar(c.t[j]);
                j++;
            }
        }

        return co;
    }
}
