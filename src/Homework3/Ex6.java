package Homework3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int tong = 0;
        System.out.print("Nhap so n = ");
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            tong += n % 10;
            n = n / 10;
        }
        System.out.println("Tong cac chu so cua n la: " + tong);
    }
}


