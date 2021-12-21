# MODUL 9 : EXCEPTION

<hr>

## Dasar Teori

* Exception


* Tipe-tipe Exception (Checked Exception dan Unchecked Exception)


* Menangani exception menggunakan try, catch, finally, throw dan throws



<hr>

## Praktikum
Soal : 
1. Mengidentifikasi soal percobaan modul 8

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul9/src/Modul9/latihan)

* [Percobaan 1](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul9/src/Modul9/latihan/Latihan1)


``` java
package Modul9.latihan.Latihan1;

import java.io.FileNotFoundException;

public class percobaan7 {
    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
```
[Class](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul9/src/Modul9/latihan/Latihan1/percobaan7.java)

* [Percobaan 2](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul9/src/Modul9/latihan/Latihan2)


``` java
package Modul9.latihan.Latihan2;

import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan Angka\t: ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s){
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");
        }
    }
}
```
[Class](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul9/src/Modul9/latihan/Latihan2/percobaan.java)

* [Percobaan 3](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul9/src/Modul9/latihan/Latihan3)
 
 
``` java

```


[Demo Sebagai Main](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul9/src/Modul9/latihan/Latihan3/Demo.java)

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 8

