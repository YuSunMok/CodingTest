package Introduction_to_Java_algorithm.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time_3 implements Comparable<Time_3> {
    public int time;
    public char status;

    Time_3(int time, char status) {
        this.time = time;
        this.status = status;
    }

    @Override
    public int compareTo(Time_3 ob) {
        if(this.time == ob.time) return this.status - ob.status;
        return this.time - ob.time;
    }
}

public class Wedding_Ceremony_3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time_3> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time_3(s, 's'));
            arr.add(new Time_3(e, 'e'));
        }

        Collections.sort(arr);
        int count = 0;
        int result = Integer.MIN_VALUE;
        for(Time_3 t : arr) {
            if(t.status == 's') count++;
            else count--;
            if(result < count) result = count;
        }
        System.out.print(result);
    }
}
