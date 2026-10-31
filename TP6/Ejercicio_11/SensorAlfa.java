package TP6.Ejercicio_11;

public class SensorAlfa extends Sensor{
    // <Atributos de instancia>
    protected float p3;
    protected float p4;

    // <Constructor>
    public SensorAlfa(float pU, float pD, float pT, float pC){
        super(pU, pD);
        p3 = pT;
        p4 = pC;
    }

    // <Comandos> 
    public void establecerP3(float p){
        p3 = p;
    }

    public void establecerP4(float p){
        p4 = p;
    }

    // <Consultas>
    public float obtenerP3(){
        return p3;
    }

    public float obtenerP4(){
        return p4;
    }

    /* En la clase SensorAlfa  
    • riesgo(): boolean. Retorna true si p2 es mayor a p1 o bien p4 es mayor a p3. 
    • emergencia(): boolean. Se considera en emergencia cuando p4 es menor a max. */
    public boolean riesgo(){
        boolean estaEnRisgo = false;
        if (p2 > p1 || p4 > p3){
            estaEnRisgo = true;
        }
        return estaEnRisgo;
    }

    public boolean emergencia(){
        return p4 < max;
    }

    public SensorAlfa clone(){
        return new SensorAlfa(p1, p2, p3, p4);
    }

    /* h) Modifique el método equals en la clase Sensor, manteniendo la signatura, de modo tal que dos sensores son equivalentes si tienen la misma estructura y valores en el estado interno.  */
    public boolean equals(SensorAlfa e){ 
        boolean ig = false; 
        if (this == e ){ 
            ig = true; 
        }else if(getClass()!= e.getClass() || e == null){ 
            ig = false; 
        }else{  
            ig = (p1 == e.obtenerP1() && p2 == obtenerP2() && p3 == obtenerP3() && p4 == obtenerP4());
        } 
        return ig; 
    }
}
