package lv3;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt()/4;

        for (int i = 1; i <= a; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}