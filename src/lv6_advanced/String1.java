package lv6_advanced;

public class String1 {
    public static void main(String[] args) {
//        String str = "3141592";
//        String str2 = "271";
        String str = "500220839878";
        String str2 = "7";
        System.out.println(solution(str, str2));
    }

    public static int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
