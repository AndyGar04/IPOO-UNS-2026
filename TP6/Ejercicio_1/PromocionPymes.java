package TP6.Ejercicio_1;

public class PromocionPymes extends PlanBase{
    /* En la clase PromocionPymes el constructor inicializa activa en true. */
    protected boolean activa;

    public PromocionPymes(int u, int b){
        super(u, b);
        activa = true;
    }

    // <Comando>
    /* • cambiarActiva() modifica el valor del atributo activa, si está en true pasa a false y viceversa. */
    public void cambiarActiva(){
        if (activa){
            activa = false;
        }else{
            activa = true;
        }
    }

    //<Consultas>
    public boolean estaActiva(){
        return activa;
    }
    /* • costoPlan(): entero. Si activa es true retorna el valor base, en caso contrario retorna el valor de base más la cantidad de usuarios multiplicada por 5. */
    public int costoPlan(){
        int aux;
        if (activa){
            aux = base;
        }else{
            aux = base + usuarios*5;
        }
        return aux;
    }

    

}
