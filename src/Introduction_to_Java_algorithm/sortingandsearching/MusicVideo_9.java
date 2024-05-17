package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo_9 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int result = 0;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= m) {
                result = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        System.out.print(result);
    }

    public static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}

