package day_1;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        int len = nums.length;
        for(int i=0;i<len;i++){
            int k = target - nums[i];
            if(map.containsKey(k)){
                res[0] = map.get(k);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
