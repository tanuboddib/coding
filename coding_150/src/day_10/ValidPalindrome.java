package day_10;

public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if((ch >= '0' && ch <= '9') || (ch >='a' && ch <= 'z')){
                sb.append(ch);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch += 32;
                sb.append(ch);
            }
        }
        String str = sb.toString();
        //System.out.println(str);
        int len = str.length();
        int i = 0;
        int j = len-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
