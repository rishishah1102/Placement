package DSAProblems;

import java.util.TreeSet;

public class KthSmallestElement {
    public static int kthSmallest(int a[], int k) {
        for (int i = 0; i < k; i++) {
            int temp = a[i];
            int max = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[max] > a[j]) {
                    max = j;
                }
            }
            a[i] = a[max];
            a[max] = temp;
        }
        return a[k - 1];
    }

    // We can also use treeset - Time Complexity is O(nlogn) n because of for loop and logn because of adding elements in treeset.
    public static int kthSmallestTreeset(int a[], int k) {
        TreeSet<Integer> treeset = new TreeSet<>();
        int kthsmallest = -1;
        for (int i = 0; i < a.length; i++) {
            treeset.add(a[i]);
        }

        for (int i = 0; i < k; i++) {
            kthsmallest = treeset.pollFirst();
        }
        return kthsmallest;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 20, 15 };
        int k = 4;

        System.out.println(kthSmallest(arr, k));
        System.out.println(kthSmallestTreeset(arr, k));
    }
}
