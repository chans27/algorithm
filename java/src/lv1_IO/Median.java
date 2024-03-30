package lv1_IO;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Median is " + median(a,b,c) + ".");
    }

    public static int median(int a, int b, int c) {
        if(a>b) {
            if (b>=c) {
                return b;
            } else if(a <= c) {
                return c;
            } else {
                return c;
            }
        } else if(a > c) {
            return a;
        } else if(b > c) {
            return c;
        } else {
            return b;
        }
    }
}
