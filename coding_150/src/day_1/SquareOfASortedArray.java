package day_1;

import java.util.Arrays;

public class SquareOfASortedArray {
	
	public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
	
	// Use two pointers to sort and store it a new array from back.
}
