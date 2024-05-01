package Introduction_to_Java_algorithm.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindRank_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for(int i = 0; i < n ; i++) {
            scores[i] = sc.nextInt();
        }

        int[] ranks = new int[n];
        for(int i = 0; i < n ; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(scores[i] < scores[j]) {
                    cnt++;
                }
            }
            ranks[i] = cnt;
        }

        Arrays.stream(ranks).forEach(i -> System.out.print(i + " "));
    }
}
