package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("1. Deposito\n2. Retiro\n3. Saldo\n4. Exit");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("DEPOSITO:");
                    float monto = sc.nextFloat();
                    cuenta.deposito(monto);
                    break;
                
                case 2:
                    System.out.println("RETIRO:");
                    monto = sc.nextFloat();
                    if(cuenta.validarTransaccion(monto))
                        cuenta.retiro(monto);
                    else
                        System.out.println("El monto a retirar supera al saldo.");
                    break;
                
                case 3:
                    System.out.println("SALDO:");
                    System.out.println(cuenta.toString());
                    break;
            }
            
        }while(op != 4);
            System.out.println(cuenta.toString());
            System.out.println("****** Gracias ******");
        
    }
}
