package Introduction_to_Java_algorithm.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesisCharacter_2 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '(');
            }
            else stack.push(x);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        System.out.print(sb.toString());
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char x : chars) {
            if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            else if(stack.empty()) sb.append(x);
        }
        System.out.print(sb.toString());
    }
}
