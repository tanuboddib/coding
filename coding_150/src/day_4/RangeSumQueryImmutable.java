package day_4;

public class RangeSumQueryImmutable {
	int nums[];
    long sum[];
    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
        sum = new long[nums.length];
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i] = sum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return (int)(sum[right] - sum[left] + nums[left]);
    }
}
