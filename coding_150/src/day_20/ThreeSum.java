package day_20;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-2;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = len-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    List<Integer> row = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(row);
                    j++;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    k--;
                    while(k > j && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return res;
    }
	
}
