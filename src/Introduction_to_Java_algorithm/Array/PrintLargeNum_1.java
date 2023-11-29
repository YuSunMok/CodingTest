package Introduction_to_Java_algorithm.Array;

import java.util.Scanner;

public class PrintLargeNum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int min = Integer.MIN_VALUE;
        String answer = "";
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if(temp > min) {
                answer += temp + " ";
            }
            min = temp;
        }
        System.out.println(answer);
    }
}
