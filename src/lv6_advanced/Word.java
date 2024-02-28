package lv6_advanced;

import java.util.*;

public class Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] str2 = str.toUpperCase().split("");
        int maxNum = 0;
        String result = "";

        Map<String, Integer> map = new HashMap<>();

        for (String s : str2) {
            Integer count = map.get(s);
            if(count == null) {
                map.put(s, 1);
            } else {
                map.put(s, count + 1);
            }
        }

        for (String s : map.keySet()) {
            if(map.get(s) > maxNum) {
                maxNum = map.get(s);
                result = s;
            } else if (map.get(s) == maxNum) {
                result = "?";
            }
        }
        System.out.println(result);
    }
}
