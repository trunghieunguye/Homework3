package Homework3;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int S = 0, S1 = 0, S2 = 0, i = 1, k = 0;
        while (i <= n){
            S += i;
            i++;
        }
        for (int j = 1; j <= n; j += 2) {
            S1 += i;
        }
        do {
            S2 += k;
            k += 2;
        }while (k <= n);
        System.out.println("The sum of natural numbers which smaller than n = "+S);
        System.out.println("The sum of natural odd numbers which smaller than n = "+S1);
        System.out.println("The sum of natural even numbers which smaller than n = "+S2);
    }
}
