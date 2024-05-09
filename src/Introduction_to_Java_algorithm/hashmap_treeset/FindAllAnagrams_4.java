package Introduction_to_Java_algorithm.hashmap_treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllAnagrams_4 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char x : t) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }
        for(int i = 0; i < t.length-1; i++) {
            sMap.put(s[i], sMap.getOrDefault(s[i], 0) + 1);
        }

        int lt = 0, result = 0;
        for(int rt = t.length-1; rt < s.length; rt++) {
            sMap.put(s[rt], sMap.getOrDefault(s[rt], 0) + 1);
            if(sMap.equals(tMap)) result++;
            sMap.put(s[lt], sMap.get(s[lt]) - 1);
            if(sMap.get(s[lt]) == 0) sMap.remove(s[lt]);
            lt++;
        }
        System.out.print(result);
    }
}
