package TP6.Ejercicio_11;

public class TestSensor {
    public static void main(String[] args) {
        
        //B
        Sensor s1 = new Sensor(1, 2); 
        Sensor s2 = new SensorAlfa(1, 2, 3, 4); 
        SensorAlfa s3 = new SensorAlfa(1, 2, 3, 4); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3)); 
        System.out.println(s2.equals(s1));  
        System.out.println(s2.equals(s3)); 
        System.out.println(s3.equals(s1));  
        System.out.println(s3.equals(s2));

        /*
        Salida pre equals:
        true
        true
        true
        true
        true
        true 
        */

        //c) Deben tener p1 y p2 iguales.
        //e) Salida post equals:
        /*  true
            true
            true
            true
            true
            true */
        
        /* f) 
            true
            true
            false
            true
            false
            true
        */
    }   
}
