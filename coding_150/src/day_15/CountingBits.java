package day_15;

public class CountingBits {
	
	public int count(int k){
        int c = 0;
        while(k > 0){
            if((k&1) == 1){
                c++;
            }
            k >>= 1;
        }
        return c;
    }
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = count(i);
        }
        return res;
    }
    
    /*
     *  public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        int offset = 1;
        for(int i=1;i<=n;i++){
            if(offset*2==i){
                offset = i;
            }
            result[i] = 1 + result[i-offset];
        }

        return result;
    }
     */

}
