package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int x;
    int y;
    int value;
    int result;
    Node(int x, int y, int value, int result) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.result = result;
    }
}
public class The_Shortest_Path_In_The_Maze_MySolution_11 {

    static Node[][] board;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        board = new Node[8][8];
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++){
                board[i][j] = new Node(i, j, sc.nextInt(), 0);
            }
        }
        System.out.print(BFS());
    }

    public static int BFS() {
        Queue<Node> q = new LinkedList<>();
        board[1][1].value = 1;
        q.offer(board[1][1]);
        while(!q.isEmpty()) {
            Node root = q.poll();
            int x = root.x;
            int y = root.y;
            if(x == 7 && y == 7) return root.result;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny].value == 0) {
                    board[nx][ny].value = 1;
                    board[nx][ny].result += (root.result+1);
                    q.offer(board[nx][ny]);
                }
            }
        }
        return -1;
    }
}
