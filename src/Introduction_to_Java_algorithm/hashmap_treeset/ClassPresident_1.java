package Introduction_to_Java_algorithm.hashmap_treeset;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident_1 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char key : chars) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        System.out.println(result);
    }

    private static void mySolution() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);
        map.put("E", 0);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력할 문자 개수를 읽는다.
        sc.nextLine();         // 개행 문자를 소비한다.
        String line = sc.nextLine();  // 문자열을 읽는다.
        char[] arr = line.toCharArray();
        for(char ch : arr) {
            String key = String.valueOf(ch);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
        }

        Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        System.out.println(maxEntry.getKey());
    }
}
