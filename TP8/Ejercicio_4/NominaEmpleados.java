package TP8.Ejercicio_4;

public class NominaEmpleados extends Coleccion{
    /*
    En NominaEmpleados: 
    • sumarSueldos(): real. Computa la sumatoria de todos los sueldos 
    */
    public NominaEmpleados(int n){
        super(n);
    }


    /* • contarSupHoras(h: entero): entero. Cuenta la cantidad de empleados que trabajan más de h horas.  */
    public int contarSupHoras(int h){
        int contEmpleadosHoras=0;
        for (int i=0; i< cantElementos(); i++){
            if (col[i] != null){
                Empleado em = (Empleado) col[i];
                
            }
        }
    }
}
