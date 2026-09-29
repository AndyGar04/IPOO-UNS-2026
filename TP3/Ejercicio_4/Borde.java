package TP3.Ejercicio_4;

public class Borde {
    
    private int grosor;
    private Color color;

    // <<Constructor>>
    public Borde(int g, Color c){
        grosor = g;
        color = c;
    }

    // <<Comandos>>
    public void establecerGrosor(int g){
        grosor = g;
    }

    public void establecerColor(Color c){
        color = c;
    }

    public void copy(Borde b){
        grosor = b.obtenerGrosor();
        color = b.obtenerColor();
    }

    // <<Consultas>>
    public int obtenerGrosor(){
        return grosor;
    }

    public Color obtenerColor(){
        return color;
    }

    public Borde clone(){
        return new Borde(this.grosor, this.color);
    }

    public boolean equals(Borde b){
        return (grosor == b.obtenerGrosor() && color.equals(b.obtenerColor()));
    }

    public String toString(){
        return ("Borde, Grosor: " + grosor + " Color: " + color.toString());
    }


}
