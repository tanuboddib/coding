package day_12;

public class AddStrings {
	
	 public String addStrings(String num1, String num2) {
	        int i = num1.length() - 1;
	        int j = num2.length() - 1;

	        StringBuilder sb = new StringBuilder();
	        int carry = 0;
	        while(i >= 0 || j >= 0){
	            char ch1 = i >= 0 ? num1.charAt(i) : '0';
	            char ch2 = j >= 0 ? num2.charAt(j) : '0';
	            int a = ch1 - 48;
	            int b = ch2 - 48;
	            int sum = a + b + carry;
	            carry = sum/10;
	            sum %= 10;
	            sb.append((char)(sum+48));
	            i--;
	            j--;
	        }
	        if(carry > 0){
	            sb.append((char)(carry+48));
	        }
	        return sb.reverse().toString();
	    }

}
