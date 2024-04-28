package s4;

import java.util.Scanner;

public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= value; i++) {
            if(i < 10) {
                result += 1;
            } else {
                boolean check = checkArithmeticSequence(i);
                if(check) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
    static boolean checkArithmeticSequence(int i) {
        String[] arr = String.valueOf(i).split("");
        int offset = Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]);
        for (int j = 1; j < arr.length; j++) { //2
            if((Integer.parseInt(arr[j]) - Integer.parseInt(arr[j-1])) != offset) {
                return false;
            }
        }
        return true;
    }
}
