package TP2.Ejercicio_2;
import java.util.Scanner;

public class TesterPoliza {
    public static void main (String [] args){

        /*
        b) Implemente  una  clase  TesterPoliza  con  un  método  main()  que  solicite  al  usuario  los  
        datos  de  una  póliza,  controle  que  los  tres  valores  sean  positivos,  cree  un  objeto  de
        la  clase  Poliza  usando  el constructor  con  tres  parámetros  y  a  continuación,  actualice 
        con  un  porcentaje  de  20%,  desactive, actualice en 10%, active y muestre por pantalla el 
        número de póliza, el costo y el estado (activa o no).
        */

        int nroPoliza;
        float incendio, robo;

        Scanner sc = new Scanner(System.in);
        
       /* System.out.println(" Dame el numero de poliza  ");
        nroPoliza = sc.nextInt();
        System.out.println("Dame el valor en caso de incendio");
        incendio = sc.nextFloat();
        System.out.println("Dame el valor en caso de robo");
        robo = sc.nextFloat();

        if (nroPoliza < 0 || incendio < 0 || robo < 0){
            System.out.println("Ingresaste datos invalidos, vuelve a intentarlo");
        }else{
            Poliza nuevaPoliza1 = new Poliza(nroPoliza, incendio, robo);

            nuevaPoliza1.actualizarPorcentaje(20);
            
            nuevaPoliza1.desactivar();
            
            nuevaPoliza1.actualizarPorcentaje(10);
            
            nuevaPoliza1.activar();
            
            System.out.println("nroPoliza: " + nuevaPoliza1.obtenerNroPoliza());
            System.out.println("Costo Total: $" + nuevaPoliza1.obtenerCostoPoliza());
            
            if (nuevaPoliza1.estaActiva()) {
                System.out.println("Estado: Activa");
            } else {
                System.out.println("Estado: Inactiva");
            }
        }*/

        /* c) Modifique el método main de la clase TesterPoliza agregando instrucciones para crear un 
        objeto de la clase  Poliza usando el constructor con un parámetro con valor fijo 111, luego  
        establezca valores 1000  y  1200  para  robo  e  incendio,  actualícelos  en  un  15%  y  a  
        continuación  muestre  en  consola  el número de póliza y el costo. */

        System.out.println("Inciso c");
        Poliza nuevaPoliza2 = new Poliza(111);
        nuevaPoliza2.establecerRobo(1000);
        nuevaPoliza2.establecerIncendio(1500);
        nuevaPoliza2.actualizarPorcentaje(15);

        System.out.println(nuevaPoliza2.obtenerNroPoliza());
        System.out.println(nuevaPoliza2.obtenerCostoPoliza());

    }
}
