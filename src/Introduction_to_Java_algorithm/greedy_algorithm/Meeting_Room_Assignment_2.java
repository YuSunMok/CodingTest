package Introduction_to_Java_algorithm.greedy_algorithm;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;

class Time implements Comparable<Time> {
    int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(o.e == this.e) return this.s - o.s;
        return this.e - o.e;
    }
}

public class Meeting_Room_Assignment_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        int count = 0;
        int et = 0;
        for(Time t : arr) {
            if(et <= t.s) {
                count++;
                et = t.e;
            }
        }
        System.out.print(count);
    }
}