package Davi_plata;

public class ConsultarSaldo extends Inicio{
    private int saldo;

    public ConsultarSaldo() {}

    public ConsultarSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void consultaSaldo() {
        /*System.out.println("Tu saldo es: " +saldo);*/
    }
}