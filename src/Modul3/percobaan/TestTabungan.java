package Modul3.percobaan;

public class TestTabungan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("Saldo awal tabungan anda\t: " + t.saldo);
        t.ambilUang(1500);
        System.out.println("Jumlah uang yang diambil\t: 1500");
        System.out.println("Saldo tabungan anda sekarang adalah\t: " + t.saldo);
    }
}
