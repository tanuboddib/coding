package day_13;

import java.util.HashSet;

public class HappyNumber {
	
	public int square(int n){
        int sum = 0;
        while(n > 0){
            sum += (n%10)*(n%10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = square(n);
        }
        return n == 1;
    }

}
