package Introduction_to_Java_algorithm.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses_1 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        char[] inputs = sc.next().toCharArray();
        String result = "NO";
        Stack<Character> stack = new Stack<>();
        for (char x : inputs) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()){
                    System.out.print(result);
                    return;
                }
                stack.pop();
            }
        }
        if (stack.empty()) result = "YES";
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        char[] inputs = sc.next().toCharArray();
        String result = "NO";
        Stack<Character> stack = new Stack<>();
        try {
            for(char input : inputs){
                if(input == '(') stack.push(input);
                else stack.pop();
            }
        } catch(Exception e) {
            System.out.print(result);
            return;
        }
        if(stack.empty()) result = "YES";
        System.out.print(result);
    }
}
