package day_20;

import java.util.Arrays;

public class ThreeSumClosest {
	
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res = 0;
        int len = nums.length;
        for(int i=0;i<len-2;i++){
            int sum = target - nums[i];
            int j = i+1;
            int k = len-1;
            while(j < k){
                int s = nums[j] + nums[k];
                if(s == sum){
                    return target;
                }
                else{
                    int d = Math.abs(sum-s);
                    if(d < min){
                        min = d;
                        res = s+nums[i];
                    }
                    if(s > sum){
                        k--;
                    }
                    else{
                        j++;
                    }
                }
            }
        }
        return res;
    }

}
