package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Scanner;

public class Island_Country_Ireland_DFS_13 {
    static int[][] board;
    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
    static int[] dy = {1, -1, 0, 1, -1, 0, 1, -1};
    static int n, answer = 0;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j);
                }
            }
        }

        System.out.print(answer);
    }

    public static void DFS(int x, int y) {
        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
}
