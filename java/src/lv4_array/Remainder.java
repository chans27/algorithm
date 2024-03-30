package lv4_array;

import java.util.Arrays;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt() % 42;
        }

        array = Arrays.stream(array).distinct().toArray();

        System.out.println(array.length);
    }
}
