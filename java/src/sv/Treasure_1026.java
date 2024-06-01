package sv;

import java.util.*;

public class Treasure_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            listA.add(sc.nextInt());
        }
        for (int i = 0; i < num; i++) {
            listB.add(sc.nextInt());
        }

        Collections.sort(listA);
        List<Integer> copiedList = new ArrayList<>(listB);
        copiedList.sort(Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < listA.size(); i++) {
            answer += listA.get(i) * listB.get(listB.indexOf(copiedList.get(i)));
        }
        System.out.println(answer);
    }
}