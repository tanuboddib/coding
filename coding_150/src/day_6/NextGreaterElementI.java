package day_6;

import java.util.Stack;
import java.util.HashMap;

public class NextGreaterElementI {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums2.length;
        for(int i=len-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        int res[] = new int[nums1.length];
        int i = 0;
        for(int n: nums1){
            res[i] = map.get(n);
            i++;
        }
        return res;
    }

}
