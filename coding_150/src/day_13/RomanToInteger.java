package day_13;

import java.util.HashMap;

public class RomanToInteger {

	public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int prev = 0;
        int i = s.length()-1;
        int sum = 0;
        while(i >= 0){
            char ch = s.charAt(i);
            int val = map.get(ch);
            if(val < prev){
                sum -= val;
            }
            else{
                sum += val;
            }
            prev = val;
            i--;
        }

        return sum;
    }
	
}
