package TP8.Ejercicio_4;

public class TestNominaEmpleados {
    public static void main(String[] args) {
        NominaEmpleados nomina = new NominaEmpleados(15);

        // Empleados regulares (leg, nombre, canth, valorh)
        nomina.insertar(new Empleado(101, "Ana Gómez", 160, 2500f));
        nomina.insertar(new Empleado(102, "Luis Pérez", 140, 2400f));
        nomina.insertar(new Empleado(103, "Sofía Díaz", 180, 2600f));
        nomina.insertar(new Empleado(104, "Martín Ruiz", 120, 2200f));
        nomina.insertar(new Empleado(105, "Lucía Sosa", 160, 2500f));
        nomina.insertar(new Empleado(106, "Diego Castro", 150, 2300f));
        nomina.insertar(new Empleado(107, "Valeria Vega", 170, 2550f));

        // Técnicos (ajustá los parámetros extra según cómo hayas definido el constructor de Tecnico)
        nomina.insertar(new Tecnico(201, "Carlos Méndez", 160, 3200f));
        nomina.insertar(new Tecnico(202, "Elena Torres", 165, 3300f));
        nomina.insertar(new Tecnico(203, "Javier Morales", 150, 3100f));
        nomina.insertar(new Tecnico(204, "Camila Silva", 175, 3400f));
        nomina.insertar(new Tecnico(205, "Nicolás Ortiz", 160, 3250f));

        System.out.println("Cantidad de empleados en la nómina: " + nomina.cantElementos());
        System.out.println("Suma total de sueldos: " + nomina.sumarSueldos());
    }
}
