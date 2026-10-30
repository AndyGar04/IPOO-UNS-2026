package TP6.Ejercicio_4;

class Hija extends Base{
    protected int y;
    public Hija(int p1,int p2){
        super(p1);
        y = p2;
    }
    int f(int p){
        return x*p;
    }
    int g(){
        return x*10+y;
    }
}
