package day_2;

public class RemoveDuplicatesFromSortedArrayII {
	
	public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 2){
            return len;
        }
        int i = 2;
        int j = i;
        while(j < len){
            if(nums[i-1] == nums[j] && nums[i-2] == nums[j]){
                j++;
            }
            else{
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        return i;
    }

}
