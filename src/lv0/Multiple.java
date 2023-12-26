package lv0;

import java.util.Locale;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution(num, n));
    }
    public static int solution(int num, int n) {
        return num%n == 0 ? 1 : 0;
    }
}
