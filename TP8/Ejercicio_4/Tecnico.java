package TP8.Ejercicio_4;

public class Tecnico extends Empleado{
    Tecnico(int l, String n, int canth, double valorh){
        super(l, n, canth, valorh);    
    }

    public double obtenerSueldo(){
        return super.obtenerSueldo()*1.15;
    }
}
