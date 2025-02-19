package day_13;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int k = x;
        while(k > 0){
            rev = rev*10 + k%10;
            k /= 10;
        }
        return rev == x;
    }
	
}
