package day_15;

public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
        int max = Math.max(x, y);
        int count = 0;
        int pos = 0;
        while(max > 0){
            if(((x>>pos)&1) != ((y>>pos)&1)){
                count++;
            }
            max >>= 1;
            pos++;
        }
        return count;
    }

}
