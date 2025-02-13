package day_4;

public class SumOfAllOddLengthSubArrays {

	public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = arr[0];
        for(int i=1;i<len;i++){
            sum += arr[i];
            arr[i] += arr[i-1];
        }
        for(int i=2;i<len;i+=2){
            for(int j=i;j<len;j++){
                if((j-i)-1 >= 0){
                    sum += (arr[j] - arr[(j-i)-1]);
                }
                else{
                    sum += arr[j];
                }
            }
        }
        return sum;
    }
	
	/**
	 * public int sumOddLengthSubarrays(int[] arr) {
         int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2; 
            totalSum += arr[i] * oddSubarrays;
        }
        return totalSum;

       
    }
	 */
}
