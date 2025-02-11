package day_1;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int maxEle = 0;
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
            if(map.get(n) > max){
                max = map.get(n);
                maxEle = n;
            }
        }
        return maxEle;
    }
}
