package lv6_advanced;

import java.util.Scanner;

/**
 * king : 1
 * Queen : 1
 * Rook : 2
 * Bishop : 2
 * knight : 2
 * Pawn : 8
 */

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pieces = sc.next();
        String[] arr_pieces = pieces.split("");

        int[] total_pieces = {1,1,2,2,2,8};
        int[] input_pieces = toIntArray(arr_pieces);
        int[] result = new int[ total_pieces.length];

        for (int i = 0; i < input_pieces.length; i++) {
            result[i] = total_pieces[i] - input_pieces[i];
        }

        for (int i : result) {
            System.out.print(i+" ");
        }

    }

    private static int[] toIntArray(String[] arr_pieces) {
        int[] int_pieces = new int[arr_pieces.length];

        for (int i = 0; i < arr_pieces.length; i++) {
            int_pieces[i] = Integer.parseInt(arr_pieces[i]);
        }
        return int_pieces;
    }
}
