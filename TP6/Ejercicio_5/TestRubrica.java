package TP6.Ejercicio_5;

public class TestRubrica {
    public static void main(String[] args) {
        Rubrica r1, r2, r3, r4;
        RubricaAdministrador r5;
        r1 = new Rubrica(101, 10, 30, 20);
        System.out.println(r1.toString());
        System.out.println(r1.total()+" "+r1.promedio()+" "+r1.productividad());
        r2 = new RubricaProgramador(102, 10, 30, 20, 32000);
        System.out.println(r2.toString());
        System.out.println(r2.total()+" "+r2.promedio()+" "+r2.productividad());
        r3 = new RubricaLider(103, 10, 30, 20, 100, 100);
        System.out.println(r3.toString());
        System.out.println(r3.total()+" "+r3.promedio()+" "+r3.productividad());
        r4 = new RubricaAdministrador(104, 10, 30, 20, 100, 100, 50);
        System.out.println(r4.toString());
        System.out.println(r4.total()+" "+r4.promedio()+" "+r4.productividad());
        r5 = new RubricaAdministrador(105, 10, 30, 20, 100, 100, 52);
        System.out.println(r5.toString());
        System.out.println(r5.total()+" "+r5.promedio()+" "+r5.productividad());
    }
}
