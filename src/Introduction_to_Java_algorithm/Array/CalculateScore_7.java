package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class CalculateScore_7 {
    public static void main(String[] args) {
        mySolution();
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int accumulate = 0;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                accumulate = 0;
            } else {
                result += ++accumulate;
            }
        }
        System.out.println(result);
    }
}
