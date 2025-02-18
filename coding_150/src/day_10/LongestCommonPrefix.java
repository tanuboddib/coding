package day_10;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(String s: strs){
            min = Math.min(s.length(), min);
        }
        
        int len = strs.length;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<min;i++){
            int count = 0;
            char ch = strs[0].charAt(i);
            for(int j=0;j<len;j++){
                if(strs[j].charAt(i) == ch){
                    count++;
                }
            }
            if(count == len){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

}
