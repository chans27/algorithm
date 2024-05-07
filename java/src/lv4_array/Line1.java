package lv4_array;


/**
 * 겹치는 선분의 길이
 */
class Line1 {
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int result = solution(lines);
        System.out.println("result:" + result);
    }

    public static int solution(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;

        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;

        return answer;
    }
}
