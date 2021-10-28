package Modul4.percobaan;

public class Tabungan {
    //atribut dg acces modifire private
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    //constractor => tabungan(didalam ini constractor)
    Tabungan(String nama, int noRekening, int saldo, int pin){
        //this merujuk pada atribut saat ini. atribut ini(this.nama) diisi oleh string = nama
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    //new
    Tabungan(String nama, int noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

    //old
    //atribut getter untuk memanggil atribut privat dari class lain
    public String getNama(){
        return nama;
    }

    public int getNoRekening(){
        return noRekening;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getPin(){
        return pin;
    }


    //new
    public void satSaldo(int saldo){
        this.saldo = saldo;
    }

    public void satPin(int pin){
        this.pin = pin;
    }
}
