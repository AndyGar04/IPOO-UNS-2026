/* EJERCICIO 1. En un videojuego cada criatura dispone de cierto nivel de energía y tiene un refugio. En un
momento dado, una criatura puede estar dormida o despierta y ha realizado, desde la última vez que durmió,
cierta cantidad de caminatas. Implemente la clase Criatura y verifique de acuerdo a la especificación: */

class Criatura {

    //<<Atributos de clase>>
    private int maxEnergia = 100;
    private int minEnergia = 0;
    private int consumoEnegia = 10;

    //<<Atributos de instancia>>
    private int energia;
    private Refugio refugio;
    private boolean despierto;
    private int caminatas;

    /* • El constructor crea una criatura con el máximo de 
    energía, asociada al refugio r, que está despierta y
    aun no caminó. Requiere r ligada. */
    public Criatura(Refugio r) {
        this.energia = maxEnergia;
        this.refugio = r;
        this.despierto = true;
        this.caminatas = 0;
    }

    /* • Cuando la criatura recibe el mensaje comer o beber,
     controla que la criatura no esté dormida y que haya 
     alimentos o bebidas en su refugio, según corresponda. 
     Si así es, su nivel de energía aumenta en 1 (sin exceder 
     nunca el máximo permitido) y además se consume un alimento 
     o bebida del refugio.
    */

    //<<Comandos>>
    public boolean comer(){
        boolean aux = false;
        if (despierto && refugio.obtenerAlimentos() > 0){
            refugio.consumirAlimento();
            energia++;
            if (energia > maxEnergia){
                energia = maxEnergia;
            }
            aux = true;
        }
        return aux;
    }

    public boolean beber(){
        boolean aux = false;
        if (despierto && refugio.obtenerBebidas() > 0){
            refugio.consumirBebida();
            energia++;
            if (energia > maxEnergia){
                energia = maxEnergia;
            }
            aux = true;
        }
        return aux;
    }

    /* • Cuando una criatura recibe el mensaje dormir,si está
     despierta y hay camas disponibles en su refugio, la ocupa
      y cambia su estado. 
    */

    public boolean dormir(){
        boolean aux = false;
        if (despierto && refugio.obtenerCamas() > 0){
            refugio.ocuparCama();
            despierto = false;
            aux = true;
        }
        return aux;
    }

    /* • Cuando una criatura recibe el mensaje despertar 
        estando dormida, cambia su estado, desocupa una
        cama en el refugio y reestablece en 0 el atributo 
        de caminatas realizadas sin dormir.
    */

    public boolean despertar(){
        boolean aux = false;
        if (!despierto){
            despierto = true;
            refugio.desocuparCama();
            caminatas = 0;
            aux = true;
        }
        return aux;
    }

    /* • Cuando la criatura recibe el mensaje caminar,si está
     despierta y tiene suficiente energía para hacerlo, ésta 
     se decrementa de acuerdo a consumoEnergia. El atributo 
     caminatas registra cuántas veces caminó sin haber 
     dormido, pudiendo una criatura caminar hasta 3 veces sin dormir. 
     Si recibe el mensaje caminar por cuarta vez, si hay 
     camas disponibles ocupa una y se pone a dormir; si no 
     hay camas disponibles, su energía toma el valor mínimo,
     permaneciendo caminatas en 3.
    */

    public boolean caminar(){
        boolean aux = false;
        if (despierto && energia >= consumoEnegia){
            energia -= consumoEnegia;
            caminatas++;
            if (caminatas > 3){
                if (refugio.obtenerCamas() > 0){
                    dormir();
                } else {
                    energia = minEnergia;
                    caminatas = 3;
                }
            }
            aux = true;
        }
        return aux;
    }

    /*
     • Todos los comandos retornan true si la acción pudo 
     ejecutarse, y falso en caso contrario.
    */

    //<<Consultas>>
    public int obtenerEnergia(){
        return energia;
    }

    public int obtenerCaminatas(){
        return caminatas;
    }

    /* • Una criatura manifiesta diferentes grados de humor,
     los que expresa mediante un valor numérico que va de 1 
     a 3, siendo 1 el más infeliz y 3 el más contento. El 
     humor depende del nivel de energía y del estado del 
     refugio. Si el refugio no es habitable el humor es 1, 
     no importa cuál sea la energía; si es habitable, el 
     humor queda determinado por la siguiente tabla.  
    */

    public int obtenerHumor(){
        int humor = 1;
        if (refugio.esHabitable()){
            if (energia >= 40 && energia < 70){
                humor = 2;
            } else {
                humor = 3;
            }
        }
        return humor;
    }

    public boolean estaDormido(){
        return !despierto;
    }

    public boolean mayorEnergia(Criatura c){
        return this.energia > c.obtenerEnergia();
    }

    public String toString(){
        return "Energia: " + energia + ", Caminatas: " + caminatas + ", Despierto: " + despierto;
    }



}
