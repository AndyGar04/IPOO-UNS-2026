package TP6.Ejercicio_5;

public class RubricaProgramador extends Rubrica{
    
    protected int lineasCodigo;
    
    //<Constructor>
    public RubricaProgramador(int l, int c, int a, int r, int lc){
        super(l, lc, a, r);
        lineasCodigo = lc;
    }

    //<Comandos>
    public void aumentarLineasCodigo(int p){
        if (lineasCodigo < p){
            lineasCodigo = p;
        }
    }

    //<Consultas>
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }

    public String toString() {
        return "Estado interno: Legajo: " + legajo + ", Comunicacion: " + comunicacion + ", Autonomia: " + autonomia + " Responsabilidad: " + responsabilidad + ", Lineas de codigo: " + lineasCodigo + ".";
    }

    /* En la clase RubricaProgramador:
    • productividad(): real. Computa 1.5 por comunicación más 3 por autonomía más 5 po responsabilidad 
    más (lineasCodigo/10000). */
    public double productividad(){
        return (1.5* comunicacion + 3 * autonomia + 5 * responsabilidad + lineasCodigo/10000);
    }
}
