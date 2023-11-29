package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class VisibleStudent_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int maxTall = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxTall) {
                cnt++;
                maxTall = arr[i];
            }
        }
        System.out.println(cnt);
    }
}
