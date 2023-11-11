package Introduction_to_Java_algorithm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord_4 {

    public static void main(String[] args){
        ReverseWord_4 T = new ReverseWord_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        for (String s : T.solution2(n, strArr)) {
            System.out.println(s);
        }
    }
    public ArrayList<String> solution1(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();

        for (String s : str) {
            String x = new StringBuilder(s).reverse().toString();
            answer.add(s);
        }
        return answer;
    }
    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length-1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            answer.add(String.valueOf(chars));
        }
        return answer;
    }
}
