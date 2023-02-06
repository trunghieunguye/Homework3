package Homework3;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.print("Nhap so n = ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("So chan la : ");
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "\t");
                }
            }
        System.out.println("");

        System.out.print("So le la : ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }



        }
    }
}




