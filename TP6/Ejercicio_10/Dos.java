package TP6.Ejercicio_10;

public class Dos extends Uno{
    int f(){
        return 11;
    }
    int g(){
        return super.g()*3;
    }
    int l(){
        return super.f()*-1 ;
    }
    int n(){
        return f() *-5 ;
    }
    int m(String s){
        return s.length();
    }
}
