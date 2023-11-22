package Introduction_to_Java_algorithm.String;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestStringDistance_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        int[] result = new int[s.length()];

        int min = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                min = 0;
                result[i] = min;
            } else {
                result[i] = ++min;
            }
        }

        min = 1000;
        for (int i = s.length()-1; i > -1; i--) {
            if (s.charAt(i) == t) {
                min = 0;
            } else {
                result[i] = Math.min(++min, result[i]);
            }
        }

        Arrays.stream(result).forEach(i-> System.out.print(i + " "));
    }
}
