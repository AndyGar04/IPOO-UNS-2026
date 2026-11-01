package TP6.Ejercicio_13;

public class DispositivoFull extends Dispositivo{
    protected double p3;
    protected double p4;

    public DispositivoFull(int pU, int pD, int pT, int pC){
        super(pU, pD);
        p3 = pT;
        p4 = pC;
    }

    public void establecerP3(double p){
        p3 = p;
    }

    public void establecerP4(double p){
        p4 = p;
    }

    public double obtenerP3(){
        return p3;
    }

    public double obtenerP4(){
        return p4;
    }

    /*
    • equals(d: Dispositivo): boolean. Dos instancias de Dispositivo son equivalentes si tienen el mismo
    estado interno.
    */
    public boolean equals(DispositivoFull e){
        boolean ig;
        if (this == e){
            ig = true;
        }else if (e == null){
            ig = false;
        }else if(getClass()!= e.getClass()){
            ig = false;
        }else {
            DispositivoFull r = (DispositivoFull) e;
            ig = super.equals(e) && p3 == r.obtenerP3() && p4 == r.obtenerP4();
        }
        return ig;
    }


    /*
    • riesgo(): boolean. Retorna true si p2 es mayor a p1 o bien p4 es mayor a p3.
    */
    public boolean riesgo(){
        return super.riesgo() || p4 > p3;
    }

    /*
    • emergencia(): boolean. Se considera en emergencia cuando p4 es menor a max. 
    */
    public boolean emergencia(){
        return p4 > max;
    }

}
