package DSAProblems;

public class MaxSubArraySum {
    public static int maxSubarraySum(int a[]) {
        int maxSum = a[0];
        int pastSum = a[0];

        // consider a = 1 nd b = 2
        // first we will do sum of a+b and compare it with b. 
        // if a+b is greater than b than compare it with a.
            // if a is greater than a+b than max will be a, so in next iteration a=a and b=next term and carry same process, past sum will be a+b and max sum will be a.
            // else max will be a+b, so a=a+b and b= next term and carry same process, past sum will be a+b and max sum will be a+b.
        // if b is greater than a+b than compare it with a.
            // if a is greater than b than max will be a, so in next iteration a=a and b=next term and carry same process, past sum will be b and max sum will be a
            // if b is greater than a than max will be a, so in next iteration a=b and b=next term and carry same process, past sum will be b and max sum will be a.
        for (int i = 1; i < a.length; i++) {
            pastSum = Math.max(a[i], pastSum + a[i]);
            maxSum = Math.max(maxSum, pastSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 1, 2, -2, 3, 5, -2 };
        System.out.println("Max Sum is: " + maxSubarraySum(arr));
    }
}
