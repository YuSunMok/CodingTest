package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza_Delivery_Distance_14 {
    static int[] combi;
    static int len, n, m, answer = Integer.MAX_VALUE;
    static ArrayList<Point> hs, pz;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hs = new ArrayList<>();
        pz = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if(tmp == 1) hs.add(new Point(i, j));
                if(tmp == 2) pz.add(new Point(i, j));
            }
        }
        combi = new int[m];
        len = pz.size();
        DFS(0, 0);

        System.out.print(answer);
    }

    public static void DFS(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i = 0; i < m; i++) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(combi[i]).x) + Math.abs(h.y - pz.get(combi[i]).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for(int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
