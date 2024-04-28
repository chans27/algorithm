package lv6_advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupWordChecker {

    public static void main(String[] args) {
        /**
         *         String[] words = {"happy", "new", "year"};
         *         String[] words = {"aba", "abab", "abcabc" , "a"};
         *         String[] words = {"ab", "aa", "aca" , "ba", "bb"};
         *         String[] words = {"yzyzy", "zyzyz"};
         */
        Scanner sc = new Scanner(System.in);
        String[] words = new String[sc.nextInt()];
        for (int w = 0; w < words.length; w++) {
            words[w] = sc.next();
        }
        int result = 0;

        for (int i = 0; i < words.length; i++) {
            String[] word = words[i].split("");
            Map<String, Integer> map = new HashMap<>();
            int[] check = new int[word.length];
            int offset = 0;
            for (int j = 0; j < word.length; j++) {
                if(map.get(word[j]) == null)  {
                    offset += 1;
                    map.put(word[j], offset);
                }
            }
            for (int k = 0; k < word.length; k++) {
                check[k] = map.get(word[k]);
            }
            for (int r = 0; r < word.length; r++) {
                if(r != 0 && check[r] < check[r-1]) {
                    break;
                }
                if(r == word.length -1) {
                    result++;
                }
            }

        }
        System.out.println(result);
    }
}
