package Introduction_to_Java_algorithm.twopointers_slidingwindow;

import java.util.Scanner;

public class MaximumLengthContinuousSubsequence_6 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int lt = 0, cnt = 0, answer = 0;
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.println(answer);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int rt = 0, lt = 0;
        int zeroCnt = 0;
        int result = 0;
        int max = Integer.MIN_VALUE;
        while(rt < n) {
            if(arr[rt] == 0) {
                zeroCnt++;
            }
            while(zeroCnt > k) {
                if(arr[lt] == 0) {
                    zeroCnt--;
                }
                result--;
                lt++;
            }
            result++;
            rt++;
            max = Math.max(result, max);
        }
        System.out.println(max);
    }
}
