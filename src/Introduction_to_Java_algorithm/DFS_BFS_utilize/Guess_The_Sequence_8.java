package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Arrays;
import java.util.Scanner;

public class Guess_The_Sequence_8 {
    static int[] b, p, ch;
    static int[][] combi;
    static int n, f;
    static boolean flag = false;

    public static int combi(int n, int r) {
        if(combi[n][r] > 0) return combi[n][r];
        if(n == r || r == 0) return combi[n][r] = 1;
        else return combi[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    public static void DFS(int L, int sum) {
        if(flag) return;
        if(L == n && sum == f) {
            Arrays.stream(p).forEach(i -> System.out.print(i + " "));
            flag = true;
        }
        else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum + p[L] * b[L]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        combi = new int[n+1][n+1];
        for(int i = 0; i < n; i++) {
            b[i] = combi(n-1, i);
        }
        DFS(0, 0);
    }
}
