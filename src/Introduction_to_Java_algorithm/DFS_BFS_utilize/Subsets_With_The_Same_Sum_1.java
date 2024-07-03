package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Scanner;

public class Subsets_With_The_Same_Sum_1 {
    static String answer = "NO";
    static boolean flag = false;
    static int n, total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.print(answer);
    }

    public static void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(n == L) {
            if((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
}
