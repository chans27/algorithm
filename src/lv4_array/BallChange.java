package lv4_array;

import java.util.Scanner;

public class BallChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] basket = new int[m];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < n; j++) {
            int num;
            int o = sc.nextInt();
            int p = sc.nextInt();

            num = basket[o-1];
            basket[o-1] = basket[p-1];
            basket[p-1] = num;
        }

        for (int b : basket) {
            System.out.print(b + " ");
        }
    }
}
