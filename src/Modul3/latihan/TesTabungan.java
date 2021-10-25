package Modul3.latihan;

public class TesTabungan {
    public static void main(String[] args) {

        boolean status;

        Tabungan tabungan = new Tabungan(10000);
        System.out.println("Saldo awal\t: "+tabungan.getSaldo());
        tabungan.simpanUang(8000);

        System.out.println("Jumlah uang yang disimpan\t: 8000");
        status = tabungan.ambilUang(7000);
        System.out.println("Jumlah uang yang diambil\t: 7000");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        tabungan.simpanUang(1000);
        System.out.println("Jumlah uang yang disimpan\t: 1000");
        status = tabungan.ambilUang(10000);
        System.out.println("Jumlah uang yang diambil\t: 10000");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        status = tabungan.ambilUang(2500);
        System.out.println("Jumlah uang yang diambil\t: 2500");

        if (status) {
            System.out.println("\tok");
        } else {
            System.out.println("\tgagal");
        }
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan\t: 2000");
        System.out.println("Saldo   sekarang    =   " + tabungan.getSaldo());
    }
}
