package lv2;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDice_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] dice = {a, b, c};
        Arrays.sort(dice);
        int result;

        if(dice[0] == dice[1] && dice[1] == dice[2]) {
            result = dice[0]*1000 + 10000;
        } else if(dice[0] == dice[1] || dice[0] == dice[2] || dice[1] == dice[2]) {
            result = dice[1]*100 + 1000;
        } else {
            result = dice[2]*100;
        }

        System.out.println(result);
    }
}
