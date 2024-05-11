package Introduction_to_Java_algorithm.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class IronBar_5 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '(') result += stack.size();
                else result++;
            }
        }
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '(') stack.push(chars[i]);
            else {
                if(chars[i-1] == '(') {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    result += 1;
                }
            }
        }
        System.out.print(result);
    }
}
