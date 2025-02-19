package day_13;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] += 1;
        int carry = digits[i]/10;
        digits[i] %= 10;
        i--;
        while(carry > 0 && i >= 0){
            digits[i] += carry;
            carry = digits[i]/10;
            digits[i] %= 10;
            i--;
        }
        
        if(carry > 0){
            int arr[] = new int[digits.length+1];
            arr[0] = carry;
            for(int j=1;j<=digits.length;j++){
                arr[j] = digits[j-1];
            }
            return arr;
        }
        return digits;
    }

}
