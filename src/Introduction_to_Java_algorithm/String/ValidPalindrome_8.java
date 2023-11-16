package Introduction_to_Java_algorithm.String;

import java.util.Scanner;

public class ValidPalindrome_8 {
    public static void main(String[] args) {
        ValidPalindrome_8 T = new ValidPalindrome_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            answer = "YES";
        }
        return answer;
    }

}
