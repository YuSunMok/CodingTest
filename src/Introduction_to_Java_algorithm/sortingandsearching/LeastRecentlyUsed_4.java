package Introduction_to_Java_algorithm.sortingandsearching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LeastRecentlyUsed_4 {
    public static void main(String[] args) {
        solution();
        mySolution1();
        mySolution2();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] cache = new int[s];

        for(int x : arr) {
            int pos = -1;
            for(int i = 0; i < s; i++) if(arr[i] == x) pos = i;
            if(pos == -1) {
                for(int i = s-1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for(int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        Arrays.stream(cache).forEach(i -> System.out.print(i + " "));
    }

    private static void mySolution1() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedList<Integer> cache = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(!cache.contains(arr[i])) {
                if(cache.size() == s) cache.removeLast();
                cache.addFirst(arr[i]);
            } else {
                cache.addFirst(cache.remove(cache.indexOf(arr[i])));
            }
        }
        cache.forEach(i -> System.out.print(i + " "));
    }

    private static void mySolution2() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] cache = new int[s];

        for(int i = 0; i < n; i++) {
            int startIdx = s-1;
            for(int j = 0; j < s; j++) {
                if(arr[i] == cache[j]) {
                    startIdx = j;
                    break;
                }
            }
            for(int k = startIdx; k > 0; k--) {
                cache[k] = cache[k-1];
            }
            cache[0] = arr[i];
        }
        Arrays.stream(cache).forEach(i -> System.out.print(i + " "));
    }
}
