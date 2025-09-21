package prefixsuffix;
import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

       
        for (int i = 0; i < n; i++) {
            prefix[i] = 1;
            suffix[i] = 1;
            ans[i] = 1;
        }

        // prefix product
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
       System.out.println(Arrays.toString(prefix));
        // suffix product
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        System.out.println(Arrays.toString(suffix));

        // final answer
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}

public class test {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Solution s = new Solution();
		s.productExceptSelf(arr);
	}

}
