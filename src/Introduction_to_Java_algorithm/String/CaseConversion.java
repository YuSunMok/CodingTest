package Introduction_to_Java_algorithm.String;

import java.util.*;

public class CaseConversion {
    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();
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
