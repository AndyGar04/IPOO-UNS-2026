package TP3.Ejercicio_8;

public class Vehiculo {
    //<<Atributos de Instancia>>
    private Hora ingreso;
    private Hora egreso;
    private int numero;
    private String patente;

    //<<Constructor>>
    public Vehiculo(Hora i, int n, String p){
        /* 
            En la clase Vehículo: 
            - El constructor establece el horario de ingreso distinto de null, la patente y el número de la cochera. 
            Asigna null al horario de egreso.  
        */
        if (i != null){
            ingreso = i;
        }
        egreso = null;
        numero = n;
        patente = p;
    }

    //<<Comandos>>
    // • egresaVehiculo(c:Hora). Establece la hora de egreso 
    public void egresaVehiculo(Hora c){
        if (c != null){
            egreso = c;
        }
    }

    /*  
        • obteneraCobrar(t: Tarifa): entero.   Si Hora de egreso es null retorna 0, sino calcula y retorna el monto 
        a  cobrar  aplicando  la  tarifa  que  corresponda  según  la  diferencia  entre  la  hora  de  ingreso  y  la  de 
        egreso.

        El monto a cobrar se calcula según los valores que se reciben en el parámetro de clase Tarifa, si el vehículo 
            estuvo 15 minutos o menos se aplica la tarifa t15, 30 minutos o menos se aplica t30, 60 minutos o menos se 
            aplica t60 y más de 60 minutos se aplica la tarifa fija de día completo.
    */
    public int obteneraCobrar(Tarifa t){
            int cobrar = 0;
            if (egreso != null){
                int diferencia = ingreso.diferenciaMinutos(egreso);
                if (diferencia > 60){
                    cobrar = t.obtenerTFija();
                }else if(diferencia < 60 && diferencia > 30){
                    cobrar = t.obtenerT60();
                }else if(diferencia < 30 && diferencia > 15){
                    cobrar = t.obtenerT30();
                }else{
                    cobrar = t.obtenerT15();
                }
            }
            return cobrar;
    }

    //<<Consultas>>
    public Hora obtenerIngreso(){
        return ingreso;
    }

    public Hora obtenerEgreso(){
        return egreso;
    }

    public String obtenerPatente(){
        return patente;
    }

    public int obtenerNumero(){
        return numero;
    }

    /* 
        • anterior(v: Vehículo): boolean. Retorna true si el objeto que recibe el mensaje representa un Vehículo 
        con horario de ingreso anterior al pasado por parámetro. Requiere v ligado.  
    */
    public boolean anterior(Vehiculo v){
        boolean esAnterior = false;
        if (obtenerIngreso().anterior(v.obtenerIngreso())){
            esAnterior = true;
        }
        return esAnterior;
    }

    /*  
            • equals(v:  Vehiculo):  boolean  y  copy(v:  Vehiculo).  Ambos  requieren  v  ligado,  y  se  implementan  en 
            profundidad, a excepción de la patente que se compara y copia en forma superficial. Copy requiere 
            además que el vehículo ya haya egresado. 
    */
    public boolean equals(Vehiculo v){
        boolean esIgual = false;
        if (v.obtenerIngreso().equals(obtenerIngreso()) && v.obtenerEgreso().equals(obtenerEgreso()) && v.obtenerPatente() == obtenerPatente() && v.obtenerNumero() == obtenerNumero()){
            esIgual = true;
        }
        return esIgual;
    }

    public void copy(Vehiculo v){
        if (egreso != null) {
            numero = v.obtenerNumero();
            patente = v.obtenerPatente();
            
            ingreso.copy(v.obtenerIngreso());
            egreso.copy(v.obtenerEgreso());
        }
    }
}
