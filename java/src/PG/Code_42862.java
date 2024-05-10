package PG;

import java.util.HashSet;
import java.util.Set;

public class Code_42862 {
    public static void main(String[] args) {
        int students = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int result = solution(students, lost, reserve);
        System.out.println("result: " + result);
    }
    public static int solution(int n, int[] lost, int[] reserve) {
    Set<Integer> lostSet = new HashSet<>();
    Set<Integer> reserveSet = new HashSet<>();

    for (int i : reserve) {
        reserveSet.add(i);
    }

    for (int i : lost) {
        if (reserveSet.contains(i)) {
        reserveSet.remove(i);
        } else {
        lostSet.add(i);
        }
    }

    for (Integer i : reserveSet) {
        if (lostSet.contains(i - 1)) {
        lostSet.remove(i - 1);
        } else if (lostSet.contains(i + 1)) {
        lostSet.remove(i + 1);
        }
    }

    return n - lostSet.size();
    }
}
