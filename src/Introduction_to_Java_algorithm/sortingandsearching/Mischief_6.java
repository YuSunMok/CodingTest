package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class Mischief_6 {
    public static void main(String[] args) {
        mySolution();
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] copy = Arrays.copyOf(arr, n);
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(arr[i] != copy[i]) sb.append(i+1).append(" ");
        }
        System.out.print(sb.toString());
    }
}
