package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_8 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        int result = 0;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                result = mid + 1;
                break;
            } else if(arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;

        }
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int result = binarySearch(arr, m) + 1;
        System.out.print(result);
    }

    public static int binarySearch(int[] arr, int m) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == m) return mid;
            else if(arr[mid] > m) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}
