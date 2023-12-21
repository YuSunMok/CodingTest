package twopointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CombineTwoArrays {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if(arr1[p1] < arr2[p2]) list.add(arr1[p1++]);
            else list.add(arr2[p2++]);
        }
        while (p1 < n) list.add(arr1[p1++]);
        while (p2 < m) list.add(arr2[p2++]);
        list.stream().forEach(i-> System.out.print(i + " "));
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        list.stream().forEach(i -> System.out.print(i + " "));
    }
}
