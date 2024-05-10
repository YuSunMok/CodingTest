package Introduction_to_Java_algorithm.stack_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CraneDollClawMachine_3 {
    public static void main(String[] args) {
        solution();
        mySolution(); // 틀림
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int x : moves){
            for(int i = 0; i < n; i++) {
                int pos = x - 1;
                if(board[i][pos] != 0) {
                    int doll = board[i][pos];
                    board[i][pos] = 0;
                    if(!stack.empty() && stack.peek() == doll) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        System.out.print(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }

        ArrayList<Stack<Integer>> board = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Stack<Integer> temp = new Stack<>();
            for(int j = 0; j < n; j++) {
                if(arr[n-1-j][i] == 0) break;
                temp.push(arr[n-1-j][i]);
            }
            board.add(temp);
        }

        Stack<Integer> basket = new Stack<>();
        int result = 0;
        for(int i = 0; i < m; i++) {
            int num = moves[i]-1;
            Stack<Integer> stack = board.get(num);
            if(stack.empty()) continue;
            int popNum = stack.pop();
            if(!basket.isEmpty() && basket.peek() == popNum) {
                basket.pop();
                result += 2;
            } else {
                basket.push(popNum);
            }
        }
        System.out.print(result);
    }
}
