package TP5.Ejercicio_3;

/*
• establecerSurtidor(s: Surtidor, p: entero). Requiere p válida. Asigna s a la posición p.
• establecerSurtidor(s: Surtidor). Requiere que la tabla no esté llena. Asigna s a la primera posición
libre.
• llenaDepositos(). Llena los depósitos de cada uno de los surtidores que haya en la tabla.
• agruparSurtidores(). Arrastra las referencias no ligadas a las últimas posiciones de modo que todas
las referencias ligadas ocupen posiciones consecutivas al principio de la estructura.
• obtenerSurtidor(p: entero): Surtidor. Requiere p válida.
• cantMaximaCarga(): entero. Retorna la cantidad de surtidores que tienen la máxima carga en cada
uno de los tres depósitos.
• mismosNulos(ps: PlayaSurtidores): boolean. Retorna true si las dos tablas mantienen referencias
nulas en exactamente las mismas posiciones.
• clone(): PlayaSurtidores. Implementa clone superficial. Genera una nueva tabla con el mismo tamaño
y las mismas referencias que la playa de surtidores que recibe el mensaje.
• nLigados(n:entero): PlayaSurtidores. Si la playa de surtidores tiene una secuencia de al menos n
posiciones ligadas, genera una nueva playa con dicha secuencia. Si la secuencia no existe retorna
nulo, si hay más de una secuencia genera una nueva playa con la primera secuencia.
Observe que la funcionalidad de los comandos establecer en la clase PlayaSurtidores permite tanto
ocupar una posición con un surtidor, como liberar la posición si el parámetro s no está ligado.
*/

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
}
