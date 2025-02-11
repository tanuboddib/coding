package day_1;

public class MoveZeros {
	
	public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = 0;
        while(i < len){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while(j < len){
            nums[j] = 0;
            j++;
        }
    }
}
