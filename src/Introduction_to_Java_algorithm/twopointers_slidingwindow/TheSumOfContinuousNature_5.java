package Introduction_to_Java_algorithm.twopointers_slidingwindow;

import java.util.Scanner;

public class TheSumOfContinuousNature_5 {
    public static void main(String[] args) {
        solution();
//        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0, sum = 0, lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {arr[i] = i+1;}
        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        System.out.println(answer);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lt = 0;
        int rt = 0;
        int sum = 0;
        int cnt = 0;
        while (rt < n) {
            if(sum == n) cnt++;
            sum += rt++;
            while(sum > n) {
                sum -= lt++;
            }
        }
        System.out.println(cnt);
    }
}
