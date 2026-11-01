package TP6.Ejercicio_14;

public class Punto {
    protected int x;
    protected int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void establecerX(int v){
        x = v;
    }

    public void establecerY(int v){
        y = v;
    }

    public int obtenerX(){
        return x;
    }

    public int obtenerY(){
        return y;
    }

    public double distancia(Punto p) {
        double dx = this.x - p.obtenerX();
        double dy = this.y - p.obtenerY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Punto p) {
        return p != null && this.x == p.obtenerX() && this.y == p.obtenerY();
    }
}
