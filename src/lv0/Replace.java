package lv0;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    private static void solution(String str) {
        String replacedStr = str.replace("m", "rn");
        System.out.println(replacedStr);
    }
}
