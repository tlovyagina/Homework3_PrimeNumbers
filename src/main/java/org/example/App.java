package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        PrimeNumbersChecker checker = new PrimeNumbersChecker();

        while (true) {
            System.out.print("Введите число для проверки (0 - выход): ");
            int n = scanner.nextInt();
            if (n==0) break;
            checker.check(n);
        }
    }
}