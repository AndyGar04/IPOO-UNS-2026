package TP3.Ejercicio_3;

public class Prestamo {
    //<<Atributos de instancia>>
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;

    /* Prestamo(l: Libro, fp: Fecha, fd: Fecha, s:String). Requiere l, fp, fd y s ligados. 
    Inicialmente el libro se encuentra prestado. fechaDevolucion refiere a la fecha en la que se debe 
    devolver el libro. */

    //<<Constructor>>
    public Prestamo(Libro l, Fecha fp, Fecha fd, String s){
        libro = l;
        fechaPrestamo = fp;
        fechaDevolucion = fd;
        socio = s;
        devuelto = false;
    }

    //<<Consultas>>
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }
    public boolean estaDevuelto(){
        return devuelto;
    }
    public String obtenerSocio(){
        return socio;
    }

    /* estaAtrasado(hoy: Fecha): boolean. Recibe como parámetro la fecha actual y retorna verdadero si 
    el libro no se devolvió y la fecha de hoy es posterior a la fecha de devolución. */
    public boolean estaAtrasado(Fecha hoy){
        boolean atrasado = false;
        if (!devuelto && fechaDevolucion.esAnterior(hoy)) {
            atrasado = true;
        }
        
        return atrasado;
    }

    /* masAntiguo(p: Prestamo): Prestamo. Retorna el préstamo con la fecha del préstamo más antigua.*/
    public Prestamo masAntiguo(Prestamo p){
        Prestamo pMasAntiguo = null;
        if (p != null && this.fechaPrestamo.esAnterior(p.obtenerFechaPrestamo())){
            pMasAntiguo = this;
        }else{
            pMasAntiguo = p;
        }

        return pMasAntiguo;
    }

    /* equals(p: Prestamo): boolean. Aplica igualdad superficial por socio, y en profundidad por libro,
    fechaPrestamo y fechaDevolucion */
    public boolean equals(Prestamo p){
        boolean iguales = false;
        
        if (p != null) {
            boolean socioIgual = this.socio.equals(p.obtenerSocio());
            
            boolean libroIgual = this.libro.equals(p.obtenerLibro());
            boolean fpIgual = this.fechaPrestamo.equals(p.obtenerFechaPrestamo());
            boolean fdIgual = this.fechaDevolucion.equals(p.obtenerFechaDevolucion());
            
            if (socioIgual && libroIgual && fpIgual && fdIgual) {
                iguales = true;
            }
        }
        return iguales;
    }
}
