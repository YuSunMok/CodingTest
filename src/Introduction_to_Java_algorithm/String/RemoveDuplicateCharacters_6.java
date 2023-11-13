package Introduction_to_Java_algorithm.String;

import java.util.Scanner;

public class RemoveDuplicateCharacters_6 {

    public static void main(String[] args){
        RemoveDuplicateCharacters_6 T = new RemoveDuplicateCharacters_6();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution1(str));
    }

    public String solution1(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public String solution2(String str){
        StringBuilder sb = new StringBuilder();
        String answer = sb.toString();
        char[] chars = str.toCharArray();
        for(char ch : chars) {
            if(!answer.contains(ch + "")) {
                sb.append(ch);
                answer = sb.toString();
            }
        }
        return answer;
    }
}
