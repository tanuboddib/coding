package day_14;

 import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
	
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int len = nums.length;
        max = Math.max(nums[len-1]*nums[len-2]*nums[len-3], nums[len-1]*nums[0]*nums[1]);
        return max;
    }

}
