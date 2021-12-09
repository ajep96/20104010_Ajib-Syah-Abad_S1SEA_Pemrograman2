package Modul8.percobaan;

public class Tes {
    public static void main(String[] args) {
        Parent kelas = new Child();
        System.out.println("Nilai x :\t" + kelas.x);
        kelas.info();
    }
}
