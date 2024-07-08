package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class The_Shortest_Path_In_The_Maze_11 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] board, dis;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <=7; j++){
                board[i][j] = sc.nextInt();
            }
        }

        BFS(1, 1);

        if(dis[7][7] == 0) System.out.print(-1);
        else System.out.print(dis[7][7]);
    }

    public static void BFS(int x, int y) {
        Queue<Point1> q = new LinkedList<>();
        board[1][1] = 1;
        q.offer(new Point1(x, y));
        while(!q.isEmpty()) {
            Point1 p = q.poll();
            int cx = p.x;
            int cy = p.y;
            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dis[nx][ny] += dis[cx][cy] + 1;
                    q.offer(new Point1(nx, ny));
                }
            }
        }
    }
}
