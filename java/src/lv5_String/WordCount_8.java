package lv5_String;

import java.util.*;

public class WordCount_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.trim().split(" ");

        int result = str.equals(" ") ? 0 : str2.length;

        System.out.println(result);
    }
}
