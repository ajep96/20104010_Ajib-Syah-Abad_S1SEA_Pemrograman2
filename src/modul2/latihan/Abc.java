package modul2.latihan;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int []a, b, c;

        System.out.print("Masukan Jumlah Testcase : ");
        t = in.nextInt();
        a = new int[t];
        b = new int[t];
        c = new int[t];
        System.out.println();

        for (int i = 0; i < t; i++){
            System.out.print("Masukan A" + (i + 1) + " : ");
            a[i] = in.nextInt();
            System.out.print("Masukin B" + (i + 1) + " : ");
            b[i] = in.nextInt();
            System.out.print("Masukan C" + (i + 1) + " : ");
            c[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.print("\nA" +(i+1)+ " + B" +(i+1)+ " - C" +(i+1)+ " = ");
            System.out.print(a[i] + b[i] - c[i]);
        }
    }
}
