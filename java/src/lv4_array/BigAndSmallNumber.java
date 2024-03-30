package lv4_array;

import java.util.Arrays;
import java.util.Scanner;

public class BigAndSmallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[0] + " " + array[array.length-1]);
    }
}
