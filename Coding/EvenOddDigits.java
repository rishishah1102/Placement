package Coding;

import java.util.Random;

public class EvenOddDigits {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(900) + 100;
        }

        for (int number : numbers) {
            if (sumOfEvenDigits(number) == sumOfOddDigits(number)) {
                System.out.println(number + " has equal sum of even and odd digits.");
            }
        }
    }

    // Function to calculate the sum of even digits in a number
    public static int sumOfEvenDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of odd digits in a number
    public static int sumOfOddDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }
}
// The time complexity is O(n*m) where n is the number of elements in an array and m is the n-digit number.
