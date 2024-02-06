package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //No. 1
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        //No. 2
        String str = "abba";
        if (isPalindrome(str)) {
            System.out.println(str + " ist ein Palindrom.");
        } else {
            System.out.println(str + " ist kein Palindrom.");
        }

        //No. 3
        int n = 10; // Anzahl der ersten Primzahlen, die du generieren möchtest
        List<Integer> firstPrimes = PrimeNumbers.firstNPrimeNumbers(n);
        System.out.printf("Die ersten %d Primzahlen sind: %s%n", n, firstPrimes);

        }

        //No. 1
        public static String reverseString(String input) {
            if (input == null) {
                return null;
            }
            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            return reversed.toString();
        }

        //No. 2
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
