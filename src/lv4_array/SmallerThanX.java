package lv4_array;

import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[sc.nextInt()];
        int x = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if(a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
