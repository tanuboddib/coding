package day_4;

public class SortArrayByParity {

	public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = 0;
        while(i < len){
            if(nums[i]%2 == 0){
                int k = nums[j];
                nums[j] = nums[i];
                nums[i] = k;
                j++;
            }
            i++;
        }
        return nums;
    }
	
}
