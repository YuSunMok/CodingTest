package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class SettingUpAStable_10 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        int result = 0;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) >= c) {
                result = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        System.out.print(result);
    }

    public static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
