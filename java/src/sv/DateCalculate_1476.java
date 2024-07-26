package sv;

import java.util.Scanner;

public class DateCalculate_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt(); // Earth 1 <= E <= 15
        int S = sc.nextInt(); // Sun   1 <= S <= 28
        int M = sc.nextInt(); // Moon  1 <= M <= 19

        int result = 1;

        int[] arr = {1,1,1};

        while (arr[0] != E || arr[1] != S || arr[2] != M) {

            arr[0]++;
            if (arr[0] == 16) {
                arr[0] = 1;
            }

            arr[1]++;
            if (arr[1] == 29) {
                arr[1] = 1;
            }

            arr[2]++;
            if (arr[2] == 20) {
                arr[2] = 1;
            }
            result++;
        }

        System.out.println(result);
    }
}