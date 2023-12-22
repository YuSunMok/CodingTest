package Introduction_to_Java_algorithm.twopointers_slidingwindow;

import java.util.Scanner;

public class MaximumSales_3 {
    public static void main(String[] args) {
        mySolution();
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < k ;i++) {
            sum += arr[i];
        }
        int max = sum;
        for(int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i-k];
            if(sum > max) {
                max = sum;
            }

        }

        System.out.println(max);
    }
}
