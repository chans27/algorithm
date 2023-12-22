package lv2;

import java.util.Scanner;

public class OvenTimer_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookTime = sc.nextInt();

        hour = ((minute + cookTime) / 60 + hour)%24;
        minute = (minute + cookTime) % 60;

        System.out.println(hour + " " + minute);
    }
}
