package TP6.Ejercicio_2;

/* En la clase PolizaFabrica: 
• obtenerCostoPoliza(): real. Se computa como el costo de cualquier póliza, más  cantOperarios por 
500, más valorEquipo por 0.8. */

public class PolizaFabrica extends Poliza{
    //<Atributos de instancia>
    protected int cantOperarios;
    protected float valorEquipo;

    //<Constructor>
    public PolizaFabrica(int np){
        super(np);
        nroPoliza = np;
    }
    public PolizaFabrica(int np, float i, float r, int co, float ve){
        super(np, i, r);
        co = cantOperarios;
        ve = valorEquipo;
    }

    //<Comandos>
    public void establecerCantOperarios(int n){
        if (n < 0){
            cantOperarios = 0;
        }else{
            cantOperarios = n;  
        }  
    }

    public void establecerValorEquipo(float n){
        if (n < 0){
            valorEquipo = 0;
        }else{
            valorEquipo = n;
        }
    }

    //<Consultas>
    public int obtenerCantOperarios(){
        return cantOperarios;
    }
    
    public float obtenerValorEquipos(){
        return valorEquipo;
    }

    /*  obtenerCostoPoliza(): real. Se computa como el costo de cualquier póliza, más  cantOperarios por 500, más valorEquipo por 0.8.  */
    public double obtenerCostoPoliza(){
        return (super.obtenerCostoPoliza() + cantOperarios * 500 + valorEquipo * 0.8);
    }
}
