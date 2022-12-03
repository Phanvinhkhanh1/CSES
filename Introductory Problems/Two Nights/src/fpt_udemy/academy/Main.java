package fpt_udemy.academy;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(0);
            } else if (i == 2) {
                System.out.println(6);
            } else {
                BigInteger ans = BigInteger.valueOf(i * i).multiply(BigInteger.valueOf(i * i).subtract(BigInteger.valueOf(1l))).divide(BigInteger.valueOf(2l)).subtract(BigInteger.valueOf(4l).multiply(BigInteger.valueOf(i - 1)).multiply(BigInteger.valueOf(i - 2)));
                System.out.println(ans);
            }
        }
    }
}
