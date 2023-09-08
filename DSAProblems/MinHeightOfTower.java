package DSAProblems;

import java.util.Arrays;

public class MinHeightOfTower {
    public static int minHeightOfTower(int a[], int k) {
        Arrays.sort(a);

        int minH = a[0] + k;
        int maxH = a[a.length - 1] - k;

        if (maxH < minH) {
            minH = minH + maxH;
            maxH = minH - maxH;
            minH = minH - maxH;
        }

        int initialDiffOfH = maxH - minH;

        for (int i = 0; i < a.length; i++) {
            int sub = a[i] - k;
            int add = a[i] + k;

            if (sub >= minH || maxH >= add) {
                continue;
            }

            else if (maxH - sub <= add - minH) {
                minH = sub;
                a[i] = sub;
            }
            else {
                maxH = add;
                a[i] = add;
            }
        }

        int finalDiffOfH = Math.min(maxH - minH, initialDiffOfH);
        return finalDiffOfH;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 10 };
        // int arr[] = { 3, 9, 12, 16, 20 };
        int k = 2;
        System.out.println(minHeightOfTower(arr, k));
    }
}
