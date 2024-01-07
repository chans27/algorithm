package lv0;

import java.util.Arrays;

public class Indexing3 {
    public static void main(String[] args) {
        int[] arr = {12,4,15,46,38,1,14};
        solution(arr);
    }

    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        num_list = Arrays.copyOfRange(num_list, 0, 5);
        return num_list;
    }
}
