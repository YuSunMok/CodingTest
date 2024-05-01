package Introduction_to_Java_algorithm.array;

import java.util.Scanner;

public class gridMaxSum_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++) {
            sum1 = sum2 = 0;
            for(int j = 0; j < n ; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
        }
        result = Math.max(sum1, result);
        result = Math.max(sum2, result);
        sum1 = sum2 = 0;
        for(int i = 0; i < n ; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        result = Math.max(sum1, result);
        result = Math.max(sum2, result);

        System.out.println(result);
    }
}
