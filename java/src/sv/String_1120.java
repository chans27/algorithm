package sv;

import java.util.Scanner;

public class String_1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        int minLength = A.length();
        int maxLength = B.length();
        int minDifference = maxLength;

        for (int i = 0; i <= maxLength - minLength; i++) {
            int difference = 0;
            for (int j = 0; j < minLength; j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    difference++;
                }
            }
            minDifference = Math.min(minDifference, difference);
        }
        System.out.println(minDifference);
    }
}
