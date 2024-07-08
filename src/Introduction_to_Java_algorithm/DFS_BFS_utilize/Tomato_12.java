package Introduction_to_Java_algorithm.DFS_BFS_utilize;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point1 {
    int x, y;
    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Tomato_12 {

    static int[][] board, dis;
    static int n, m;
    static Queue<Point1> q;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) q.offer(new Point1(i, j));
            }
        }

        BFS();

        boolean flag = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 0) flag = false;
            }
        }
        int answer = Integer.MIN_VALUE;
        if(flag) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.print(answer);
            return;
        }
        System.out.print(-1);
    }

    public static void BFS() {
        while(!q.isEmpty()) {
            Point1 p = q.poll();
            int cx = p.x;
            int cy = p.y;
            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dis[nx][ny] += dis[cx][cy] + 1;
                    q.offer(new Point1(nx, ny));
                }
            }
        }
    }
}
