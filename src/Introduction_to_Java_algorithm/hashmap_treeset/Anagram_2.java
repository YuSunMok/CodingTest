package Introduction_to_Java_algorithm.hashmap_treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram_2 {
    public static void main(String[] args) {
        solution();
        mySolution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        String result = "YES";
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                result = "NO";
                break;
            }
            map.put(x, map.get(x) - 1);
        }
        System.out.println(result);
    }

    private static void mySolution() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        String result = "YES";
        for(char x : s1.toCharArray()) {
            if(map1.get(x) != map2.get(x)) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
