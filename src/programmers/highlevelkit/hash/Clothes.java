package programmers.highlevelkit.hash;

import java.util.*;
public class Clothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes) {
            String type  = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        return answer - 1;
    }
}
