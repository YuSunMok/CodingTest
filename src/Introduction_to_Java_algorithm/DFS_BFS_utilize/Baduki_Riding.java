package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Scanner;

public class Baduki_Riding {
    static int result = Integer.MIN_VALUE;
    static int n, c;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] w = new int[n];
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        DFS(0, 0, w);
        System.out.print(result);
    }
    public static void DFS(int L, int sum, int[] w) {
        if(n == L) {
            if(c >= sum && sum > result) result = sum;
        } else {
            DFS(L+1, sum + w[L], w);
            DFS(L+1, sum, w);
        }
    }
}
