package in.d.arrayq;

import java.util.Scanner;

public class TwoDArray {
	Scanner scan = new Scanner(System.in);

	public int[][] creare2DArray(int row, int col) {
		int arr[][] = new int[row][col];
		return arr;
	}

	public int[][] insertelement(int row, int col) {
		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		return arr;
	}

	public void traverse2Array(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void searchelement(int[][] arr, int x) {
		boolean ispre = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == x) {
					ispre = true;
					break;
				}
			}
		}
		if (ispre) {
			System.out.println("Value present in the array");
		} else {
			System.out.println("Value is not present in the array");
		}
	}

	public void traversecol(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public int maxof2D(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public int minof2D(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public int sumofele(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		return sum;
	}

	public void sumofelerow(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of element of array in " + i + "th row is " + sum);
		}

	}
	
	public int maxsumrow(int[][] arr) {
		int maxsumr = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = 0;
			for (int j = 0; j < arr[i].length; j++) {
				max += arr[i][j];
			}
			if(max > maxsumr) {
				maxsumr = max;
			}
		}
		return maxsumr;
	}

}
