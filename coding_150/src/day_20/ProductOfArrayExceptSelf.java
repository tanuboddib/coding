package day_20;

public class ProductOfArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        long product = 1;
        for(int n: nums){
            if(n == 0){
                zero++;
            }
            else{
                product *= n;
            }
        }
        int len = nums.length;
        int arr[] = new int[len];
        
        if(zero > 1){
            return arr;
        }
        
        if(zero == 1){
            for(int i=0;i<len;i++){
                if(nums[i] == 0){
                    arr[i] = (int)product;
                }
                else{
                    arr[i] = 0;
                }
            }
            return arr;
        }

        for(int i=0;i<len;i++){
            arr[i] = (int)product/nums[i];
        }
        
        return arr;
    }

}
