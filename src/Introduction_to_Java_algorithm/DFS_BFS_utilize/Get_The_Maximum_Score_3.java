package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Scanner;

public class Get_The_Maximum_Score_3 {
    static int n, m, score = Integer.MIN_VALUE;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] scores = new int[n];
        int[] times = new int[n];
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        DFS(0, 0, 0, scores, times);
        System.out.print(score);
    }
    public static void DFS(int L, int scoreSum, int timeSum, int[] scores, int[] times) {
        if(timeSum > m) return;
        if(L == n) {
            score = Math.max(score, scoreSum);
        } else {
            DFS(L+1, scoreSum + scores[L], timeSum + times[L], scores, times);
            DFS(L+1, scoreSum, timeSum, scores, times);
        }
    }
}
