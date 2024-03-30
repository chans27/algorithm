package lv0;

import java.util.Arrays;

public class Indexing1 {
    public static void main(String[] args) {
        int[] arr1 = {5,2,1,7,5};
        System.out.println(Arrays.toString(solution(arr1, 3)));
    }
    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }

}

