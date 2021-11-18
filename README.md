# MODUL 6 : KONSEP INHERITANCE

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
  
  * [Class Bentuk - sebagai parent](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/satu/Bentuk.java)

Class bentuk sebagai parent dibuat yang berisikan variable p, l dengan tipe data integer, serta acces modifirenya protected sehingga class child masih dapat mengaksesnya.
``` java
package Modul6.percobaan.satu;

public class Bentuk {
    protected int p, l;
}
```
  
  * [Class Persegi - sebagai Child](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/satu/Persegi.java)

Class Persegi sebagai subclass atau child dari Class Bentuk, dengan deklarasi variable awal p, l integer.
``` java 
public class Persegi extends Bentuk{
    protected int p, l;
```
Kemudian ada setSuper sebagai method yang nantinya akan menyimpan nilai di variable parent. Pada setSuper menggunaakan kata kunci `super` yang merujuk pada variable yang ada pada class parent.
``` java
    public void setSuperP(int p){
        super.p = p;
    }

    public void setSuperL(int l){
        super.l = l;
    }
```
Kemudian ada set sebagai method yang nantinya akan menyimpan nilai di variable parent. Pada setSuper menggunaakan kata kunci `this` yang merujuk pada variable yang ada pada class-nya atau class yang digunakan.
``` java
    public void setP(int p){
        this.p = p;
    }

    public void setL(int l){
        this.l = l;
    }
```
Lalu method getLuas sebagai method yang berisikan rumus yang nantinya dalam pemanggilan akan menampilkan hasil yang diinginkan
``` java
public void getLuas(){
    System.out.println("Luas super\t: " +(super.p * super.l));
    System.out.println("Luas\t\t: " + (this.p * this.l));
    }
```
  
  * [Class PersegiTest - sebagai main](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/satu/PersegiTest.java)

Pada Class PersegiTest merupakan program main yang berisikan inputan user dan pemanggian dari class sebelumnya untuk dilakukan perintah print. 

Pada kotak.setSuper merupakan inisialisasi untuk variable dari class parent. 

Kotak.set merupakan inisialisasi dari subclass parentnya.

kemudian pemanggilan dari method getLuas dari class kotak.
``` java
package Modul6.percobaan.satu;

public class PersegiTest {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSuperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
}
```
Dan hasil runing dari program tersebut adalah
``` java
Luas super	: 50
Luas		    : 39
```

  b. [Percobaan 2](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/dua)
  * [Class Person - sebagai class parent](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/dua/Person.java)

Pada Class Person diawal terdapat deklarasi variable name, addres dengan tipe data String dan access modifire protected, agar dapat diakses oleh sub-classnya.

Kemudian method Person dengan constructornya.
``` java
public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person\t: Constructor");
        name = "";
        address = "";
    }
```

kemudian dibawahnya terdapat class person ber value serta method geter dan setter. Method get atau geter ini digunakan untuk mengembalikan nilai pada dari variable dengan menggunakan fungsi return dan set atau setter merupakan method void untuk mensetting atau memberikan nilai pada variable dan construktor dari setter biasanya menggunaka this atau super.
``` java
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
```

  * [Class Student - sebagai class child atau subclass](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/dua/Student.java)

Kemudian class child atau sub-class Person sebagai berikut, dengan constructornya.
``` java
package Modul6.percobaan.dua;

public class Student extends Person{
    public Student() {
//        super("Ini nama", "Ini alamat");
//        super();
//        super.name = "Ini nama";

        System.out.println("Inside Student\t: Constructor");
    }
}
```
  * [Class inheritDemo - sebagai class main](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/dua/InheritDemo.java)

Kemudian pada class mainnya hanya berisikan pemanggilan dari sub-class yaitu class Student
``` java
package Modul6.percobaan.dua;

public class InheritDemo {
    public static void main(String[] args) {
        Student Wahyu = new Student();
    }
}
```
Hasil Output
``` java
Inside Person	  : Constructor
Inside Student	: Constructor
```
Dan disini pada class parentnya yaitu Person juga ikut tercetak dalam class mainnya padahal tidak dilakukan pemanggilan pada sub-classnya serta tidak ada pemanggilan dari class main. Ini dikarenakan pada class Student telah menajadi sub-class dari Person yang artinya pada class tersebut akan saling berkaitan satu sama lain. Sehigga ketika dilakukan pemanggilan sub-class Student pada class main class Person akan ikut.
    
  c. [Percobaan 3](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/tiga)
  * [Class A - sebagai class parent](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/tiga/A.java)

