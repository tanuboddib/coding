package day_15;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
        int num = 0;
        for(int n: nums){
            num ^= n;
        }
        for(int i=0;i<=nums.length;i++){
            num ^= i;
        }
        return num;
    }

}
