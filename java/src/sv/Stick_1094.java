package sv;

import java.util.Scanner;

public class Stick_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int myStick = 64;
        int cnt = 0;

        while (X > 0) {
            if (myStick > X) {
                myStick /= 2;
            } else {
                X -= myStick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
