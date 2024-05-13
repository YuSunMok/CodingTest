package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort_1 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < n-1; i++) {
            int idx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
