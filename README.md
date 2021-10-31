# Modul 4 : DASAR PEMROGRAMAN BERIORIENTASI OBJEK

<hr>

## Dasar Teori

* Information hiding

    atau bisa disebut juga menyembunyikan suatu informasi adalah menyembunyikan suatu informasi objek dari objek lain. Information sendiri sangat berkaitan dengan enkapsulasi yaitu menyembunyikan atau melindungi informasi berupa atribut maupun method dengan menggunakan hak akses (modifier) private.
     
     Sebagai contohnya, Pada class 1 merupakan isi dari data-data yang berupa atribut dan method. Sedangkan pada class 2 merupakan tempat dimana program yaitu class 1 dipanggil pada clas 2 dengan membuat sebuah objek baru dan kemudian baru dieksekusi oleh program.

* Enkapsulasi

    Adalah menyembunyikan method suatu objek dari objek lain.
    Secara teknis enkapsulasi menyembunyikan data atau variabel dari class lain dan hanya dapat diakses oleh anggota fungsi dari class itu sendiri yang telah dideklarasikan.

* Constructor
 
    Merupakan suatu method khusus yang digunakan untuk menganalisasi objek. Constructor dibuat setelah class sudah dibuat dan constructor juga dapat diikuti sebuah atau banyak paraeter.

* Overloading constructor

    Adalah kondisi dimana suatu class memiliki lebih dari 1 cunstructor dengan syarat daftar parameternya tidak boleh ada yang sama.


<hr>

## Praktikum
Soal : 
1. Buatlah 2 class StudentRecord dan StudentRecordExample dalam project kemudian analisa

Jawaban :
1. [Jawaban Soal](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/tree/modul4/src/Modul4/latihan)

Pertama membuat class bernama StudentRecord yang nantinya akan digunakan sebagai class yang akan dipanggil, dan setelah itu 
- Kemudian tentukan atribut yang akan digunakan, serta pastikan agar menggunakan enkapsulasi privat agar tidak dapat diakses oleh class lain

    ``` java
    private String name, address;
    private int age;
    private double mathGrade, englishGrade, scienceGrade, average;
    private static int studentCode;
    ```
- Kemudian membuat method getter dan setter nya untuk melakukan pemanggilan data dan memasukan data dari main.

    ``` java
    public String getName(){
    return name;
    }

    public void setName(String temp){
    name = temp;
    }
    ```
pada getname mengunakan pengembalian ke name karena mantinya pada saat dipanggil langsung menunjukan dimana data tersebut berada. Dan setName berguna untuk memasukan nama tersebut, menggunakan String temp sebagai wadah sementara dari masukan kemudian dipindahkan ke variable name.

- Kemudian membuat method bernama getAverage, seperti berikut

     ``` java
    public double getAverage(){
    double result = 0;
    result = (mathGrade + englishGrade + scienceGrade) / 3;
    return result;
    }
    ```
    getAverage digunakan untuk mnghitung nilai dari masukan serta memiliki keluaran rata-rata / banyaknya pelajaran. getAverage berisi rumus dan akan mengembalikan nilai nya ke variable result.
    
- Kemudian membuat method tipe int untuk memanggil integer 

    ``` java
    public static int getStudentCount(){
    return studentCode;
    }
    ```
Method ini berisikan nilai dari yang didapat siswa dengan menggunakan tipe method void maka isinya menggunakan pengembalian/return yang diarahkan ke variable yang ditentukan.

   - [StudentRecord](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul4/src/Modul4/latihan/StudentRecord.java)
    
- Setelah itu membuat class ke 2 sebagai main atau juga bisa dipanggil class pemanggil, pada class pemanggil ini nantinnya akan berisikan method main untuk memanggil program yang sudah dibuat pada class sebelumnya, class ini digunakan untuk melakukan input langsung dari user. Jadi yang pertama dibuat adalah main, kemudain code sepetrti ini
    ``` java
    StudentRecord Wahyu = new StudentRecord();
    StudentRecord Ini = new StudentRecord();
    StudentRecord Nama  = new StudentRecord();
    ```
    ini merupakan cara memanggil class dari class lain dengan menggunakan `Wahyu, Ini, dan Nama` untuk variable yang akan dipanggil di class ini sebagai perantara pemanggilan dari class lain, dengan menggunakan overload constructor.
    
- Kemudian membuat setter dari class yang ada 

``` java
Wahyu.setName("Wahyu");
Ini.setName("Ini");
Nama.setName("Nama");
```
pada bgian ini merupakan mengisikan atau menempatkan String kedalam variable dari class sebelumnya dengan melalui method yang setName sesuai constructor yang sudah ditentukan

- Kemudian melakukan pemanggilan 
    ``` java
    System.out.println(Wahyu.getName());
    System.out.println("Hitung\t: " +StudentRecord.getStudentCount());
    ```
    ini merupakan bagian pemanggilan menggunakan getName.
- Kemudian running program apakah hasilnya sudah sesuai dengan yang diperkirakan atau tidak

``` java
    Wahyu
    Hitung : 0
```
hasilnya menujukan nama wahyu sesuai parameternya wahyu.getName dan Hitun : 0 karena belum dimasukan nilai untuk dihitung
  - [StudentRecordExample](https://github.com/ajep96/20104010_Ajib-Syah-Abad_S1SEA_Pemrograman2/blob/modul4/src/Modul4/latihan/StudentRecordExample.java)


<hr>

## Kesimpulan
Kesimpulan praktikum pemrograman pada modul 4 kali ini adalah mempelajari bagaimana menggunakan constructor dalam java serta pemnaggilan constructor di class lain. Serta mempelajari mengenai enkapsulasi pada class dan method serta atribut pada java.
