package Introduction_to_Java_algorithm.string;

import java.util.Scanner;

public class StringPressure_11 {
    public static void main(String[] args) {
        solution1();
        solution2();
    }

    private static void solution1() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char temp = ' ';
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        int len = chars.length;
        int cnt = 1;
        for(int i = 0; i < len; i++) {
            if(temp != chars[i]) {
                sb.append(cnt);
                temp = chars[i];
                sb.append(temp);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        if(cnt != 1) {
            sb.append(cnt);
        }

        System.out.print(sb.toString().replace("1", ""));
    }

    private static void solution2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s += " ";
        String answer = "";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(answer);
    }


}
