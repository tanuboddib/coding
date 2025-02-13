package day_4;

import java.util.List;
import java.util.ArrayList;

public class FindCommonCharacters {

	public List<String> commonChars(String[] words) {
        int arr[][] = new int[26][2];
        for(String s: words){
            int a[] = new int[26];
            for(char ch: s.toCharArray()){
                a[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                if(a[i] > 0){
                    if(arr[i][0] == 0){
                        arr[i][0] = a[i];
                    }
                    else{
                        arr[i][0] = Math.min(arr[i][0], a[i]);
                    }
                    arr[i][1]++;
                }
            }
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(arr[i][1] == words.length){
                for(int j=0;j<arr[i][0];j++){
                    res.add(String.valueOf((char)(i+97)));
                }
            }
        }
        return res;
    }
	
}
