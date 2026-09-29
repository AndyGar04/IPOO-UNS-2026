package TP3.Ejercicio_4;

/* 
Cuando observamos una imagen en la computadora no percibimos cada color particular, pero si 
aumentamos la imagen, por ejemplo, un 600%, cada color se vuelve distinguible. La percepción humana de 
la luz también es muy limitada y depende de nuestros sensores del color. Nuestro cerebro determina qué 
color “ve” en base a sensar tres colores: azul, verde y rojo. De este modo, cada color puede codificarse 
mediante una terna de números: el primero representa la cantidad de color rojo, el segundo la cantidad de 
color verde y el tercero la cantidad de color azul. El rango para cada valor es 0...255. 
• complemento():Color. Retorna un nuevo objeto con el color complemento del color del objeto que 
recibe el mensaje para alcanzar el color blanco.  
Atención: los métodos equals y copy deben controlar que el parámetro esté ligado ya que la especificación 
no indica que el control sea responsabilidad de la clase cliente. Observe que al no especificarse la 
funcionalidad para el caso de que el parámetro no esté ligado, puede implementarlos de modo que el 
comando copy no tendrá ningún efecto si c no está ligado, y que equals retorne false si c no está ligado.+
*/

class Color{
    //<<Atributos de instancia>>
    private int rojo;
    private int verde;
    private int azul;

    //<<Constructores>>
    // • Color(). Inicializa con la representación del blanco.
    public Color(){
        rojo = 255;
        verde = 255;
        azul = 255;
    }
    // • Color(r, a, v: entero). Si uno de los tres parámetros está fuera de rango, inicializa con la 
    // representación del blanco. 
    public Color(int r, int a, int v) {
        if (r < 0 || r > 255 || a < 0 || a > 255 || v < 0 || v > 255) {
            rojo = 255;
            verde = 255;
            azul = 255;
        } else {
            rojo = r;
            azul = a;
            verde = v;
        }
    }

    //<<Comandos>>
    /*
        • variar(val: entero). Modifica cada componente de color sumándole si es posible, un valor dado. Si 
            sumándole el valor dado a una o varias componentes se supera el valor 255, dicha componente queda en 
            255. Si el argumento es negativo la operación es la misma, pero en ese caso el mínimo valor 
            que puede tomar una componente es 0.  
    */
    public void variar(int val){
        variarRojo(val);
        variarAzul(val);
        variarVerde(val);
    }    
    /*
    • variarRojo(val: entero). Modifica la componente de rojo sumándole un valor dado. Ídem para azul 
        variarAzul(val: entero) y  verde variarVerde(val: entero).  
    */

    public void variarRojo(int val){
        if ((rojo + val < 255) && (rojo + val > 0)){
            rojo += val;
        }else if(rojo + val > 255){
            rojo = 255;
        }else{
            rojo = 0;
        }
    }

    public void variarAzul(int val){
        if ((azul + val < 255) && (azul + val > 0)){
            azul += val;
        }else if(azul + val > 255){
            azul = 255;
        }else{
            azul = 0;
        }
    }

    public void variarVerde(int val){
        if ((verde + val < 255) && (verde + val > 0)){
            verde += val;
        }else if(verde + val > 255){
            verde = 255;
        }else{
            verde = 0;
        }
    }

    public void establecerRojo(int val) {
        if (val >= 0 && val <= 255) rojo = val;
    }

    public void establecerAzul(int val) {
        if (val >= 0 && val <= 255) azul = val;
    }

    public void establecerVerde(int val) {
        if (val >= 0 && val <= 255) verde = val;
    }

    public void copy(Color c) {
        if (c != null) {
            this.rojo = c.obtenerRojo();
            this.azul = c.obtenerAzul();
            this.verde = c.obtenerVerde();
        }
    }

    // <<Consultas>>
    public int obtenerRojo() {
        return rojo;
    }

    public int obtenerAzul() {
        return azul;
    }

    public int obtenerVerde() {
        return verde;
    }

    /* Combinando el máximo de los tres se obtiene el blanco (255, 255, 255). La ausencia de los tres 
        produce el negro (0, 0, 0). El rojo es claramente (255, 0, 0). Cuando se mantiene el mismo valor 
        para las tres componentes se obtiene gris. La terna (50, 50, 50) representa un gris oscuro. En 
        cambio, (150, 150, 150) es un gris más claro. Esta representación se llama modelo RGB. 
        • esRojo(): boolean. Retorna el valor verdadero si el objeto que recibe el mensaje representa el
        color rojo. Ídem para grisesGris():boolean y para negro esNegro():boolean  
    */

    public boolean esRojo(){
        boolean aux = false;
        if (rojo == 255 && verde == 0 && azul == 0){
            aux = true;
        }
        return aux;
    }

    public boolean esNegro(){
        boolean aux = false;
        if (rojo == 0 && verde == 0 && azul == 0){
            aux = true;
        }
        return aux;
    }

    public boolean esGris(){
        boolean aux = false;
        if (rojo == verde && azul == verde){
            aux = true;
        }
        return aux;
    }

    public Color complemento() {
        return new Color(255 - rojo, 255 - azul, 255 - verde);
    }

    public boolean equals(Color c) {
        if (c != null && this.rojo == c.obtenerRojo() && this.verde == c.obtenerVerde() && this.azul == c.obtenerAzul()) {
            return true;
        }
        return false;
    }

    public Color clone() {
        return new Color(this.rojo, this.azul, this.verde);
    }

    public String toString() {
        return "(" + rojo + ", " + verde + ", " + azul + ")";
    }
}
