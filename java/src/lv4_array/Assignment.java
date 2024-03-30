package lv4_array;

import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[30];
        int[] reported = new int[30];

        for (int i = 0; i < 30; i++) {
            students[i] = i+1;
        }

        for (int j = 0; j < 28; j++) {
            int a = sc.nextInt();
            reported[a-1] = a;
        }

        for (int i = 0; i < reported.length; i++) {
            if(reported[i] == 0) {
                System.out.println(i+1);
            }
        }

    }
}
