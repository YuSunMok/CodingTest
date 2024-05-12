package Introduction_to_Java_algorithm.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign_7 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Queue<Character> q = new LinkedList<>();
        String result = "YES";
        for(char x : s.toCharArray()) q.offer(x);
        for(char x : t.toCharArray()) {
            if(q.contains(x)) {
                if(q.poll() != x) {
                    result = "NO";
                    break;
                }
            }
        }
        if(!q.isEmpty()) result = "NO";
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Queue<Character> q = new LinkedList<>();
        String result = "YES";
        for(char x : s.toCharArray()) q.offer(x);

        for(char x : t.toCharArray()) {
            if(q.isEmpty()) break;
            if(!q.contains(x)) continue;
            // System.out.println(x);
            if(q.poll() != x) {
                result = "NO";
                break;
            }
        }
        if(!q.isEmpty()) result = "NO";
        System.out.print(result);
    }
}
