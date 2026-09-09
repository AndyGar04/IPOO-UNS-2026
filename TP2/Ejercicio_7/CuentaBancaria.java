// EJERCICIO 7. Dada la siguiente implementación para la clase CuentaBancaria

class CuentaBancaria{
    //Atributos de clase, monto máximo para extraer en descubierto
    private static final int maxDescubierto = 1000;
    //Atributos de instancia
    private int codigo;
    private float saldo;
    // Constructores
    //El código se establece al crear la cuenta y no cambia
    public CuentaBancaria(int cod){
        codigo = cod; saldo = 0; 
    }
    public CuentaBancaria(int cod, float sal){
        codigo = cod; saldo = sal; 
    }
    // Comandos
    public void depositar(float mto){
        //Requiere mto > 0
        saldo = saldo + mto; 
    }
    public void extraer(float mto){
        //Requiere mto > 0
        if (puedeExtraer(mto)){
            saldo = saldo - mto;
        }     
    }
    // Consultas
    public int obtenerCodigo(){
        return codigo; 
    }
    public float obtenerSaldo(){
        return saldo;
    }
    public String toString(){
        return codigo + " " + saldo;
    }
    public boolean puedeExtraer(float mto){
        //Requiere mto > 0
        boolean puede = false;
        if ((-1)*(saldo-mto)<=maxDescubierto){
            puede = true;
        }    
        return puede; 
    }
}
/*
a. Enumere las variables definidas por el programador que forman parte del ambiente de 
referenciamiento en el bloque condicional del método puedeExtraer. 
    - maxDescubierto (atributo de clase).
    - codigo y saldo (atributos de instancia).
    - mto (parámetro formal del método).
    - puede (variable local del método).

b. Muestre el alcance de cada variable declarada en la clase.
    - maxDescubierto, codigo, saldo: Su alcance es toda la clase CuentaBancaria 
    (pueden usarse en cualquier método o constructor de la clase).
    - cod (en el primer constructor): Su alcance se limita al bloque del constructor 
    CuentaBancaria(int cod).
    - cod y sal (en el segundo constructor): Su alcance se limita al bloque del 
    constructor CuentaBancaria(int cod, float sal).
    - mto (en depositar): Su alcance se limita al bloque del método depositar.
    - mto (en extraer): Su alcance se limita al bloque del método extraer.
    - mto y puede (en puedeExtraer): Su alcance se limita al bloque del método puedeExtraer.
*/