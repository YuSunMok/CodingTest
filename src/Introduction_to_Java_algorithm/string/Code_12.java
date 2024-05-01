package Introduction_to_Java_algorithm.string;

import java.util.Scanner;

public class Code_12 {
    public static void main(String[] args) {
        mySolution();
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
            String temp = s.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(temp, 2);
            sb.append((char) num);
            s = s.substring(7);
        }

        System.out.println(sb.toString());
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        String s = sc.next();
        s = s.replace("#", "1");
        s = s.replace("*", "0");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            String str = new StringBuilder(s.substring(0, 7)).reverse().toString();
            int result = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '1') {
                    result += Math.pow(2, j);
                }
            }
            sb.append((char)result);
            s = s.substring(7);
        }
        System.out.println(sb.toString());
    }
}
