package lv4_array;

import java.util.Scanner;

public class BallChange2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] basket = new int[a];

        for (int i = 0; i < b; i++) {
            int from = sc.nextInt();
            int toNext = sc.nextInt();
            int ballNumber = sc.nextInt();

            while(from <= toNext) {
                basket[from - 1] = ballNumber;
                from++;
            }
        }

        for (int num : basket) {
            System.out.print(num + " ");
        }
    }
}