Pada class A sebagai parent terdapat inisialisasi dari variable x, y denga tipe data integer, dan access modifire sebelum diganti adallah `privat` kemudian sudah diganti menjadi `protected`. Dan dibawahnya terdapat method set dan get beserta constructor methodnya. Penggunaan dari get dan set dapat di modifikasi sesuai dari kebutuhan dan efisiensi pada programnya nanti.
``` java
package Modul6.percobaan.tiga;

public class A {
    protected int x; //privat tidak bisa di akses oleh class lain
    protected int y; //Protected hanya dapat diakses oleh sub-class atau classnya sendiri 

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void getNilai(){ System.out.println("nilai x : " +x+ " \nnilai y : " +y); }
}
```
Pada method ini kenapa pada acces modifirenya perlu diganti nanti akan dijelaskan dibawah.
  * [Class B - sebagai class child atau subclass](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/tiga/B.java)

Kemudain pada sub-class yaitu class B terdapat inisialisasi variable z dengan access modifire private. Dan method set dan get beserta constructornya.
``` java
package Modul6.percobaan.tiga;

public class B extends A{
    private int z;

    public void setZ(int z) { this.z = z; }

    public void getJumlah(){ System.out.println("Jumlah\t: " + (x+y+z)); }
}
```
  * [Class InheritanceTest - sebagai class main](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/tiga/InheritanceTest.java)

Pada class main terdapat pemanggilan class A sebagai ortu dan B sebagai anak. Dan isisialisasi dari masing masing variable superclass dan subclass. Kemudian dilakukan pemanggilan hasilnya
``` java
package Modul6.percobaan.tiga;

public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak  = new B();

        System.out.println("SuperClass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("\nSubClass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();
        anak.getJumlah();
    }
}
```
Hasilnya sebagai berikut
``` java
SuperClass
nilai x : 10 
nilai y : 20

SubClass
nilai x : 5 
nilai y : 4
Jumlah	: 59
```
Pada superclass, pada hasil percobaan sebelumnya superclass tidak memunculkan nilai dikarenakan menggunakan access modifire private sehingga tidak dapat diakses oleh class lain dan pemanggilan gagal dilakukan, lalu setelah dilakukan penggantian access modifire dengan protected akhirnya nilainya dapat muncul.

Pada subclass semua nilai dapat dicetak namun nilai x tidak dicetak dikarenakan tidak ada method yang mencetak dari nilai z, yang mana nilai x dan y dicetak melalui perintah yang ada pada superclass. dan mencetak jumlah dengan nilai 59, yang mana nilai tersebut adalah benar dan tidak terdapat error pada sistem.
  
  d. [Percobaan 4](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul6/src/Modul6/percobaan/empat)
  * [Class Parent - sebagai class parent](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/empat/Parent.java)

Pada class parent hanya tercapat class kosong tanpa constructor
``` java
package Modul6.percobaan.empat;

public class Parent {
}
```
  * [Class Child - sebagai class child atau subclass](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul6/src/Modul6/percobaan/empat/Child.java)

Kemudian pada class child sebagai subclass nya menurunkan dari class Parent berisi sebagai berikut. 

Sebagai catatan kata kunci `super()` sebelumnya terletak setelah x = 5;
``` java
package Modul6.percobaan.empat;

public class Child extends Parent{
    int x;

    public Child(){
        super(); //penggunaan super harus di letakan pada statement bagian atas
        x = 5;
    }
}
```
Pada percobaan pertama yaitu ketika key super() diletakan setelah x = 5; terdapat error pada program. 

Kemudian setelah dilakukan komplikasi yaitu dengan memindahkan key super() di statement method paling awal, error tidak muncul. Ini dikarenakan penggunaan key super() harus di letakan pada statement method paling awal. Ini yang harus kita perhatikan bahwa untuk pemanggilan konstruktor parent class, kita harus melakukan pemanggilan tersebut di baris pertama pada konstruktor subclass.
  
<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 6
* Inheritance merupakan konsep turunan class dari parent ke child-nya dengan child dapat mewarisi atau mengakses seluruh class dari parentnya.
* Penggunakan dari inheritance dengan menggunakan kata kunci extends pada class childnya, yaitu setelah nama class nya dan diikuti dengan nama class parentnya.
* Pengaksesan member dari class parent dapat dilakukan dengan pemanggilan classnya dan di ikuti dengan variable yang akan digunakan di class tersebut, contoh Musuh monster = new Musuh();
* Pada java terdapat kontrol pengaksesan atau access modifiers untuk mengatur privasi dari masing masing class, method, ataupun variable-nya. Yang diantaranya adalah private, default, protected, public.
* Kata kunci super merupakan Kata kunci yang mempresentasikan objek dari class parent nya, yaitu digunakan untuk memanggil dari class parentnya. Sedang kata kunci this untuk melakukan pemanggilan pada class yang sama.
* Penggunaan kata kunci super harus di letakan pada statement bagian atas, untuk menandakan bahwa statement itu nantinya akan menggunakan class tersebut dan menghindari kesalahan.

