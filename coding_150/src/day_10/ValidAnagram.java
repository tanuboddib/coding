package day_10;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
	
}
