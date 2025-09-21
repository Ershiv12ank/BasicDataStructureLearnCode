package in.rec;

import java.util.Scanner;

public class NTo1 {
	public static void NTo1print(int n) {
		if(n == 0) {
			return ;
		}
		
		System.out.println(n);
		NTo1print(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		NTo1print(n);

	}

}
