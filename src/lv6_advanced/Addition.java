package lv6_advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        int[] arr2 = {5,0,2,7};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
