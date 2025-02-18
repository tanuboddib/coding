package day_12;

import java.util.HashSet;
import java.util.Arrays;

public class ReverseVowelsOfAString {
	
	HashSet<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
    public boolean isVowel(char ch){
        return vowels.contains(ch);
    }
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i < j){
            if(isVowel(ch[i]) && isVowel(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if(!isVowel(ch[i])){
                i++;
            }
            else{
                j--;
            }
        }
        return String.valueOf(ch);
    }

}
