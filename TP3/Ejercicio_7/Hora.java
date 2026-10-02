package TP3.Ejercicio_7;

public class Hora {

    /* 
        En la clase Hora:
        • hor, es un entero entre 7 y 22; min, es un entero entre 0 y 59. La clase cliente es responsable de
        garantizar que los parámetros del constructor estén dentro del rango especificado. 
    */

    // <<Atributos de instancia>>
    private int hor;
    private int min;

    public Hora(int h, int m){
        hor = h;
        min = m;
    }

    public void establecerHora(int c){
        if (c > 22){
            hor=22;
        }else if(c < 7){
            hor=7;
        }else{
            hor=c;
        }
    }

    public void establecerMinutos(int c){
        if (c < 0){
            min = 0;
        }else if(c > 59){
            min = 59;
        }else{
            hor = c;
        }
    }

    public void copy(Hora c){
        hor = c.obtenerHora();
        min = c.obtenerMinutos();
    }

    public int obtenerHora(){
        return hor;
    }

    public int obtenerMinutos(){
        return min;
    }


    /* 
        • diferenciaMinutos(c: Hora): entero. Retorna la diferencia calculada en minutos entre la hora y
        minutos del objeto que recibe el mensaje y la hora y minutos del parámetro c.  
    */

    /*public int diferenciaMinutos(c: Hora){
        int diferencia=0;
        if ()

        return
    }*/

    /*
        • anterior(c: Hora): boolean. Retorna true si el objeto que recibe el mensaje representa una hora
        anterior al parámetro c.
        • equals(c: Hora): boolean. Requiere c ligado
    */


}
