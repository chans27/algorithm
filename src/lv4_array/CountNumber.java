package lv4_array;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        int[] arr = new int[totalNumber];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int findNumber = sc.nextInt();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(findNumber == arr[i]) result++;
        }

        System.out.println(result);
    }
}
