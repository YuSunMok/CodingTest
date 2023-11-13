package Introduction_to_Java_algorithm.String;

import java.util.Scanner;

public class palindrome_7 {

    public static void main(String[] args){
        palindrome_7 T = new palindrome_7();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution1(str));
    }

    public String solution1(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
        }
        return answer;
    }

    public String solution2(String str){
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public String solution3(String str){
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while(lt < rt) {
            if(!(chars[lt] == chars[rt])){
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }



}
