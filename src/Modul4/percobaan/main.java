package Modul4.percobaan;

public class main {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca", 50410420, 1000000, 12345);
        //memanggil method getter untuk memanggil value atribut
        System.out.println("Nama\t\t: " + saya.getNama());
        System.out.println("No Rekening\t: " + saya.getNoRekening());
        System.out.println("Saldo\t\t: " + saya.getSaldo());
        System.out.println("Pin\t\t\t: " + saya.getPin());
    }
}
