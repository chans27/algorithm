package lv0;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = String.valueOf(sc.nextInt());
        String str2 = String.valueOf(sc.nextInt());

        int int1 = Integer.parseInt(str1+str2);
        int int2 = Integer.parseInt(str2+str1);


        System.out.println(Math.max(int1, int2));
    }
}
