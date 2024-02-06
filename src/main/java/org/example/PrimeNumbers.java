package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> firstNPrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        int number = 2;
        while (primeNumbers.size() < n) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
            number++;
        }
        return primeNumbers;
    }
}
