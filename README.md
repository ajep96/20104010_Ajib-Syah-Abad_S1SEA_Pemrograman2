# MODUL 5 : MENGELOLA CLASS

<hr>

## Dasar Teori

* Pengertian inheritence

Inheritence (Pewarisan) adalah konsep OOP di mana kita dapat membentuk class baru yang `“mewarisi” atau memiliki bagian-bagian dari class yang sudah ada sebelumnya`. Konsep ini menggunakan sistem hirarki atau bertingkat. Yang mana semakin spesifik submenunya, semakin spesifik pula kontennya. Demikian juga dengan Inheritance OOP di mana semakin spesifik subclassnya, semakin sedikit pula komponen yang dapat diwarisi class tersebut.

* Deklarasi inheritance dan Single inheritance

Pada java untuk menggunakan atau melakukan deklarasi inheritance yaitu dengan menambahkan kata kunci `exstends` setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya atau class yang di akan di extends. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class.
``` java
public class B extends A {
  ...
}
```

* Penerapaan inheritance

Sebagai penerapannya sebagai berikut. 

Contoh :

Class Enemy adalah class induk yang memiliki anak Zombie, Pocong, dan Burung. Apapun properti yang ada di class induk, akan dimiliki juga oleh class anak.
``` java
class Enemy {
    String name;
    int hp;
    int attackPoin;

    void attack(){
        System.out.println("Serang!");
    }
}
```
``` java
class Zombie extends Enemy {
    void walk(){
        System.out.println("Zombie jalan-jalan");
    }
}
```
``` java
class Pocong extends Enemy {
    void jump(){
        System.out.println("loncat-loncat!");
    }
}
```
``` java
class Burung extends Enemy {
    void walk(){
        System.out.println("Burung berjalan");
    }
    void jump(){
        System.out.println("Burung loncat-loncat");
    }
    void fly(){
        System.out.println("Burung Terbang...");
    }
}
```
Dan objek dari class tersebut nanti seperti ini
``` java
Enemy monster = new Enemy();
Zombie zumbi = new Zombie();
Pocong hantuPocong = new Pocong();
Burung garuda = new Burung();
```

* Pengaksesan member dari parent class

Pengaksesan dari member dari parent class-nya seperti ini.
``` java
contoh
Enemy monster = new Enemy();
Zombie zumbi = new Zombie();
Pocong hantuPocong = new Pocong();
Burung garuda = new Burung();
```
Enemy merupakan class yang akan dipanggil dari member parent class atau anak.

Monster merupakan key atau variable yang nantinya dipanggil ketika ingin menggunakan class Enemy.

New Enemy() merupakan pembuatan pemanggilan dari class enemy.

* Kontrol pengaksesan

Pada java kontrol pengaksesan atau access modifiers adalah `keyword istimewa` yang bisa memodifikasi definisi (dan perilaku) dari class, metode atau variabel. Yang diantaranya adalah private, default, protected, public.
|Modifire|Class yang sama|Package yang sama|Subclass|Class manapun|
|---|---|---|---|---|
|private|Y|N|N|N|
|default|Y|Y|N|N|
|protected|Y|Y|Y|N|
|public|Y|Y|Y|Y|

Y = Bisa diakses

N = Tidak bisa diakses

* Kata kunci super

Sama seperti kata kucni this yang mempresentasikan objek dari class, Kata kunci super mempresentasikan objek dari class parent nya.

Format penulisannyaadalahsebagaiberikut : 

a. super.data_member

  merujukpada data member pada parent class 


b. super.function_member() 

merujukpada function member pada parent class 

c. super()  

Merujukpadakonstruktorpada parent class 

Hanyabisadigunakandibarispertamadalamkonstuktorsubklas


* Konstruktor tidak diwariskan

Konstruktor berbeda dari metode kelas lain dalam hal mereka membuat objek baru, sedangkan metode lain dipanggil oleh objek yang ada. Warisan berarti objek yang diturunkan dapat menggunakan metode kelas dasar, tetapi, dalam kasus konstruktor, objek tidak ada sampai setelah konstruktor menyelesaikan tugasnya.

Dan pemanggilan konstruktor hanya bisa dilakukan pada OOP, dan dalam java menggunakan key super, serta untuk menyebutnya di baris 1 pada suatu method.

Contoh : 
``` java
public class Child extends Parent {
  int x;
  public Child() {
    super();
    x = 5; 
  }
}
```
<hr>

## Praktikum
Soal : 
1. Mengidentifikasi soal percobaan modul 6

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan)

  a. [Percobaan 1](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/satu) 
  
  
  
  b. [Percobaan 2](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/dua)
  
  
  
  c. [Percobaan 3](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/tiga)
  
  
  
  d. [Percobaan 4](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/empat)
  
  
  
<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 6
* Inheritance merupakan konsep turunan class dari parent ke child-nya dengan child dapat mewarisi atau mengakses seluruh class dari parentnya.
* Penggunakan dari inheritance dengan menggunakan kata kunci extends pada class childnya, yaitu setelah nama class nya dan diikuti dengan nama class parentnya.
* Pengaksesan member dari class parent dapat dilakukan dengan pemanggilan classnya dan di ikuti dengan variable yang akan digunakan di class tersebut, contoh Musuh monster = new Musuh();
* Pada java terdapat kontrol pengaksesan atau access modifiers untuk mengatur privasi dari masing masing class, method, ataupun variable-nya. Yang diantaranya adalah private, default, protected, public.
* Kata kunci super merupakan Kata kunci yang mempresentasikan objek dari class parent nya, yaitu digunakan untuk memanggil dari class parentnya. Sedang kata kunci this untuk melakukan pemanggilan pada class yang sama.
* Penggunaan kata kunci super harus di letakan pada statement bagian atas, untuk menandakan bahwa statement itu nantinya akan menggunakan class tersebut dan menghindari kesalahan.

