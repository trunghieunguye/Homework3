package Homework3;
import java.util.Scanner;
public class Ex9 {
        public static void main(String[] args) {
            System.out.print("Nhap h = ");
            int h = new Scanner(System.in).nextInt();
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }

