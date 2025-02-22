package day_18;

import java.util.HashMap;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
        int len = pattern.length();
        String str[] = s.split(" ");
        if(len != str.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        int i = 0;
        int j = 0;
        while(i < len){
            char ch = pattern.charAt(i);
            String st = str[j];
            if(map1.containsKey(ch)){
                if(!st.equals(map1.get(ch))){
                    return false;
                }
            }
            else if(map2.containsKey(st)){
                if(ch != map2.get(st)){
                    return false;
                }
            }
            else{
                map1.put(ch, st);
                map2.put(st, ch);
            }
            i++;
            j++;
        }
        return true;
    }

}
