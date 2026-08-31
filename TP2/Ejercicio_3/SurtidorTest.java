package TP2.Ejercicio_3;

import java.util.Scanner;

public class SurtidorTest {
    public static void main(String[] args){

        Scanner scannerIn = new Scanner(System.in);

        Surtidor s = new Surtidor();

        System.out.println("¿Cuantas iteracione hacemos?");
        int n = scannerIn.nextInt();

        int opciones;

        for (int i=0; i < n; i++){

            System.out.println( " Los litros de gasoil son: " + s.obtenerLitrosGasoil());
            System.out.println( " Los litros de super son: " + s.obtenerLitrosSuper());
            System.out.println( " Los litros de premium son: " + s.obtenerLitrosPremium());

            System.out.println("¿Que quieres hacer?");
            System.out.println(" 1: leer litros a cargar y cargar Gasoil");
            System.out.println(" 2: leer litros a cargar y cargar Super");
            System.out.println(" 3: leer litros a cargar y cargar Premium");
            System.out.println(" 4: llenar Deposito Gasoil");
            System.out.println(" 5: llenar Deposito Super");
            System.out.println(" 6: llenar Deposito Premium");

            System.out.println("Decime que hacemos mostro");
            opciones = scannerIn.nextInt();

            switch (opciones){
                case 1:
                    System.out.println("La cantidad de Gasoil es " + s.obtenerLitrosGasoil());
                    System.out.println("¿Cuanto Gasoil quieres cargar?");
                    int Gasoil = scannerIn.nextInt();
                    s.extraerGasoil(Gasoil);
                    break;
                case 2:
                    System.out.println("La cantidad de Super es " + s.obtenerLitrosSuper());
                    System.out.println("¿Cuanto Super quieres cargar?");
                    int Super = scannerIn.nextInt();
                    s.extraerSuper(Super);
                    break;
                case 3:
                    System.out.println("La cantidad de Premium es " + s.obtenerLitrosPremium());
                    System.out.println("¿Cuanto Premium quieres cargar?");
                    int Premium = scannerIn.nextInt();
                    s.extraerPremium(Premium);
                    break;
                case 4:
                    System.out.println("Llenando el deposito de Gasoil");
                    s.llenarDepositoGasoil();
                    break;
                case 5:
                    System.out.println("Llenando deposito de Super");
                    s.llenarDepositoSuper();
                    break;
                case 6:
                    System.out.println("Llenar deposito de Premium");
                    s.llenarDepositoPremium();    
                    break;
            }
        }
        scannerIn.close();
    }
}
