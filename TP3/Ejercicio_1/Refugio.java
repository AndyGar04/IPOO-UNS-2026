/* EJERCICIO 4. En un videojuego las criaturas habitan en refugios que disponen de cierta cantidad de alimentos, 
bebidas y camas. Los atributos se inicializan al crearse el refugio, con los valores de los tres 
parámetros. El atributo camas indica cuántas camas están ocupadas, alimentos indica cuántos alimentos 
hay en la alacena y bebidas cuántas bebidas hay en la alacena.  */

public class Refugio{
    private static int capacidadAlacena = 20, cantidadCamas = 10;

    private int alimentos, bebidas, camas;

    /* • Refugio(a, b, c: entero). Si la suma de los valores de los parámetros a y b es mayor a la capacidad
    de la alacena, asigna la mitad de esta capacidad a alimentos y la mitad a bebidas, sino asigna el valor
    de a al atributo alimentos, y el valor de b al atributo bebidas. Si el parámetro c es mayor a la 
    cantidad de camas, asigna esta constante al atributo camas, sino le asigna c.  */

    public Refugio(int a, int b, int c){
        if (a + b > capacidadAlacena){
            alimentos = capacidadAlacena/2;
            bebidas = capacidadAlacena/2;
        }else{
            alimentos = a;
            bebidas = b;
        }
        
        if (c > cantidadCamas){
            camas = cantidadCamas;
        }else{
            camas = c;
        }
    }

    //Comandos

    /* • consumirAlimento() y consumirBebida(). Decrementan el valor de los atributos en 1. Requieren que 
    la clase cliente haya controlado que hay alimento o bebida, según corresponda.   */
    public void consumirAlimento(){
        alimentos--;
    }

    public void consumirBebida(){
        bebidas--;
    }

    /* • desocuparCama(): boolean. Si hay camas ocupadas decrementa en 1 camas y retorna true, si no 
    retorna false. 
    • ocuparCama(): boolean. Si hay camas disponibles incrementa camas en 1 y retorna true, si no retorna
    false. */

    public boolean desocuparCama(){
        boolean aux;
        if (camas > 0){
            camas--;
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }

    public boolean ocuparCama(){
        boolean aux;
        if (camas < cantidadCamas){
            camas++;
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }

    /* • reponerAlimentos(n: entero): boolean y reponerBebidas(n: entero): boolean. Incrementan los 
    valores de los atributos alimentos o bebidas, siempre y cuando n sea positivo y la capacidad de la 
    alacena lo permita; en ese caso el comando retorna true. Si n no es positivo o al sumar n a la 
    cantidad de alimentos y bebidas el valor supera a la capacidad de la alacena, el atributo no se 
    modifica y el comando retorna false.  
    */

    public boolean reponerAlimentos(int n){
        boolean aux;
        if (n > 0 && (alimentos + bebidas + n <= capacidadAlacena)){
            alimentos = alimentos + n;
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }

    public boolean reponerBebidas(int n){
        boolean aux;
        if (n > 0 && (alimentos + bebidas + n <= capacidadAlacena)){
            bebidas = bebidas + n;
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }

    //Consultas
    public int obtenerAlimentos(){
        return alimentos;
    }

    public int obtenerBebidas(){
        return bebidas;
    }

    public int obtenerCamas(){
        return camas;
    }

    public int obtenerCapacidadAlacena(){
        return capacidadAlacena;
    }

    /* Un refugio es habitable si tiene alimentos o bebidas o camas disponibles */
    public boolean esHabitable(){
        boolean aux;
        if(alimentos > 0 || bebidas > 0 || camas < cantidadCamas){
            aux = true;    
        }else{
            aux = false;
        }
        return aux;
    }

    /* • disponibilidad(): entero. Retorna la cantidad de camas disponibles.  */
    public int disponibilidad(){
        return cantidadCamas - camas;
    }

    /* • diasSupervivencia(): entero. Retorna el menor valor entre alimentos y bebidas.  */
    public int diasSupervivencia(){
        int aux;
        if (alimentos < bebidas){
            aux = alimentos;
        }else{
            aux = bebidas;
        }
        return aux;
    }

    /* • mayorAlimentos(r: Refugio): boolean. Retorna true si  r está ligado y el refugio que recibe el 
    mensaje tiene más alimentos que el refugio r, en caso contrario retorna false. */
    public boolean mayorAlimentos(Refugio r){
        boolean aux;
        if (r != null && alimentos > r.obtenerAlimentos()){
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }


    /* • equals(r: Refugio): boolean. Retorna true si r está ligado y tiene el mismo estado interno que el
    refugio que recibe el mensaje.*/

    public boolean equals(Refugio r){
        boolean aux;
        if (r != null && alimentos == r.obtenerAlimentos() && camas == r.obtenerCamas() && bebidas == r.obtenerBebidas()){
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }

    //clone():Refugio
    public Refugio clone(){
        return new Refugio(alimentos, bebidas, camas);
    }
 
    public String toString() {
        return "Refugio [Alimentos: " + alimentos + ", Bebidas: " + bebidas + ", Camas ocupadas: " + camas + "]";
    }
}

/*  Implemente la clase Refugio en Java y verifique con la clase TesterRefugio publicada. Luego complete el 
tester de manera de probar los métodos que faltan.  */

