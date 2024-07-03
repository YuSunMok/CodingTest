package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import java.util.Arrays;
import java.util.Scanner;

public class Finding_Duplicate_Permutations_4 {
    static int n, m;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] result = new int[m];
        DFS(0, result);
    }
    public static void DFS(int L, int[] result) {
        if(L == m) {
            Arrays.stream(result).forEach(i -> System.out.print(i + " "));
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                result[L] = i;
                DFS(L+1, result);
            }
        }
    }
}
