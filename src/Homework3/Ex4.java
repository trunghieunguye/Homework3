package Homework3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Nhap so n = ");
        int n = new Scanner(System.in).nextInt();
        int i =0;
        int num =0;
        String  primeNumbers = "";
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến n là:");
        System.out.println(primeNumbers);
    }



        }


