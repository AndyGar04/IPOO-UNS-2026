package TP7.Ejercicio_2;

public class FilaSensores{

    protected Sensor[] arreglo;

    public FilaSensores(int cant){
        if (cant > 0){
            arreglo = new Sensor[cant];
        }else{
            arreglo = new Sensor[1];
        }
    }

    public void establecerSensor(int p, Sensor s){
        if (p >= 0 && p<cantSensores()){
            arreglo[p] = s;
        }
    }

    public void intercambiar(int p1, int p2){
        Sensor sAux;
        if (p1 >= 0 && p2 >= 0 && p1 < cantSensores() && p2 < cantSensores()){
            sAux = arreglo[p1];
            arreglo[p1] = arreglo[p2];
            arreglo[p2] = sAux;
        }
    }

    public void copy(FilaSensores fs){
        if (fs != null && fs.cantSensores() == cantSensores()){
            for (int i=0; i < cantSensores() ; i++){
                if (fs.obtenerSensor(i) != null){
                    arreglo[i].copy(fs.obtenerSensor(i));
                }else{
                    arreglo[i] = null;
                }
            }
        }
    }

    // ---*---
    public int cantSensores(){
        return arreglo.length;
    }

    public Sensor obtenerSensor(int p){
        Sensor aux = null;
        if (p>=0 && p < arreglo.length){
            aux = arreglo[p];
        }
        return aux;
    }

    public int cantidadRiesgo(){
        int cont=0;
        for(int i=0; i < cantSensores(); i++){
            if (arreglo[i] != null && arreglo[i].riesgo()){
                cont++;
            }
        }
        return cont;
    }

    public boolean hayNRiesgo(int n){
        int cont = 0;
        if (n <= cantSensores()){
            for(int i=0; i < cantSensores() && cont <= n; i++){
                if(arreglo[i] != null){
                    if (arreglo[i].riesgo()){
                        cont++;
                    }
                }
            }
        }
        return cont == n;
    }

    public boolean dosConsecutivosEmergencia(){
        boolean hay2C = false;
        for (int i = 0; i < cantSensores()-1 && !hay2C; i++){
            if (arreglo[i] != null && arreglo[i+1]!=null && arreglo[i].emergencia() && arreglo[i+1].emergencia()){
                hay2C = true;
            }
        }
        return hay2C;
    }

    public boolean equals(FilaSensores a){
        boolean ig = true;
        if (a == null){
            ig = false;
        }else if(a == this){
            ig = true;
        }else{
            for (int i=0; i < cantSensores() && ig; i++){
                if(arreglo[i] != null && a.obtenerSensor(i) != null){
                    if (!arreglo[i].equals(a.obtenerSensor(i))){
                        ig = false;
                    }
                }
            }
        }
        return ig;
    }

    public FilaSensores clone(){
        FilaSensores nFs = new FilaSensores(cantSensores());

        for(int i=0; i<cantSensores(); i++){
            if(arreglo[i] != null){
                nFs.establecerSensor(i, obtenerSensor(i).clone());
            }else{
                arreglo[i] = null;
            }
        }
        return nFs;
    }

}