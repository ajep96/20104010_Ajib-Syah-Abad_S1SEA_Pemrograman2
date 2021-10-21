package Modul3.percobaan;

public class Tabungan {
    //atribut
    int saldo;

    //constructor
    Tabungan(int saldo){
        this.saldo = saldo;
    }

    //method
    public void ambilUang(int saldo){
        this.saldo = this.saldo - saldo;
    }
}
