package Introduction_to_Java_algorithm.greedy_algorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class Wrestler_1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Body(sc.nextInt(), sc.nextInt()));
        }

        int max = Integer.MIN_VALUE;
        Collections.sort(arr);
        int count = 0;
        for(Body b : arr) {
            if(b.w > max) {
                count++;
                max = b.w;
            }
        }
        System.out.print(count);
    }
}
