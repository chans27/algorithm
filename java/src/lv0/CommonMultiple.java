package lv0;

import java.util.Scanner;

public class CommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = (number%n==0 && number%m==0) ? 1 : 0;
        System.out.println(answer);
    }
}
