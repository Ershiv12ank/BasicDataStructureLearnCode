package in.rotate.array;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		int n = arr.length;
		int val =-1;;
		
		for(int i = 0; i < k ; i++) {
			val = arr[0];
			for(int j = 0; j < n-1;j++) {
				
				arr[j] = arr[j+1];
			}
			arr[n-1] = val;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
