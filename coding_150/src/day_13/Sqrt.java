package day_13;

public class Sqrt {
	
	 public int mySqrt(int x) {
	        if(x == 0 || x == 1){
	            return x;
	        }
	        int min = 1;
	        int max = x/2;
	        int ans = 1;
	        while(min <= max){
	            int mid = (min+max)/2;
	            if((long)mid*mid <= x){
	                ans = mid;
	                min = mid+1;
	            }
	            else {
	                max = mid-1;
	            }
	        }
	        return ans;
	    }

}
