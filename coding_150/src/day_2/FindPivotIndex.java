package day_2;

public class FindPivotIndex {
	
	public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum += n;
        }
        int left = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(((sum-left)-nums[i]) == left){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

}
