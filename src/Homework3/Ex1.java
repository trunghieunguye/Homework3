package Homework3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Nhap so a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap so b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap so c = ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhap so d = ");
        int d = new Scanner(System.in).nextInt();
        if (a > b & a > c & a > d) {
            System.out.println("a la so lon nhat");
        } else if (b > c & b > d) {
            System.out.println("b la so lon nhat");
        } else if (c > d) {
            System.out.println("c la so lon nhat");
        } else {
            System.out.println("d la so lon nhat");

        }

    }
}
