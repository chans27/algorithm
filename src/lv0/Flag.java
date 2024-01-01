package lv0;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a,b,true));
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }
}
