package prefixsuffix;

import java.util.Arrays;

public class preprod {

	public static void main(String[] args) {
		int arr[] = {1,4,3,5,6,3};
		int n = arr.length;
		
		int pre[] = new int [arr.length];
		
		pre[0] = arr[0];
		
		for(int i = 1; i< n;i++) {
			pre[i] = pre[i-1] * arr[i];
		}
		
		System.out.println(Arrays.toString(pre));

	}

}
