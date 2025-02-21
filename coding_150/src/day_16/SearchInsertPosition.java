package day_16;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
        if(nums[0] >= target){
            return 0;
        }
        int lo = 0;
        int hi = nums.length-1;
        int ans = nums.length;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] < target){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans+1;
    }
	
}
