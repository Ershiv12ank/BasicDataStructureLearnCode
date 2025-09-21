package in.rec;

import java.util.Scanner;

public class SumofNfun {
    public static int sumofnum(int i) {
        if (i == 0) {   // base case
            return 0;
        }
        return i + sumofnum(i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = sumofnum(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);
    }
}
