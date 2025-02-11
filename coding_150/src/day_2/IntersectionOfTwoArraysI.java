package day_2;

import java.util.HashSet;

public class IntersectionOfTwoArraysI {

	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums1){
            set.add(n);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int n: nums2){
            if(set.contains(n) && !res.contains(n)){
                res.add(n);
            }
        }
        int arr[] = new int[res.size()];
        int i = 0;
        for(int n: res){
            arr[i++] = n;
        }
        return arr;
    }
	
}
