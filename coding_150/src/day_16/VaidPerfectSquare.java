package day_16;

public class VaidPerfectSquare {

	public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long low = 1;
        long high = num;
        while(low <= high){
            long mid = (low+high)/2;
            if((long)mid*mid == num){
                return true;
            }
            if((long)mid*mid > num){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
	
}
