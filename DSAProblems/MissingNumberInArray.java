package DSAProblems;

import java.util.Arrays;

public class MissingNumberInArray {
    public static int missingNumber(int a[], int size) {

        int sumOfArray = (size * ((2 * a[0]) + ((size - 1) * 1)))/2;
        
        for (int i = 0; i < a.length; i++) {
            sumOfArray -= a[i];
        }

        return sumOfArray;
    }

    public static void main(String[] args) {
        int a[] = { 47, 48, 46, 49, 45, 41, 43, 44, 50 };
        Arrays.sort(a);
        System.out.println(missingNumber(a, a.length + 1));
    }
}
