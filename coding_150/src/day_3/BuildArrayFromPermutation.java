package day_3;

public class BuildArrayFromPermutation {

	public int[] buildArray(int[] nums) {
        int len = nums.length;
        int res[] = new int[len];
        for(int i=0;i<len;i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
	
	// Use recursion to do it in O(1)  space complexity- still the stack space is O(n).
}
