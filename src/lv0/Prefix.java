package lv0;

public class Prefix {
    public static void main(String[] args) {
        int answer = solution("banana", "ban");
        System.out.println(answer);
    }

    public static int solution(String my_string, String is_prefix) {
        boolean isPrefix = my_string.startsWith(is_prefix);
        return isPrefix ? 1 : 0;
    }
}
