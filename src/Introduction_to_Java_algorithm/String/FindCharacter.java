package Introduction_to_Java_algorithm.String;

import java.util.Scanner;

public class FindCharacter {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char ch : str.toCharArray()) {
            if(c == ch) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindCharacter main = new FindCharacter();
        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(main.solution(src, c));
    }

}
