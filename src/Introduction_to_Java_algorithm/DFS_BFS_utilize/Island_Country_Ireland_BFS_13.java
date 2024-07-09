package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point3 {
    int x, y;
    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Island_Country_Ireland_BFS_13 {
    static int[][] board;
    static int answer = 0;
    static int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
    static int n;
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
                    board[i][j] = 0;
                    BFS(i, j);
                }
            }
        }

        System.out.print(answer);
    }

    public static void BFS(int x, int y) {
        Queue<Point3> q = new LinkedList<>();
        q.offer(new Point3(x, y));
        while(!q.isEmpty()) {
            Point3 p = q.poll();
            int cx = p.x;
            int cy = p.y;
            for(int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    q.offer(new Point3(nx, ny));
                }
            }
        }
        answer++;
    }
}
