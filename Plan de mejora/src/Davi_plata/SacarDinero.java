package Davi_plata;

public class SacarDinero extends Inicio{
    private int dineroTotal, dineroSacar, dineroRest;

    public SacarDinero() {}

    public SacarDinero(int dineroTotal, int dineroSacar, int dineroRest) {
        this.dineroTotal = dineroTotal;
        this.dineroSacar = dineroSacar;
        this.dineroRest = dineroRest;
    }

    public int getDineroTotal() {
        return dineroTotal;
    }
    public void setDineroTotal(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }
    public int getDineroSacar() {
        return dineroSacar;
    }
    public void setDineroSacar(int dineroSacar) {
        this.dineroSacar = dineroSacar;
    }

    public int getDineroRest() {
        return dineroRest;
    }
    public void setDineroRest(int dineroRest) {
        this.dineroRest = dineroRest;
    }

    public void retirarDinero(){
        /*System.out.println("Dinero Retirado: " +dineroSacar);
        System.out.println("Dinero Restante: " +dineroRest);*/
    }
}