package Modul3.latihan;

public class Tabungan {
    int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (saldo - jumlah < 0){
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}
