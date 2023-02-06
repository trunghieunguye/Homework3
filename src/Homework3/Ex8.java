package Homework3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int i;
        System.out.print("Nham m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nham n = ");
        int n = new Scanner(System.in).nextInt();
        for (i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }

}
