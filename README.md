# MODUL 5 : MENGELOLA CLASS

<hr>

## Dasar Teori

* Package

`Package` merupakan sebuah mekanisme `enkapsulasi untuk mengelompokan class, sub package dan interfaces`. Package juga digunakan untuk mencegah konflik penamaan. Secara mudahnya jika diibaratkan package itu sebagai folder dalam direktori file, dan file sebagai classnya, serta isi filenya adalah program atau method-method.
``` java
package nama-paket;
<identifier> class <nama_class sama dengan package>
Contoh : package Utama;
public class Utama{ }
```

Dan untuk `memanggil package` dapat menggunakan format import
``` java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

* Import class 

Kata kunci `import` digunakan untuk mengimport atau memasukan atau mengakses dari package, class, atau interfaces.


Sebagai contohnya import class Scanner

```java
package ***;

import java.util.Scanner;
import java.util.*;

class namaClass {
}
```

Sedangkan untuk mengimpor class tertentu 

```java
import <nama_package>.<nama_class>;
Contoh : import matematik.bilangan;
```

* Kata kunci this

Keyword `This` merujuk pada object saat ini dalam method atau constructor. 
Penggunaan kata kunci `This` yang paling umum adalah untuk menghilangkan kebingungan antara atribut kelas dan parameter dengan nama yang sama (karena atribut kelas dibayangi oleh metode atau parameter konstruktor).

Penulisan kata kunci this :
``` java
this.data_member        // merujuk pada data member
this.function_member()  // merujuk pada function member
this()                  // merujuk pada konstruktor
```

<hr>

## Praktikum
Soal : 
1. Mengimplementasikan UML class diagram dalam program untuk package perbankan

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul5/src/Modul5/latihan)

* [Pada package perbankan](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul5/src/Modul5/latihan/perbankan)

Pada package perbankan di isi 2 class yaitu class Nasabah dan class Tabungan sebagi pemisah dengan class main agar terkoordinasi dengan baik. Pada package ini dapat di identifikasi dengan melihat dari urutan file di atas : 
``` java
package Modul5.latihan.perbankan;
```
  * [class Nasabah](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul5/src/Modul5/latihan/perbankan/Nasabah.java) 

Pada class Nasabah digunaakan untuk menyimpan data identitas dari Nasabah suatu bank. Pada class ini diawali dengan deklarasi atribut 
``` java
private String namaAwal;
private String namaAkhir;
private Tabungan tabungan;
```
Pada method Nasabah menggunakan keyword `this`
``` java
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
```
`this.namaAwal` pada method itu merujuk pada atribut namaAwal yang terletak pada atribut namaAwal diatas. Begitu juga dengan `this.namaAkhir`. Jika dijelaskan sebagai berikut inputan yang menggunakan method Nasabah(namaAwal, namaAkhir) akan disimpan pada atribut namaAwal dan namaAkhir pada class Nasabah. 

Begitu juga dengan method setTabungan.
```java
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
```

  * [class Tabungan](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul5/src/Modul5/latihan/perbankan/Tabungan.java) 
Pada class Tabungan dibunakan utnuk menyimpan data nominal uang yang dimasukan ataupun data uang yang akan diambil. Pada class ini diawali dengan deklarasi atribut saldo sebagai tempat menyimpan data uang, jumlah sebagai nominal yang diimputkan dari user.
``` java
private int saldo;
private int jumlah;
```
Kemudian pada method Tabungan(int saldo) menggunakan kata kunci this yang merujuk pada atribut saldo
``` java
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
```


* [Di class TesLatihan sebagai main](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul5/src/Modul5/latihan/TesLatihan.java)
Pada class TesKatihan terletak pada tempat yang sama dengan package perbankan, di package latihan
``` java
package Modul5.latihan;
```
Pada class TesLatihan memanggil class Nasabah dan Tabungan menggunakan perintah import untuk memanggil class lain
``` java
import Modul5.latihan.perbankan.Nasabah;
import Modul5.latihan.perbankan.Tabungan;
```
Pada class ini berisikan main dari user yang akan meletakan atau menggambil uang yang ada pada Tabungan.

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 5 kali ini kami belajar menggunakan import dan mengambil atau mengakses class dari package lain. Serta memahami keyword this dan bagaimana penggunakan serta makananya pada code program. Serta sebagai latihan diberikan suatu permasalahan untuk menilai sejauhmana pemahaman mengenai materi yang sudah disampaikan dan sebagai latihan untuk memecahkan suatu permasalahan.
