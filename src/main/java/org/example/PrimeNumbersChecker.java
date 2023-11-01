package org.example;

public class PrimeNumbersChecker {
    public void check(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " - это не простое число!");
                return;
            }
        }
        System.out.println(n + " - это простое число, ура!");
    }
}