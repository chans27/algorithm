package lv0;

public class String2 {
    public static void main(String[] args) {
        String answer = solution("aaaaa", "bbbbb");
    }

    public static String solution(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i]);
            sb.append(arr2[i]);
        }

        return sb.toString();
    }
}
