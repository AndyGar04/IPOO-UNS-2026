package TP8.Ejercicio_6;

public class Letra extends Elemento {
    private char valor;

    public Letra(char valor) {
        this.valor = valor;
    }

    public char obtenerValor() {
        return valor;
    }

    public boolean esEquivalente(Elemento e) {
        boolean eq = false;
        if (e != null && getClass() == e.getClass()) {
            Letra otra = (Letra) e;
            eq = this.valor == otra.valor;
        }
        return eq;
    }
}