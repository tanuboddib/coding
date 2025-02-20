package day_15;

public class ReverseBits {
	
	public int reverseBits(int n) {
        int num = 0;
        int pos = 31;
        while(n != 0){
            if((n&1) == 1){
                num |= (1 << pos);
            }
            pos--;
            n >>>= 1;
        }
        return num;
    }

}
