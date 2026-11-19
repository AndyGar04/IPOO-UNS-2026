package TP8.Ejercicio_4;

public class NominaEmpleados extends Coleccion {
    public NominaEmpleados(int n) {
        super(n);
    }
    //consultas
    public int contarSupHoras(int h){
        int cont = 0;
        for(int i = 0; i < cantElementos(); i++){
            Empleado e = (Empleado) col[i];
            if(e.obtenerCantHoras() > h){
                cont++;
            }
        }
        return cont;
    }

    public float sumarSueldos(){
        float suma = 0;
        for(int i = 0; i < cantElementos(); i++){
            Empleado e = (Empleado) col[i];
            suma += e.obtenerSueldo();
        }
        return suma;    
    }   
}
