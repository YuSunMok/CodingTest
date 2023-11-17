package Introduction_to_Java_algorithm.String;

import java.util.Scanner;

public class ExtractNumbers_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }
        System.out.println(Integer.parseInt(answer));
    }
}
