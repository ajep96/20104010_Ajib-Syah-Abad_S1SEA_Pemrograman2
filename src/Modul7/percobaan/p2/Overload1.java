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
