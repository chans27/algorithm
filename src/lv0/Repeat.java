package lv0;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = solution(sc.next(), 3);
        System.out.println(str);
    }

    static String solution(String my_string, int k) {
        String answer = my_string.repeat(k);
        return answer;
    }
}
