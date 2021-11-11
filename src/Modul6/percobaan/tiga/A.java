package Modul6.percobaan.tiga;

public class A {
    protected int x; //privat tidak bisa di akses oleh class lain
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai(){
        System.out.println("nilai x : " +x+ " \nnilai y : " +y);
    }
}
