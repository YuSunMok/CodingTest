package Introduction_to_Java_algorithm.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SaveThePrincess_6 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }
        int result = 0;
        while(!q.isEmpty()) {
            for(int i = 0; i < k-1; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1) result = q.poll();
        }
        System.out.print(result);
    }
}
