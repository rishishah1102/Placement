package DSAProblems;

public class MinNoOfJumps {
    public static int minNumberOfJumps(int a[]) {
        int count = 0;
        int i = 0;
        while (i < a.length - 1) {
            count++;
            i = i + a[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println("Minimum number of jumps is " + minNumberOfJumps(arr));
    }
}
