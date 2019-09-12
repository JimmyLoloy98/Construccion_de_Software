package Ejercicios;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    /*public Reloj(int horas, int minutos, int segundos) {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    Reloj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = 0;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = 0;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = 0;
    }

    public void puesta_a_cero(){
        horas = minutos = segundos = 0;
    }
    
    public int incremento(int x){
       segundos += x;
       
       if(segundos >= 60){
           minutos = (int)(segundos/60);
           segundos %= 60;
       }
       if(minutos >= 60){
           horas = (int)(minutos/60);
           minutos %= 60;
       }
       if(horas >= 24){
           horas %= 24;
       }
       return 0;
    }
    
    public int decremento(int x){
        if(){
        
        }
        return 0;
    }

    @Override
    public String toString() {
        return "horas= " + horas + ", minutos= " + minutos + ", segundos= " + segundos;
    }
}
