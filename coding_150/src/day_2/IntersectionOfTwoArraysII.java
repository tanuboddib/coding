package day_2;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class IntersectionOfTwoArraysII {
	
	public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int n: nums1){
            map1.put(n, map1.getOrDefault(n, 0)+1);
        }
        for(int n: nums2){
            map2.put(n, map2.getOrDefault(n, 0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int n: map1.keySet()){
            int min = Math.min(map1.getOrDefault(n, 0), map2.getOrDefault(n, 0));
            for(int i=0;i<min;i++){
                res.add(n);
            }
        }
        int arr[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }

        return arr;
    }

}
