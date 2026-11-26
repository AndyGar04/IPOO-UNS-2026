package Repaso_Coloquio;

public class TesterRepaso {
    public static void main(String[] args) {
        MatrizRacional matriz = new MatrizRacional(3, 3);

        matriz.establecer(0, 0, new Racional(1, 1));
        matriz.establecer(0, 1, new Racional(2, 3));
        matriz.establecer(0, 2, new Racional(4, 5));

        matriz.establecer(1, 0, new Racional(1, 1));
        matriz.establecer(1, 1, new Racional(3, 2));
        matriz.establecer(1, 2, new Racional(1, 4));

        matriz.establecer(2, 0, new Racional(5, 5));
        matriz.establecer(2, 1, new Racional(1, 1));
        matriz.establecer(2, 2, new Racional(2, 2));

        System.out.println("Filas: " + matriz.cantFilas() + ", Columnas: " + matriz.cantCol());
        System.out.println("enTodasUnNeutro: " + matriz.enTodasUnNeutro());
        System.out.println("filaComplemento (fila 0 con sí misma): " + matriz.filaComplemento(0, matriz));
        System.out.println("columnasConUnos (n=2): " + matriz.columnasConUnos(2));
    }
}