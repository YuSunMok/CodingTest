package Introduction_to_Java_algorithm.array;

import java.util.Scanner;

public class Peaks_10 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) {
        mySolution();
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && ny >= 0 && nx < n && ny < n && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;

            }
        }

        System.out.println(cnt);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i = 0; i < n+2; i++) {
            for(int j = 0; j < n+2; j++){
                if(i == 0 || j == 0 || i == n+1|| j == n+1){
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int mid = arr[i][j];
                int up = arr[i-1][j];
                int down = arr[i+1][j];
                int right = arr[i][j+1];
                int left = arr[i][j-1];

                if(mid <= up || mid <= down || mid <= right || mid <= left)
                    continue;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
