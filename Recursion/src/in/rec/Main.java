package in.rec;

import java.util.Scanner;

public class Main {
    static public void printNum(int i, int n) {
        if (i > n) {   // base case
            return;
        }
        System.out.println(i);
        printNum(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printNum(1, n);
    }
}
