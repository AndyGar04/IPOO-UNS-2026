package TP6.Ejercicio_13;

public class TestDispositivos {
    public static void main(String[] args) {
        Dispositivo s1 = new Dispositivo(1, 2);
        Dispositivo s2 = new DispositivoFull(1, 2, 3, 2);
        DispositivoFull s3 = new DispositivoFull(1, 2, 3, 4);
        DispositivoFull s4 = new DispositivoFull(1, 2, 3, 1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s1)); // Da error la primera vez debido a que si bien s2 es de tipo estatico dispositivo, sin embargo al querer ejecutar el equals, trata de comparar p3 y p4, dando error en ejecucion.
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1)); // Da error la primera vez debido a que aunque hagamos el cauching. Se ejecuta el equals de la clase hija y da eror en ejecucion, ya que no tiene p3 y p4 que comparar
        System.out.println(s3.equals(s2));
        System.out.println(s3.equals(s4));

        /*
        Primera salida: true, true, error, false, error, false, false
        Segunda salida: true, true, true, true, true, true, false
        Tercera salida: false, false, false, true, false, true, false
        
        Observe que en esta última versión:
        Dos dispositivos son equivalentes si son de la misma clase y tienen el mismo estado interno. 
        */
    }
}
