package Ejercicio2;

public class Cuenta {
    private float saldo;

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float deposito(){
    
        return 0;
    }
    
    public float retiro(){
    
        return 0;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    } 
}
