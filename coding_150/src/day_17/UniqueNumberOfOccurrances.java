package day_17;

import java.util.HashSet;
import java.util.HashMap;

public class UniqueNumberOfOccurrances {
	
	public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer key: map.keySet()){
            if(set.contains(map.get(key))){
                return false;
            }
            set.add(map.get(key));
        }
        return true;
    }

}
