package Introduction_to_Java_algorithm.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom_8 {
    public static void main(String[] args) {
        solution();
        mysolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Queue<Person> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }

        int result = 0;
        while(!q.isEmpty()) {
            Person person = q.poll();
            for(Person p : q) {
                if(p.priority > person.priority) {
                    q.offer(person);
                    person = null;
                    break;
                }
            }
            if(person != null) {
                result++;
                if(person.id == m) {
                    System.out.print(result);
                    break;
                }
            }
        }
    }

    private static void mysolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Queue<Integer[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++) q.offer(new Integer[]{arr[i], i});

        int result = 0;
        boolean flag = true;
        int target = arr[m];

        loop: while(flag) {
            Integer[] hd = q.poll();
            int t = hd[0];
            for(Integer[] x : q) {
                if(t < x[0]) {
                    q.offer(hd);
                    continue loop;
                }
            }
            if(m != hd[1] || target != t) result++;
            else {
                flag = false;
                System.out.print(++result);
            }
        }
    }
}
