package day_3;

public class ThirdMaxNumber {
	
	public int thirdMax(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[0], nums[1]);
        }
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i] > max){
                max3 = max2;
                max2 = max;
                max = nums[i];
            }
            else if(nums[i] > max2 && nums[i] < max){
                max3 = max2;
                max2 = nums[i];
            }
            else if(nums[i] > max3 && nums[i] < max2 && nums[i] < max){
                max3 = nums[i];
            }
        }
        if(max != max2 && max2 != max3 && max != max3 && max3 != Long.MIN_VALUE){
            return (int)max3;
        }
        return (int)max;
    }

}
