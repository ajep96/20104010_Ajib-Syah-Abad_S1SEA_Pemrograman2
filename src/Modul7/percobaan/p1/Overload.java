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
