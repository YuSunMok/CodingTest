package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Scanner;

public class Combination_7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] combi = new int[n+1][n+1];
        System.out.print(DFS(n, r, combi));
    }
    public static int DFS(int n, int r, int[][] combi) {
//        if(combi[n][r] != 0) return combi[n][r];
        if(combi[n][r] > 0) return combi[n][r];
        if(n == r || r == 0) {
            return 1;
        } else {
//            combi[n-1][r-1] = DFS(n-1, r-1, combi);
//            combi[n-1][r] = DFS(n-1, r, combi);
//            return combi[n-1][r-1] + combi[n-1][r];
            return combi[n][r] = DFS(n - 1, r - 1, combi) + DFS(n - 1, r, combi);
        }

    }
}
