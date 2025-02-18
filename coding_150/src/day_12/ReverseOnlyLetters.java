package day_12;

public class ReverseOnlyLetters {
	
	public String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if(!Character.isAlphabetic(ch[i])){
                i++;
            }
            else{
                j--;
            }
        }
        return String.valueOf(ch);
    }

}
