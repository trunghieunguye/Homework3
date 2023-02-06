package Homework3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Nhap so n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Cac uoc cua n la : ");
        for (int i = 1; i <= n ; i++) {
            if (n % i ==0) {
                System.out.print(i + "\t");
            }

        }


    }
}
