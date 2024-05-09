package Introduction_to_Java_algorithm.hashmap_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K_thBigNumber_5 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int m = j+1; m < n; m++) {
                    int sum = arr[i] + arr[j] + arr[m];
                    set.add(sum);
                }
            }
        }

        int result = -1;
        int cnt = 0;
        for(Integer e : set) {
            cnt++;
            if(cnt == k) {
                result = e;
                break;
            }
        }
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int m = j+1; m < n; m++) {
                    int sum = arr[i] + arr[j] + arr[m];
                    set.add(sum);
                }
            }
        }

        int result = -1;
        int cnt = 0;
        for(Integer e : set.descendingSet()) {
            cnt++;
            if(cnt == k) {
                result = e;
                break;
            }
        }
        System.out.print(result);
    }
}
