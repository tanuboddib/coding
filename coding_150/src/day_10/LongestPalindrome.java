package day_10;

public class LongestPalindrome {
	
	public int longestPalindrome(String s) {
        int sml[] = new int[26];
        int cap[] = new int[26];
        for(char ch: s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                cap[ch-'A']++;
            }
            else{
                sml[ch-'a']++;
            }
        }
        int len = 0;
        boolean odd = false;
        for(int i=0;i<26;i++){
            if(cap[i] > 0){
                if(cap[i]%2 == 0){
                    len += cap[i];
                }
                else{
                    len += (cap[i]-1);
                    odd = true;
                }
            }
            if(sml[i] > 0){
                //System.out.println(sml[i]);
                if(sml[i]%2 == 0){
                    len += sml[i];
                }
                else{
                    len += (sml[i]-1);
                    odd = true;
                }
            }
        }
        if(odd){
            len++;
        }
        return len;
    }

}
