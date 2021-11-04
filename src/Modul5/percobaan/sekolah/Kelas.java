package Modul5.percobaan.sekolah;

import Modul5.percobaan.Mahasiswa;

public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama){
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }

    public void setMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
