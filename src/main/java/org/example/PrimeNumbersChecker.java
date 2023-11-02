package org.example;

public class PrimeNumbersChecker {
    public void check(int n) {
        if (n == 1) {
            System.out.println(n + " - это число не является ни простым, ни составным.");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " - это составное число.");
                return;
            }
        }
        System.out.println(n + " - это простое число, ура!");
    }
}