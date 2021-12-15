# MODUL 8 : POLIMORFISME

<hr>

## Dasar Teori

* Konsep dasar polimorfisme

Polymorfisme merupakan sebuah konsep dalam OOP yang mana dalam class-nya memiliki bentuk method yang berbeda namun dengan nama yang sama. Maksudnya yaitu dalam sebuah method memiliki nama yang sama namun isi method atau tipde data, parameter-nya berbeda dari method yang lain.  

* Virtual Method Invocation

VMI dapat terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method. 

* Polymorphic arguments

Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya.

* Pernyataan instanceof

instanceof adalah salah satu keyword pada Java, yang digunakan untuk membandingkan suatu objek, apakah instansiasi dari suatu class atau tidak, hasil dari perbandingan tersebut akan menghasilkan nilai boolean berupa nilai true atau false.

* Casting object

Casting tipe objek java pada fungsi method() awalnya adalah metode superclass tetapi variabel superclass tidak dapat mengakses metode lain dari objek subclass yang tidak ada di superclass.

<hr>

## Praktikum
Soal : 
1. Mengidentifikasi soal percobaan modul 8

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul8/src/Modul8/latihan)

 a. [Class Pegawai](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul8/src/Modul8/latihan/Pegawai.java)
 
 Pada awalnya membuat Class Pegawai dahulu yang nantinya akan digunakan sebagai Parent, sebagai parent yang menjadi class utama dan akan mewarisi method ke childnya. 
 ``` java
    private String name;
    private String address;
    private int number;
```
Kemudian setelah itu membuat deklarasi atau mendeklarasikan variable name sebagai string yang nantinya digunakan untuk menyimpan data nama dari gegawai atau identitas, deklarasi address string untuk menyimpan informasi yang berkaitan dengan pegawai dan number integer. Disini menggunakan class modifire privat untuk membatasi class lain agar tidak menggunakannya.

``` java
    public Pegawai (String name, String address, int number){
        System.out.println("Menyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;
    }
```
Kemudian membuat method Pegawai dengan parameter name, address dan number untuk nantinya diguunakan sebagai inputan pada saat dilakukan pemanggilan. Kemudian setelan print, kemudian penggunaan keyword `this` merupakan merujuk pada variable pada class modifire privat di class Pegawai, ini dimaksudkan agar tidak dapat diubah ubah oleh class lain.

``` java
    public void mailCheck(){
        System.out.println("Memeriksa Surat Untuk " + this.name + " " + this.address);
    }
```
Kemudian pembuatan method mailCheck digunakan untuk melakukan pengecekan data yang sudah dimasukan beserta gaji, apabila data berhasil di inputkan dan benar maka mailCheck akan berhasil keluaar dengan nilai yang benar. Pada mailCheck berisikan pemanggilan variabel name dan address menggunakan this yang merujuk pada class modifire private.

``` java
    public String toString(){
        return name + " " + address + " " + number;
    }
```
Kemudian Penulisan toString ini untuk melakukan pemanggilan name, address dan number dari data.

kemudian code yang lainnya adalah sebagai getter dan setter pada program.

 b. [Class Gaji](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul8/src/Modul8/latihan/Gaji.java)
 
 Pada class Gaji dibuat sebagai child dari parent Pegawai, yang mana dia dapat mengakses dan mendapatkan waris dari Class Pegawai.
 ``` java
 public class Gaji extends Pegawai{
 ```
 
 ``` java
    private double salary; //Gaji Tahunan
    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
```
`Private double salary` ini merupakan deklarasi untuk variable salary yaitu penyimpanan gaji tahunan yang akan disipan, penggunakan class modifire private mencegah class lain melakukan perubahan yang tidak diinginkan.
Kemudian ada Method Gaji sebagai masukan data ke variable name, address, number dan salary yaitu inputan data baru. Kemudian didalamnya terdapat keyword super yang berarti data didalamnya akan dialihkan atau dimasukan lagi ke variable yang ada di class parent karena disana merupakan variable penyimpanan datanya dari data tersebut. Dan pemanggilan setSalary dengan isi dalary yaitu inputan data baru.

``` java
    public void mailCheck(){
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Memeriksa tertuju untuk " + getName() + " dengan gaji " + salary);
    }
```
Method mailCheck disini fungsinya sama dengan mailCheck yang ada pada class Pegawai mailchack, disini melakukan pemanggilan dari nama datri getName dan salary yaitu gaji baru yang sudah diupdate. 

``` java
    public double getSalary(){
        return salary;
    }
```
Method getSalary melakukan pengembalia nilai salary ke variabel salary.

``` java
    private void setSalary(double newSalary) {
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }
``` 
Method setSalary dengan parameter newSalary serupakan gaji baru yang baru dimasukan. Kemudian didalamnya akan dilakukan pemrosesan jika newSalary lebih dari atau sama dengan 0.0 maka nilai variable salary akan digantikan dengan nilai dari newSalary. Pada method ini merupakan merubah data dari tipe data integer menjadi tipe data double.

``` java
    public double computerPay(){
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/53;
    }
}
 ```
 Method computerPay berisikan print Menghitung pembayaran gaji dari method getName dari class Pegawai. Dan berisikan pengembalian data ke salary setelah nilai dari salary dibagi 53.
 
 c. [Class VirtualDemo](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul8/src/Modul8/latihan/VirtualDemo.java)
 
 Pada class VirtualDemo berisikan main yang sebagai inputan data dari user untuk menajalankan program.
Pada program ini berisikan inputan dari data Gaji dan Pegawai kemudian pemanggilan method mailCheck untuk gaji dan pegawai. 
 Output dari progam tersebut adalah: 
  
``` java
Menyusun Pegawai
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat 
Memeriksa tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai --
Memeriksa kelas gaji dalam surat 
Memeriksa tertuju untuk Ini nama dengan gaji 2500.0
```
Pada hasil output menampilan dia nilai yang berbeda yaitu data Wahyu dan ini nama karena key data dari mereka berbeda. Kemudian mengapa nilai gaji disini berubah menjadi double padahal inputannya adalah integer, karena di class Gaji dan pada method setSalary nilai salary diubah menjadi double. 

<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 8

Pada praktikum kali ini diharapkan dapat mengerti dan memahami mengenai polymorphism, bagaimana itu bekerja dan penggunaanya. Dan dalam implementasinya polymorphism hampir sama dengan overloading karena penggunannya mengharuskan terdapat method dengan nama yang sama dari class lain, serta jika digabung dengan Virtual Method Invocation (VMI) polimorphisme dan overiding harus ada secara bersamaan agar dapat terjadi VMI. 

Dan diharapkan untuk dapat memahami mengeai apa itu Polymorphic arguments, Pernyataan instanceof dan Casting object.
