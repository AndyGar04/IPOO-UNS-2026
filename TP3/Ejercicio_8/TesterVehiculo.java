package TP3.Ejercicio_8;

public class TesterVehiculo {
    public static void main(String[] args) {
        
        System.out.println("--- 1. CONFIGURACIÓN DE TARIFAS ---");
        // Tarifa: 15min = $500 | 30min = $800 | 60min = $1200 | Fija = $2500
        Tarifa cuadroTarifario = new Tarifa(500, 800, 1200, 2500);
        System.out.println("Tarifas cargadas con éxito.\n");

        System.out.println("--- 2. PRUEBA DE INGRESOS Y EGRESOS ---");
        // Vehículo 1: Estadía de exactamente 15 minutos (Aplica T15)
        Hora ingresoV1 = new Hora(10, 0);
        Hora egresoV1 = new Hora(10, 15);
        Vehiculo auto1 = new Vehiculo(ingresoV1, 101, "AB123CD");
        auto1.egresaVehiculo(egresoV1);
        System.out.println("Auto 1 (15 min) - A cobrar esperado $500 -> Calculado: $" + auto1.obteneraCobrar(cuadroTarifario));

        // Vehículo 2: Estadía de 45 minutos (Aplica T60)
        Hora ingresoV2 = new Hora(14, 30);
        Hora egresoV2 = new Hora(15, 15);
        Vehiculo auto2 = new Vehiculo(ingresoV2, 102, "XY987ZZ");
        auto2.egresaVehiculo(egresoV2);
        System.out.println("Auto 2 (45 min) - A cobrar esperado $1200 -> Calculado: $" + auto2.obteneraCobrar(cuadroTarifario));

        // Vehículo 3: Estadía de 3 horas (Aplica Tarifa Fija)
        Hora ingresoV3 = new Hora(8, 0);
        Hora egresoV3 = new Hora(11, 0);
        Vehiculo auto3 = new Vehiculo(ingresoV3, 103, "AR444BB");
        auto3.egresaVehiculo(egresoV3);
        System.out.println("Auto 3 (3 horas) - A cobrar esperado $2500 -> Calculado: $" + auto3.obteneraCobrar(cuadroTarifario));


        System.out.println("\n--- 3. PRUEBA DE CONSULTAS LÓGICAS ---");
        // auto3 ingresó a las 8:00, auto1 ingresó a las 10:00
        System.out.println("¿Auto 3 ingresó antes que Auto 1? (Esperado true): " + auto3.anterior(auto1));
        System.out.println("¿Auto 1 ingresó antes que Auto 2? (Esperado true): " + auto1.anterior(auto2));


        System.out.println("\n--- 4. PRUEBA DE COPY Y EQUALS (EN PROFUNDIDAD) ---");
        // Creamos un Auto 4 idéntico al Auto 1 para probar equals
        Vehiculo auto4 = new Vehiculo(new Hora(10, 0), 101, "AB123CD");
        auto4.egresaVehiculo(new Hora(10, 15));
        System.out.println("¿Auto 1 es igual a Auto 4? (Esperado true): " + auto1.equals(auto4));

        // Probamos el copy (requiere que el vehículo original ya haya egresado)
        Vehiculo autoClon = new Vehiculo(new Hora(7, 0), 999, "VACI000"); // Valores por defecto
        autoClon.egresaVehiculo(new Hora(7, 10)); // Cumplimos la condición de que ya haya egresado
        autoClon.copy(auto1);
        
        System.out.println("¿El Auto Clon es igual al Auto 1 después del copy? (Esperado true): " + autoClon.equals(auto1));
        
        // Verificamos que la copia de las Horas haya sido en profundidad y no superficial
        // Si modificamos la hora de ingreso de auto1, autoClon NO debería verse afectado.
        auto1.obtenerIngreso().establecerHora(12);
        System.out.println("Modificamos la hora de ingreso del Auto 1 original a las 12.");
        System.out.println("Hora de ingreso de Auto 1: " + auto1.obtenerIngreso().obtenerHora());
        System.out.println("Hora de ingreso de Auto Clon (Debería seguir siendo 10): " + autoClon.obtenerIngreso().obtenerHora());
        System.out.println("¿Siguen siendo iguales tras la modificación? (Esperado false): " + auto1.equals(autoClon));
    }
}