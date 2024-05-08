package Introduction_to_Java_algorithm.hashmap_treeset;

import java.util.*;

public class TypeOfSales_3 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rt = 0, lt = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        while(rt < n) {
            while(cnt < k) {
                cnt++;
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
                rt++;
            }
            sb.append(map.size()).append(" ");
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            cnt--;
            lt++;
        }
        System.out.print(sb.toString());
    }
}
