package TP3.Ejercicio_7;

public class Vehiculo {
    //<<Atributos de Instancia>>
    private Hora ingreso;
    private Hora egreso;
    private int numero;
    private String patente;

    //<<Constructor>>
    public Vehiculo(Hora i, int n, String p){
        /* El constructor establece el horario de ingreso distinto de null, la patente y el número de la cochera. 
        Asigna null al horario de egreso.  */
        if (i != null){
            ingreso = i;
        }
        egreso = null;
        numero = n;
        patente = p;
    }

    /*
        En la clase Vehículo: 
            • egresaVehiculo(c:Hora). Establece la hora de egreso 
            • obteneraCobrar(t: Tarifa): entero.   Si Hora de egreso es null retorna 0, sino calcula y retorna el monto 
            a  cobrar  aplicando  la  tarifa  que  corresponda  según  la  diferencia  entre  la  hora  de  ingreso  y  la  de 
            egreso. 
            • anterior(v: Vehículo): boolean. Retorna true si el objeto que recibe el mensaje representa un Vehículo 
            con horario de ingreso anterior al pasado por parámetro. Requiere v ligado.  
            • equals(v:  Vehiculo):  boolean  y  copy(v:  Vehiculo).  Ambos  requieren  v  ligado,  y  se  implementan  en 
            profundidad, a excepción de la patente que se compara y copia en forma superficial. Copy requiere 
            además que el vehículo ya haya egresado. 
            
            El monto a cobrar se calcula según los valores que se reciben en el parámetro de clase Tarifa, si el vehículo 
            estuvo 15 minutos o menos se aplica la tarifa t15, 30 minutos o menos se aplica t30, 60 minutos o menos se 
            aplica t60 y más de 60 minutos se aplica la tarifa fija de día completo.
    */

}
