package lv0;

import java.util.Arrays;

public class Addition2 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
    }

    public static int solution(String num_str) {
        int answer = 0;
        String[] split = num_str.split("");
        for (int i = 0; i < split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        return answer;
    }
}
