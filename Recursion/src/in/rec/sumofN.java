package in.rec;

import java.util.Scanner;

public class sumofN {
	public static void sum(int i, int sum) {
		if(i < 1) {
			System.out.println(sum);
			return;
		}
		
		sum(i - 1, sum + i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		sum(n,0);

	}

}
