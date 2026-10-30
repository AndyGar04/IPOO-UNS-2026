package TP6.Ejercicio_2;

public class TestPoliza {
    public static void main(String []args){
        // b) Muestre la salida del siguiente código definido en una clase cliente:
            Poliza p1, p2, p3;
            p1 = new Poliza(111, 100, 120);
            p2 = new PolizaEscolar(112, 100, 120, 1000, 1500);
            p3 = new PolizaFabrica(113, 100, 120, 20, 50000);
            System.out.println(p1.obtenerNroPoliza()+" "+p1.obtenerCostoPoliza());
            System.out.println(p2.obtenerNroPoliza()+" "+p2.obtenerCostoPoliza());
            System.out.println(p3.obtenerNroPoliza()+" "+p3.obtenerCostoPoliza());
            
        //c) Analice el siguiente segmento de código definido en una clase cliente:
            PolizaEscolar p4;
            Poliza p5;
            p4 = new PolizaEscolar(114, 100, 120, 1000, 1500);
            p5 = new PolizaEscolar(115, 100, 120, 1000, 1500);
            System.out.println(p4.obtenerNroPoliza()+" "+p4.obtenerCostoPoliza(2));
            //System.out.println(p5.obtenerNroPoliza()+" "+p5.obtenerCostoPoliza(2)); -> Da error porque el tipo estatico es poliza y no cuenta con un metodo obtener costo con parametros.
        //d) Indique cuál es el tipo estático y dinámico de p1, p2, p3, p4 y p5 definidas antes. 
        /* 
        p1: Tipo estatico: Poliza -- Tipo dinamico: Poliza
        p2: Tipo estatico: Poliza -- Tipo dinamico: PolizaEscolar
        p3: Tipo estatico: Poliza -- Tipo dinamico: PolizaEscolar
        p4: Tipo estatico: PolizaEscolar  -- Tipo dinamico: PolizaEscolar
        p5: Tipo estatico: Poliza -- Tipo dinamico: PolizaEscolar
        */
    }
}
