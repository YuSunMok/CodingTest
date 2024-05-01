package Introduction_to_Java_algorithm.string;

import java.util.Scanner;

public class FlipSpecificCharacters_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left < right) {
            while (left < right && !Character.isAlphabetic(chars[left])) {
                left++;
            }
            while (left < right && !Character.isAlphabetic(chars[right])) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(chars));
    }
}
