package day_2;

import java.util.List;
import java.util.ArrayList;

public class FindAllNumbersDisappearedInArray {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -1*nums[idx];
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }

}
