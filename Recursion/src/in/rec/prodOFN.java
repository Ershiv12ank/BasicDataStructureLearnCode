package in.rec;

import java.util.Scanner;

public class prodOFN {
	public  static void ProdN(int i, int prod) {
		if(i == 0) {
			System.out.println(prod);
			return ;
		}
		ProdN(i - 1, prod * i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ProdN(n,1);

	}

}
