/* EJERCICIO 3.  Una estación de servicio cuenta con surtidores de combustible capaces de proveer Gasoil, 
Nafta Super y Nafta Premium 2.000. Todos los surtidores tienen capacidad para almacenar un máximo de 
20.000 litros  de  cada  combustible.  En  cada  surtidor  se  mantiene  registro  de  la  cantidad  de  
litros  disponibles  en depósito de cada tipo de combustible (esta cantidad se inicializa en el momento 
de crearse un surtidor con la cantidad máxima de carga). En cada surtidor es posible llenar el depósito o 
extraer combustible.  */

package TP2.Ejercicio_3;

public class Surtidor {
    //Atributos de la clase
    private static final int maximaCarga = 20000;

    //Atributos de la instancia
    private int cantGasoil;
    private int cantSuper;
    private int cantPremium;

    //Constructor
    public Surtidor(){
        cantGasoil = maximaCarga;
        cantSuper = maximaCarga;
        cantPremium = maximaCarga;
    }

    //Comandos
    public void llenarDepositoGasoil(){
        cantGasoil = maximaCarga;
    }
    public void llenarDepositoSuper(){
        cantSuper = maximaCarga;
    }
    public void llenarDepositoPremium(){
        cantPremium = maximaCarga;
    }
    public void extraerGasoil(int litros){
        if (cantGasoil > litros){
            cantGasoil = cantGasoil - litros;
        }else{
            cantGasoil = 0;
        }
    }
    public void extraerSuper(int litros){
        if ( cantSuper > litros){
            cantSuper = cantSuper - litros;
        }else{
            cantSuper = 0;
        }
    }
    public void extraerPremium(int litros){
        if (cantPremium > litros){
            cantPremium = cantPremium - litros;
        }else{
            cantPremium = 0;
        }
    }

    //Consultas
    public int obtenerMaximaCarga(){
        return maximaCarga;
    }
    public int obtenerLitrosGasoil(){
        return cantGasoil;
    }
    public int obtenerLitrosSuper(){
        return cantSuper;
    }
    public int obtenerLitrosPremium(){
        return cantPremium;
    }
    public boolean depositosLlenos(){
        boolean aux;

        if (cantGasoil == 20000 && cantSuper == 20000 && cantPremium == 20000){
            aux = true;
        }else{
            aux = false;
        }

        return aux;
    }

}
