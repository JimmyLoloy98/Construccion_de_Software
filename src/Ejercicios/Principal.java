package Ejercicios;

public class Principal {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        
        System.out.println("RELOJ - C.S 1");
        
        reloj.puesta_a_cero();
        reloj.incremento(3599);
        System.out.println(reloj.toString());
        //reloj.decremento();
    }
}
