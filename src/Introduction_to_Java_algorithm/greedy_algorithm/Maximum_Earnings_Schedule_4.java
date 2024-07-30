package Introduction_to_Java_algorithm.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money, date;

    Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.date - this.date;
    }
}

public class Maximum_Earnings_Schedule_4 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lecture> arr = new ArrayList<>();
        int n = sc.nextInt();
        int max_d = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if(max_d < d) max_d = d;
        }

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int result = 0;
        int j = 0;
        for(int i = max_d; i >= 1; i--) {
            for(; j < n; j++) {
                if(arr.get(j).date < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) result += pQ.poll();
        }
        System.out.print(result);
    }
}
