package TP5.Ejercicio_3;

public class PlayaSurtidores {
    
    //<<Atributos de instancia>>
    private Surtidor[] Tabla;
    
    //<<Constructores>>
    /* • PlayaSurtidores(). Crea una tabla con capacidad para 10 surtidores. Todas las posiciones deben 
    ligarse a surtidores con máxima carga en cada tipo de combustible.
    • PlayaSurtidores(n:entero). Requiere n>0. Crea una tabla con capacidad para n surtidores. La tabla 
    se crea con todas las posiciones nulas. */
    public PlayaSurtidores(){
        Tabla = new Surtidor[10];
        for(int i=0; i<10; i++){
            Tabla[i] = new Surtidor();
        }
    }

    public PlayaSurtidores(int n){
        Tabla = new Surtidor[n];
        for(int i=0; i<n; i++){
            Tabla[i] = null;
        }
    }

    /* • establecerSurtidor(s: Surtidor, p: entero). Requiere p válida. Asigna s a la posición p.*/
    public void establecerSurtidor(Surtidor s, int p){
        Tabla[p]=s;
    }

    /* • establecerSurtidor(s: Surtidor). Requiere que la tabla no esté llena. Asigna s a la primera posición libre.*/
    public void establecerSurtidor(Surtidor s){
        boolean incerto = false;
        if(s != null){
            for (int i=0; i< Tabla.length && !incerto; i++){
                if (Tabla[i] == null){
                    Tabla[i] = s;
                    incerto = true;
                }
            }
        }
    }

    /* • llenaDepositos(). Llena los depósitos de cada uno de los surtidores que haya en la tabla. */
    public void llenaDepositos(){
        for (int i=0; i< Tabla.length; i++){
            if (Tabla[i] != null){
                Tabla[i].llenarDepositoGasoil();
                Tabla[i].llenarDepositoPremium();
                Tabla[i].llenarDepositoSuper();
            }
        }
    }

    /* • agruparSurtidores(). Arrastra las referencias no ligadas a las últimas posiciones de modo que todas las referencias ligadas ocupen posiciones consecutivas al principio de la estructura.  */
    public void agruparSurtidores(){
        int posLibre = 0; 
    
        for (int i = 0; i < Tabla.length; i++) {
            if (Tabla[i] != null) {
                if (i != posLibre) {
                    Tabla[posLibre] = Tabla[i];
                    Tabla[i] = null;
                }
                posLibre++; 
            }
        }
    }

    /* • obtenerSurtidor(p: entero): Surtidor. Requiere p válida. */
    public Surtidor obtenerSurtidor(int p){
        return Tabla[p];
    }
 
    /* • cantMaximaCarga(): entero. Retorna la cantidad de surtidores que tienen la máxima carga en cada uno de los tres depósitos. */
    public int cantMaximaCarga(){
        int cont = 0;
        for (int i=0; i < Tabla.length; i++){
            if (Tabla[i] != null && Tabla[i].depositosLlenos()){
                cont++;
            }
        }
        return cont;
    }

    /* • mismosNulos(ps: PlayaSurtidores): boolean. Retorna true si las dos tablas mantienen referencias nulas en exactamente las mismas posiciones. */
    public boolean mismosNulos(PlayaSurtidores ps){
        boolean nulos = false;
        if (ps != null){
            nulos = true;
            for (int i=0; i<Tabla.length && nulos; i++){
                if (Tabla[i] == null && ps.obtenerSurtidor(i) == null){
                    nulos = true;
                }else{
                    nulos = false;
                }
            }
        }
        return nulos;
    }

    /* • clone(): PlayaSurtidores. Implementa clone superficial. Genera una nueva tabla con el mismo tamaño y las mismas referencias que la playa de surtidores que recibe el mensaje. */
    public PlayaSurtidores clone(){
        PlayaSurtidores nPs = new PlayaSurtidores(Tabla.length);
        for (int i=0; i < Tabla.length; i++){
            nPs.establecerSurtidor(Tabla[i], i);
        }
        return nPs;
    }

    /* • nLigados(n:entero): PlayaSurtidores. Si la playa de surtidores tiene una secuencia de al menos n posiciones ligadas, genera una nueva playa con dicha secuencia. Si la secuencia no existe retorna nulo, si hay más de una secuencia genera una nueva playa con la primera secuencia. Observe que la funcionalidad de los comandos establecer en la clase PlayaSurtidores permite tanto ocupar una posición con un surtidor, como liberar la posición si el parámetro s no está ligado.*/
    public PlayaSurtidores nLigados(int n) {
        PlayaSurtidores nuevaPlaya = null;
        
        if (n > 0 && n <= Tabla.length) {
            int cont = 0;
            boolean terminoSecuencia = false;
            
            for (int i = 0; i < Tabla.length && !terminoSecuencia; i++) {
                if (Tabla[i] != null) {
                    cont++;
                } else {
                    cont = 0;
                }

                if (cont == n) {
                    nuevaPlaya = new PlayaSurtidores(n);
                    int inicio = i - n + 1; 
                    
                    for (int j = 0; j < n; j++) {
                        
                        nuevaPlaya.establecerSurtidor(Tabla[inicio + j], j); 
                    }
                    terminoSecuencia = true; 
                }
            }
        }
        return nuevaPlaya;
    }

}

