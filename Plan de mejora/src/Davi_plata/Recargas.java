package Davi_plata;

public class Recargas extends Inicio{
    private int recarga, numero, valorRec;
    
    public Recargas() {}

    public Recargas(int recarga, int numero, int valorRec) {
        this.recarga = recarga;
        this.numero = numero;
        this.valorRec = valorRec;
    }

    public int getRecarga() {
        return recarga;
    }
    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getValorRec() {
        return valorRec;
    }
    public void setValorRec(int valorRec) {
        this.valorRec = valorRec;
    } 
}