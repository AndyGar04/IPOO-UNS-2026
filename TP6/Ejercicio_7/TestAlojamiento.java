package TP6.Ejercicio_7;

public class TestAlojamiento {
    public static void main(String[] args) {
        Departamento nD1 = new Departamento(1, 2, 3, false);
        Departamento nD2 = new Departamento(2, 3, 4, true);

        Habitacion h1 = new Habitacion(3, 3, 3);
        Habitacion h2 = new Habitacion(4, 4, 4);

        System.out.println("Depa 1: Se espera: 120.000 , da:" + nD1.costoDiario(20000));
        System.out.println("Depa 2: Se espera: 240.150 , da:" + nD2.costoDiario(20000));
        System.out.println("Habitacion 1: Se espera: 90.000 , da:" + h1.costoDiario(20000));
        System.out.println("Habitacion 2: Se espera: 160.000 , da:" + h2.costoDiario(20000));
    }
}
