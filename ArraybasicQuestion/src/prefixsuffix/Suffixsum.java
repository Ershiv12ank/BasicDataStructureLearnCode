package prefixsuffix;

import java.util.Arrays;

public class Suffixsum {
	public static void main(String[] args) {
		int arr[] = {1,4,3,5,6,3};
		int n = arr.length;
		
		int pre[] = new int [arr.length];
		
		pre[n-1] = arr[n-1];
		
		for(int i = n-2; i>=0;i--) {
			pre[i] = pre[i+1] + arr[i];
		}
		
		System.out.println(Arrays.toString(pre));
	}

}
