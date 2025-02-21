package day_17;

import java.util.HashSet;

public class ContainsDuplicatesII {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int min = Math.min(nums.length-1, k);
        for(int i=0;i<=min;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        for(int i=k+1;i<nums.length;i++){
            set.remove(nums[i-(k+1)]);
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

}
