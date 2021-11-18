package Modul7.percobaan.p3;

public class Overriding {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Penguin penguin = new Penguin();

        burung.terbang();
        penguin.terbang();

        /*
        ciri2 Override
        1. Nama method harus sama
        2. Daftar parameter harus sama
        3. Return type harus sama
        */
    }
}
