package day_11;

import java.util.HashMap;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            else if(map.containsValue(ch2)){
                    return false;
            }
            else{
                map.put(ch1, ch2);
            }
        }
        return true;
    }

}
