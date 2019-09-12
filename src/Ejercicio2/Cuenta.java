package Ejercicio2;

public class Cuenta {
    private float saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void deposito(float monto){
        saldo += monto;
    }
    
    public void retiro(float monto){
        saldo -= monto;
    }
    
    public boolean validarTransaccion(float monto){
        if(saldo > monto)
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Cuenta " + saldo + '}';
    } 
}
