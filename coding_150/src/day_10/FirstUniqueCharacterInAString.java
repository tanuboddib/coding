package day_10;

public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(arr[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
	
}
