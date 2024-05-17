package Introduction_to_Java_algorithm.recursive_tree_graph;

import java.util.Scanner;

public class RecursiveMethod_1 {
    public static void main(String[] args) {
        mySolution();
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    public static void DFS(int n) {
        if(n == 0) return;
        DFS(n-1);
        System.out.print(n + " ");
    }
}
