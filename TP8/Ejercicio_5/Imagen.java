package TP8.Ejercicio_5;

public class Imagen extends MatrizGenerica {
    public Imagen(int n){
        super(n,n);
    }

    public boolean todosGrises(){
        boolean tdGris = true;
        for(int i=0; i<cantFilas() && tdGris; i++){
            for(int j=0; j<cantColumnas() && tdGris; j++){
                Color pixel = (Color) obtener(i, j);
                if (pixel == null || pixel.esGris()){
                    tdGris = false;
                }
            }
        }
        return tdGris;
    }
}
