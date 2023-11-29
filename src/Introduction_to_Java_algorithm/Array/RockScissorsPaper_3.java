package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class RockScissorsPaper_3 {
    public static void main(String[] args) {
        mySolution();
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                System.out.println("D");
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                System.out.println("A");
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                System.out.println("A");
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(arrA[i] == 1) {
                if(arrB[i] == 1) {
                    System.out.println("D");
                } else if (arrB[i] == 2) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            } else if(arrA[i] == 2) {
                if(arrB[i] == 1) {
                    System.out.println("A");
                } else if (arrB[i] == 2) {
                    System.out.println("D");
                } else {
                    System.out.println("B");
                }
            } else {
                if(arrB[i] == 1) {
                    System.out.println("B");
                } else if (arrB[i] == 2) {
                    System.out.println("A");
                } else {
                    System.out.println("D");
                }
            }
        }
    }
}
