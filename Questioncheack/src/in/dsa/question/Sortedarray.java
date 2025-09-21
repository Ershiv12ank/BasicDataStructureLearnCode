package in.dsa.question;

class Solution {
    public boolean check(int[] nums) {
     int n = nums.length;
     int ind = 0;
     int min = Integer.MIN_VALUE;
     for(int i = 0; i < n; i++) {
        if(nums[i] < min ) {
            min = nums[i];
            ind = i;
        }
     }

     int temp[]= new int[n];
     int count = ind-1;
     int m = 0;
         for(int i = ind; i < n-1; i++){
        if(i == n-1){
            ind = 0;
        }
        if(ind == count ){
            break;
        }
        temp[m] = nums[i];
        m++;
     }
         
         for(int i : temp) {
        	 System.out.println(i);
         }
     boolean issort = false;
     for(int i = 1; i < n; i++) {
        if(temp[i] >= temp[i-1]){
            issort = true;
        }
        else {
            issort = false;
            break;
        }
     }
     
     if(issort) {
        return true;
     }else {
        return false;
     }
     }
    }


public class Sortedarray {

	public static void main(String[] args) {
		int nums[] = {2,1,3,4};
		Solution s = new Solution();
		boolean res = s.check(nums);
		System.out.println(res);
	}

}
