package lv0;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = solution(str);
        System.out.println(result);
    }

    public static String solution(String str) {
       return str.toLowerCase().replace("a", "A");
    }
}
