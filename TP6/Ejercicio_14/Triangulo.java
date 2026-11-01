package TP6.Ejercicio_14;

public class Triangulo extends Figura {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;
    }

    public double perimetro() {
        double a = v1.distancia(v2);
        double b = v2.distancia(v3);
        double c = v3.distancia(v1);
        return a + b + c;
    }

    public double area() {
        double a = v1.distancia(v2);
        double b = v2.distancia(v3);
        double c = v3.distancia(v1);
        double s = perimetro() / 2.0; // Semiperímetro
        
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public Punto centro() {
        // Promedio de las coordenadas X e Y de los tres vértices
        double cx = (v1.obtenerX() + v2.obtenerX() + v3.obtenerX()) / 3.0;
        double cy = (v1.obtenerY() + v2.obtenerY() + v3.obtenerY()) / 3.0;
        return new Punto(cx, cy);
    }

    public boolean equals(Figura f) {
        boolean eq = false;
        if (f != null && this.getClass() == f.getClass()) {
            Triangulo otro = (Triangulo) f;
            // equals en profundidad para los tres vértices
            eq = (this.v1.equals(otro.v1)) && 
                 (this.v2.equals(otro.v2)) && 
                 (this.v3.equals(otro.v3));
        }
        return eq;
    }
}