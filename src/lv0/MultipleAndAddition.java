package lv0;

public class MultipleAndAddition {
    public static void main(String[] args) {
        int[] num_list = {3,4,5,2,1};
        int result = solution(num_list);
        System.out.println(result);
    }

    static int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int addition = 0;
        for (int num : num_list) {
            multiple *= num;
            addition += num;
        }
        answer = multiple < addition * addition ? 1 : 0;
        return answer;
    }
}
