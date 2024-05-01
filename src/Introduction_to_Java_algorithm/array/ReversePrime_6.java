package Introduction_to_Java_algorithm.array;

import java.util.Scanner;

public class ReversePrime_6 {
    public static void main(String[] args) {
        mySolution();
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;
            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp /= 10;
            }
            if (isPrime(res)) {
                System.out.print(res + " ");
            }
        }
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String input = sc.next();
            int num = Integer.parseInt(sb.append(input).reverse().toString());
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
            sb.delete(0, input.length());
        }
    }

    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
