package Introduction_to_Java_algorithm.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_4 {
    public static void main(String[] args) {

        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x-'0');
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt + rt);
                else if(x == '-') stack.push(lt - rt);
                else if(x == '*') stack.push(lt * rt);
                else if(x == '/') stack.push(lt / rt);
            }
        }
        System.out.print(stack.get(0));
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] expressions = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(char x : expressions) {
            if(x == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if(x == '-') {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 - num2);
            } else if(x == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if(x == '/') {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 / num2);
            } else {
                stack.push(x - '0');
            }
        }
        System.out.print(stack.peek());
    }
}
