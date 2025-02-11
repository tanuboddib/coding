package day_3;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        for(int j=0;j<len;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
	
}
