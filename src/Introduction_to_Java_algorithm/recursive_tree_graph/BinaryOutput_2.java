package Introduction_to_Java_algorithm.recursive_tree_graph;

import java.util.Scanner;

public class BinaryOutput_2 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    public static void DFS(int n) {
        if(n == 0) return;
        DFS(n/2);
        System.out.print(n%2);
    }
}
