package Introduction_to_Java_algorithm.twopointers_slidingwindow;

import java.util.Scanner;

public class ContinuousSubsequence_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int cnt = 0;
        int pl = 0;
        for(int pr = 0; pr < n; pr++) {
            sum += arr[pr];
            if(sum == m) cnt++;
            while(sum >= m) {
                sum -= arr[pl++];
                if(sum == m) cnt++;
            }

        }
        System.out.println(cnt);
    }
}
