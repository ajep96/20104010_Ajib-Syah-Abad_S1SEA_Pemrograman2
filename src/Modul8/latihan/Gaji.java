package Modul8.latihan;

public class Gaji extends Pegawai{
    private double salary; //Gaji Tahunan
    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck(){
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Memeriksa tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary(){
        return salary;
    }

    private void setSalary(double newSalary) {
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }

    public double computerPay(){
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/53;
    }

}
