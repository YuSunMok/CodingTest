package Introduction_to_Java_algorithm.array;

import java.util.Scanner;

public class Mentoring_12 {
    public static void main (String[] args) throws java.lang.Exception 	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생수
        int m = sc.nextInt(); // 문제수
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int l = 0; l < n; l++) {
                        if(arr[k][l] == i) pi = l;
                        if(arr[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                }
                if (cnt == m) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
