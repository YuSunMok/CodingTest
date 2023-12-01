package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class SieveOfEratosthenes_5 {
    public static void main(String[] args) {
        mySolution();
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int answer = 0;

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == 0) {
                answer++;
                for(int j = i; j < arr.length; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println("answer = " + answer);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == 0) {
                int j = 1;
                while(i * j < arr.length) {
                    arr[i*j] = 1;
                    j++;
                }
                answer++;
            }
        }
        System.out.println(answer);
    }
}
