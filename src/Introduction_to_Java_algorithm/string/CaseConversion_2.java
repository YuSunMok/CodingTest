package Introduction_to_Java_algorithm.string;

import java.util.*;

public class CaseConversion_2 {
    public static void main(String[] args) {
        CaseConversion_2 T = new CaseConversion_2();
        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        System.out.println(T.solution(src));
    }

    public String solution(String src) {
        String answer = "";
        for(char ch : src.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            } else {
                answer += Character.toLowerCase(ch);
            }
        }
        return answer;
    }

}
