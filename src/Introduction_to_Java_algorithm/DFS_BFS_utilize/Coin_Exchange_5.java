package Introduction_to_Java_algorithm.DFS_BFS_utilize;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coin_Exchange_5 {
    static int n, m, answer=Integer.MAX_VALUE;
    public static void DFS(int L, int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m){
            answer=Math.min(answer, L);
        }
        else{
            for(int i=0; i<n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m=kb.nextInt();
        DFS(0, 0, arr);
        System.out.println(answer);
    }

}
