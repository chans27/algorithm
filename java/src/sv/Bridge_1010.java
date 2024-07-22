package sv;

import java.math.BigInteger;
import java.util.Scanner;

public class Bridge_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        for (int i = 0; i < caseNum; i++) {
            int caseA = sc.nextInt();
            int caseB = sc.nextInt();

            BigInteger factorialN = BigInteger.ONE;
            BigInteger factorialM = BigInteger.ONE;
            BigInteger factorialMN = BigInteger.ONE;

            for (int n = 2; n <= caseA; n++) {
                factorialN = factorialN.multiply(BigInteger.valueOf(n));
            }

            for (int m = 2; m <= caseB; m++) {
                factorialM = factorialM.multiply(BigInteger.valueOf(m));
            }

            for (int mn = 2; mn <= caseB-caseA ; mn++) {
                factorialMN = factorialMN.multiply(BigInteger.valueOf(mn));
            }

            System.out.println("result = " + factorialM.divide((factorialN.multiply(factorialMN))));
        }
    }
}
