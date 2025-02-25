package day_20;

public class NonDecreasingArray {
	
	public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return true;
        }
        int count = 0;
        
        for(int i=1;i<len;i++){
            if(nums[i] < nums[i-1] ){
                count++;
                if(count > 1){
                    return false;
                }
                if(i-2 >= 0 && nums[i] < nums[i-2]){
                    nums[i] = nums[i-1];
                }
            }
        }
        
        return true;
    }

}
