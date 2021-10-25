# Modul 3 : PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK

<hr>

## Dasar Teori
* Pemrograman Berorientasi Objek

  Merupakan pemrograman yang berorientasikan kepada objek, yang mana semua data dan fungsi dibungkus dalam class atau object. 
  
* Deklarasikan Class

  Class merupakan sebuah wadah yang berisi suatu pemodelan dari objek yang mendeskripsikan data atau sifat karakter dan fungsi dari objek nya.
  Class sendiri dapat diartikan cetak biru atau blueprint untuk membuat suatu objek.
  
```java
        <modifier> class <nama_class> {
        [isi class]
        }
        Contoh : 
            public class Mobil{ }
```
  
* Deklarasi Atribut

  Atribut adalah suatu nilai data yang terletak pada objek dan berasal dari class. 
``` java
<modifier> <tipe> <nama_atribut> ;
Contoh : 
      public String warna;
```
  
* Deklarasi Method

Method merupakan sesuatu yang dapat dilakukan oleh objek serta metode implementasinya ditulis dalam bentuk fungsi. 


* Mengakses anggota Object

Untuk mengakses suatu objek atau anggotanya harus membuat instance dari class terlebih dahulu.
``` java
public class Mobil {
  public static void main(String args[]){ 
    Mobil m=new Mobil();
    m.warna=”hitam”;
    m.no_Plat=”KT 2837 UE”;
    m.info();
   }
}
 ``` 

<hr>

## Praktikum
Soal : 
1. Mengimplementasikan UML class diagram dalam program untuk
class Tabungan

**Tabungan**
|-----|
| + saldo : int |
| + Tabungan(initsaldo : int)|
| + getSaldo() : int |
| + simpanUang(jumlah : int) |
| + ambilUang(jumlah : int) : boolean |



Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul3/src/Modul3/latihan/Tabungan.java)

berdasarkan tabel uml diatas, kemudian dapat dibuat code program sebagai berikut
``` java
int saldo;
```
merupakan deklasrasi saldo bertipe integer,

``` java
public Tabungan(int saldo){
  this.saldo = saldo;
  }
```
Kemudian membuat method berdasarkan class untuk diakses sendiri sebagai base data,

``` java
public int getSaldo(){
  return saldo;
  }
```
Kemudian getSaldo sebagai keluaran saldo yang ada dalam program atau yang tersimpan,

``` java
public int simpanUang(int jumlah){
  return saldo = saldo + jumlah;
  }
```
Method simpang uang untuk input nilai dari user kedalam data saldo yang ada, dengan hasilnya nanti saldo + jumlah, jumlah ini merupakan inputan dari user,

``` java
public boolean ambilUang(int jumlah){
  if (saldo - jumlah < 0){
    return false;
  } else {
    saldo -= jumlah;
    return true;
  }
}
```
Kemudian method ambil uang, ini digunakan untuk keluaran uang dari saldo ketika uang diambil, yaitu dengan saldo - jumlah dengan jumlah berasal dari inputan oleh user.

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 3 kali ini adalah mahasiswa dituntut agar mampu memahami cara penggunakan class, objek, dan method pada pemrograman dan bagaimana implementasinya jika digunakan dalam model oop, serta bagaimana masing masing program bekerja saat dijalankan.
