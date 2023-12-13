package lv4_array;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        double[] scores = new double[a];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
        }

        Arrays.sort(scores);

        double average = 0;

        for (int j = 0; j < scores.length; j++) {
            scores[j] = Math.ceil(scores[j]/scores[scores.length - 1] * 10000) / 100;
            average += scores[j];
        }

        System.out.println(average / scores.length);
    }
}
