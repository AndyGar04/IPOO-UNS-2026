package TP3.Ejercicio_3;

public class Fecha {
    private int dia, mes, anio;

    //Constructor
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }

    //Comandos
    public void establecerDia(int d){
        dia = d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }

    //Consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        boolean aux;
        if (anio % 4==0 && anio != 0){
            aux = true;
        }else{
            aux = false;
        }

        return aux;
    }

    /*
    esAnterior(f: Fecha): boolean. Retorna verdadero si 
    y solo si la fecha que recibe el mensaje es anterior
    a la fecha pasada por parámetro. Requiere f ligada. 
    */
    public boolean esAnterior(Fecha f){
        boolean aux = false;
        if (anio < f.obtenerAnio()){
            aux = true;
        }else if (anio == f.obtenerAnio() && mes < f.obtenerMes()){
            aux = true;
        }else if (anio == f.obtenerAnio() && mes == f.obtenerMes() && dia < f.obtenerDia()){
            aux = true;
        }
        return aux;
    }

    public boolean mismoAnio(Fecha f){
        boolean aux = false;
        if (anio == f.obtenerAnio()){
            aux = true;
        }
        return aux;
    }

    public boolean equals(Fecha f){
        boolean aux = false;
        if (anio == f.obtenerAnio() && mes == f.obtenerMes() && dia == f.obtenerDia()){
            aux = true;
        }
        return aux;
    }

    /* 
    equals(f: Fecha): boolean. Requiere f ligada.
    */

    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }
}
