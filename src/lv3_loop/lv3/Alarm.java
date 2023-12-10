package lv3_loop.lv3;

import java.util.Scanner;
public class Alarm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (h==0 & m >= 45) {
            m = m-45;
        }
        else if( h==0 & m < 45) {
            h = h+23;
            m = m + 15;
        }
        else if(h != 0 & m >= 45) {
            m = m-45;
        }
        else {
            h = h-1;
            m = m+15;
        }
        System.out.println(h + " " + m);
    }
}
