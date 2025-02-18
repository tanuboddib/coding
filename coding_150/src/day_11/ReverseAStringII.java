package day_11;

public class ReverseAStringII {
	
	public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int len = s.length();
        int i = 0;
        while(i < len){
            int p = i;
            int q = Math.min((i+k)-1, len-1);
            while(p < q){
                char temp = ch[p];
                ch[p] = ch[q];
                ch[q] = temp;
                p++;
                q--;
            }
            i += (2*k);
        }
        return String.valueOf(ch);
    }

}
