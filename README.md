# MODUL 7 : OVERLOADING DAN OVERRIDING

<hr>

## Dasar Teori

* Overloading

Overloading merupakan suatu metode untuk memungkinkan berbagai `method yang berbeda memiliki nama yang sama`, namun dengan `parameter yang berbeda` / memiliki implementasi dan nilai return yang berbeda. Dengan demikian penggunaan Overloading memiliki keuntungannya yaitu tidak perlu menciptakan dan mengingat nama-nama fungsi yang berbeda untuk melakukan tugas yang sama.

* Overriding

Overriding merupakan seuatu metode yang mana `sebuah sub-class memiliki implementasi spesifik yang sama dengan superclassnya`, atau memiliki method dan parameter yang sama dengan superclassnya.

* Aturan tentang Overriding method

Syarat terbentuknya atau dibuatnya overriding :
  1. Nama method harus sama
  2. Daftar parameter harus sama
  3. Return type harus sama

Syarat terbentuknya atau dibuatnya overloading :
  1. Nama method harus sama
  2. Daftar parameter harus berbeda
  3. Return type boleh sama, juga boleh berbeda

<hr>

## Praktikum
Soal : 
1. Mengidentifikasi soal percobaan modul 7

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul7/src/Modul7/percobaan)

  a. [Percobaan 1](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul7/src/Modul7/percobaan/p1) 
  * [Class A](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul7/src/Modul7/percobaan/p1/A.java)

``` java
package Modul7.percobaan.p1;

public class A {
}
```
Class A disini sebagai Parent atau Superclass utama.
  * [Class B](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul7/src/Modul7/percobaan/p1/B.java)

``` java
package Modul7.percobaan.p1;

public class B extends A{
}
```
Class B merupakan Sub-Class dari SuperClass atau parent class A.

Juga menjadi SuperClass dari Class C
  * [Class C](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul7/src/Modul7/percobaan/p1/C.java)

``` java
package Modul7.percobaan.p1;

public class C extends B{
}
```
Class C merupakan Sub-Class dari Class B Karena Class B merupakan SuperClass terdekat dari Sub-Class C.
  * [Class Overload](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul7/src/Modul7/percobaan/p1/Overload.java)
  
``` java
package Modul7.percobaan.p1;

public class Overload {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b){
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();
        A a = new A();

        o.myOverload(a);
        o.myOverload(c);
    }
}
```

Class Overload digunakan sebagai main.

Pada class main ini mencoba memanggil Class C dan dari superclass mana nantinya yang akan dipanggil atau dicetak dari class C ini pada output.

Hasil keluaran
```java
Overload.myOverload(A a)
Overload.myOverload(B b)
```
Pada hasil output bahwa class C yang dipanggil dan menghasilkan keluaran yaitu class B, ini dikarenakan Class B merupakan Superclass terdekat dari class C, dan mengapa class A tidak diprint padahal class A merupakan super class dari class B?, ini karena Superclass tidak memiliki suatu Superclass lagi diatasnya, sehingga saat Class B menjadi superclass dari class C maka Class A tidak memiliki hubungan tetap dengan sub-class C.

  b. [Percobaan 2](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul7/src/Modul7/percobaan/p2)
  
  ``` java
  package Modul7.percobaan.p2;

import Modul7.percobaan.p1.Overload;

public class Overload1 {
    void myMethod(short s){
        System.out.println("short");
    }

    void myMethod(int i){
        System.out.println("int");
    }

    void myMethod(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
        o.myMethod(1);
        o.myMethod(64);
    }
}
  ```
  Pada program diatas merupakan contoh penggunaan dari metode Overloading. Dari program diatas diketahui bahwa tiap method memiliki nama yang sama namun dengan parameter yang berbeda yaitu short, int dan long juga disesuaikan dengan isi keluaran didalamnya. Pada class main variable b dideklarasikan dengan tipe data byte dengan nilai 1. Kemudian variable b dipanggul menggunakan method myMethod yang mana itu merupakan penerapan dari Overloading.
  Hasil keluaran
  
  ``` java 
short
int
int
```
Dari hasil output di dapat hasilnya adalah short.

Mengapa demikian?

Ini dikarenakan tipe data dari variable b mengunakan tipe data byte yang memiliki memory 8-bit dan tipe data data short merupakan nilai terdekat dengan memory bit yaitu 16-bit.

Lalu kenapa nilai yang langung dimasukan mencetak int?

Ini karena pada java nilai angka memiliki tipe data default integer, inilah mengapa nilai angka yang dimasukan memiliki keluaran int.

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 7
* Overloading memungkinkan subclass memiliki nama method yang sama dengan superclass namun tidak dengan implementasinya atau signature-nya.
* Overriding merupakan metode yang memungkinkan subclass menggunakan atau menulis ulang method daru superclass dan menggunakannya di subclass tersebut.
* Syarat Overloading yaitu Nama method harus sama, Daftar parameter harus berbeda, Return type boleh sama, juga boleh berbeda
* Syarat Overriding yaitu Nama method harus sama, Daftar parameter harus sama, Return type harus sama
* Keuntungan menggunakan overloading yaitu tidak perlu menciptakan dan mengingat nama-nama fungsi yang berbeda untuk melakukan tugas yang sama, dan itu akan mengurangi waktu untuk penulisan wakktu pengkodean.
* keuntungan menggunakan overriding yaitu dengan menggabungkan pewarisan dengan metode yang ditimpa, superclass dapat mendefinisikan bentuk umum dari metode yang akan digunakan oleh semua subkelasnya.

