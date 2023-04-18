package Davi_plata;

public class MeterDinero extends Inicio{
    private int dineroTotal, dineroInt, dineroNew;
    
    public MeterDinero() {}

    public MeterDinero(int dineroTotal, int dineroInt, int dineroNew) {
        this.dineroTotal = dineroTotal;
        this.dineroInt = dineroInt;
        this.dineroNew = dineroNew;
    }

    public int getDineroTotal() {
        return dineroTotal;
    }
    public void setDineroTotal(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }
    public int getDineroInt() {
        return dineroInt;
    }
    public void setDineroInt(int dineroInt) {
        this.dineroInt = dineroInt;
    }
    public int getDineroNew() {
        return dineroNew;
    }
    public void setDineroNew(int dineroNew) {
        this.dineroNew = dineroNew;
    }
    
    public void dineroIngresado() {
        System.out.println("Ahora tu total es: " +dineroNew);
    }
}