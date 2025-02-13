package day_4;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int len = nums.length;
        int count = 0;
        for(int i=0;i<len;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);

        return max;
    }
	
}
