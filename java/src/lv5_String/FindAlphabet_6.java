package lv5_String;

import java.util.Scanner;

public class FindAlphabet_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(97+i);
        }

        String str = sc.next();
        for (int j = 0; j < alphabet.length; j++) {
            System.out.println(str.indexOf(alphabet[j]));
        }
    }
}
