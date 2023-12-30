package lv0;

import java.util.Arrays;

public class Indexing2 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        solution(num_list);
    }

    private static void solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] new_num_list = Arrays.copyOfRange(num_list, 5, num_list.length);
        for (int i : new_num_list) {
            System.out.println(i);
        }
    }
}
