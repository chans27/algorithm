package lv5_String;

import java.util.Scanner;

public class Constant_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int reversedNumber1 = reverseNumber(a);
        int reversedNumber2 = reverseNumber(b);

        int max = Math.max(reversedNumber1, reversedNumber2);
        System.out.println(max);

    }
    public static int reverseNumber(int number) {
        int reversedNumber = Integer.parseInt(new StringBuffer(String.valueOf(number)).reverse().toString());
        return reversedNumber;
    }
}
