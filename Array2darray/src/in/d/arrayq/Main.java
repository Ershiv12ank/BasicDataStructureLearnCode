package in.d.arrayq;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		TwoDArray arr = new TwoDArray();
		int temp[][] = arr.insertelement(row, col);
		
		arr.traverse2Array(temp);
		
		arr.searchelement(temp, 5);
		
		arr.traversecol(temp);
		
		int max = arr.maxof2D(temp);
		int min = arr.minof2D(temp);
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(arr.sumofele(temp));
		
		arr.maxsumrow(temp);
		
	}

}
