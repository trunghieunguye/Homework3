package Homework3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Nhap so a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap so b = ");
        int b = new Scanner(System.in).nextInt();
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (a == 0 && b == 0)
            System.out.println("Khong co uoc so chung lon nhat");
        else {
            while (a != 0 && b != 0) {
                if (a > b)
                    a = a % b;
                else
                    b = b % a;
            }
            if (a == 0) {
                System.out.println(b + " la UCLN");
            } else {
                System.out.println(a + " la UCLN");

            }
        }
    }
}