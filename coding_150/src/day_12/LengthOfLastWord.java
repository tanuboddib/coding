package day_12;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
        int len = s.length();
        int i = len-1;
        int count = 0;
        while(i >= 0){
            if(s.charAt(i) == ' '){
               if(count == 0){
                    i--;
               }
               else{
                    break;
               }
            }
            else{
                count++;
                i--;
            }
        }
        return count;
        //String str[] = s.trim().split(" ");
        //return str[str.length-1].trim().length();
    }
	
}
