package Introduction_to_Java_algorithm.String;

import java.util.*;

public class Words_In_A_Sentence_3 {
    public static void main(String[] args) {
        Words_In_A_Sentence_3 T = new Words_In_A_Sentence_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution2(str));
    }

    public String solution1(String str) {
        String answer = "";

        int max = Integer.MIN_VALUE;
        int pos = 0;

        while ((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            int len = temp.length();
            if (len > max) {
                max = len;
                answer = temp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer = str;
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            int len = s.length();
            if (len > max) {
                max = len;
                answer = s;
            }
        }
        return answer;
    }
}
