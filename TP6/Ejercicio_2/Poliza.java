package TP6.Ejercicio_2;

class Poliza {
    //Atributos de instancia
    protected  int nroPoliza;
    protected float incendio;
    protected float robo;
    protected boolean activa = true;

    //Constructores
    public Poliza(int np){
        nroPoliza = np;
    }

    public Poliza(int np, float i, float r){
        nroPoliza = np;
        incendio = i;
        robo = r;
    }

    //Comandos
    public void establecerIncendio(float m){
        incendio = m;
    }
    public void establecerRobo(float m){
        robo = m;
    }
    public void actualizarPorcentaje(int p){
        if (activa) {
            float incrementoIncendio = incendio * (p / 100.0f);
            float incrementoRobo = robo * (p / 100.0f);
            incendio = incendio + incrementoIncendio;
            robo = robo + incrementoRobo;
        }
    }
    public void activar(){
        activa = true;
    }
    public void desactivar(){
        activa = false;
    }

    //Consultas
    public int obtenerNroPoliza(){
        return nroPoliza;
    }
    public float obtenerIncendio(){
        return incendio;
    }
    public float obtenerRobo(){
        return robo;
    }
    public double obtenerCostoPoliza(){
        double totalPoliza = incendio + robo;
        return totalPoliza;
    }
    public boolean estaActiva(){
        return activa;
    }
}
