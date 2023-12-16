package lv5_String;

import java.util.Arrays;
import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine().substring(0, max);
        String[] arr = str.split("");

        int result = 0;
        for (String s : arr) {
            result += Integer.valueOf(s);
        }

        System.out.println(result);

    }
}
