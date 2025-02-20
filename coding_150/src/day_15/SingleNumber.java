package day_15;

public class SingleNumber {
	
	 public int singleNumber(int[] nums) {
	        int n = 0;
	        for(int i: nums){
	            n ^= i;
	        }
	        return n;
	    }

}
