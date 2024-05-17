package Introduction_to_Java_algorithm.recursive_tree_graph;

import java.util.Scanner;

public class Factorial_3 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(DFS(n));
    }

    public static int DFS(int n) {
        if(n <= 1) return 1;
        return n * DFS(n-1);
    }
}
