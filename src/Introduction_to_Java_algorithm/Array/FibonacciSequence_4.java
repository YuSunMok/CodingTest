package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class FibonacciSequence_4 {
    public static void main(String[] args) {
        mySolution();
        noArraySolution();
    }
    private static void noArraySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[46];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
