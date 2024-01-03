package lv0;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double average = solution(arr);
        System.out.println(average);
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        return answer/ numbers.length;
    }
}
