package lv6_advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String[] arr1 = str1.split("");
        Object[] arr2 = getReversedArr(str1); //reversed

        System.out.println(Arrays.equals(arr1, arr2) ? 1 : 0);
    }

    private static Object[] getReversedArr(String str1) {
        String[] arr1 = str1.split("");
        List<String> list1 = Arrays.asList(arr1);
        Collections.reverse(list1);
        return list1.toArray();
    }
}
