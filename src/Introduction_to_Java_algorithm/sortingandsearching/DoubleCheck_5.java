package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DoubleCheck_5 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        String result = "U";
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) result = "D";
        }
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        String result = "U";
        if(n != set.size()) result = "D";
        System.out.print(result);
    }
}
