package Modul4.percobaan;

public class mainTabungan {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 11111);
        Tabungan kamu = new Tabungan("Manu", 1246, 15000, 22222);

        saya.satSaldo(10000);
        saya.satPin(11111);

        System.out.println("Saldo awal saya\t: " + saya.getSaldo());
        System.out.println("Saldo awal kamu\t: " + kamu.getSaldo());
        System.out.println("Nomor pin saya\t: " + saya.getPin());
        System.out.println("Nomor pin kamu\t: " + kamu.getPin());
    }
}
