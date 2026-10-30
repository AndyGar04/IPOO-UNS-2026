package TP6.Ejercicio_6;

public class RefugioVip extends Refugio{
    // <Atributos de clase>
    protected static int capacidad = 10;
    
    // <Atributos de instancia>
    protected int sillones;

    // <Constructor>
    public RefugioVip(int a, int b, int c, int s){
        super(a, b, c);
        sillones = s;
    }

    // <Comandos>
    /*
    • ocuparSillon(): boolean. Si hay sillones disponibles, incrementa sillones en 1 y retorna true, si no
    retorna false. 
    */
    public boolean ocuparSillon(){
        boolean aux = false;
        if (sillones < obtenerSillones()){
            sillones++;
            aux = true;
        }
        return aux;
    }

    /*
    • desocuparSillon(): boolean. Si hay sillones ocupados, decrementa en 1 sillones y retorna true, si no
    retorna false.
    */
    public boolean desocuparSillon(){
        boolean aux = false;
        if (sillones > 0){
            sillones--;
            aux = true;
        }
        return aux;
    }

    //<Consultas>
    public int obtenerSillones(){
        return sillones;
    }

    /*
     disponibilidad(): entero. Retorna la disponibilidad de cualquier refugio más la cantidad de sillones
    */
    public int disponibilidad(){
        return super.disponibilidad() + sillones;
    }

    public RefugioVip clone(){
        return new RefugioVip(alimentos, bebidas, camas, sillones);
    }

}
