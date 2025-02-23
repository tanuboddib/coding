package day_19;

public class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if( n == 0){
            return true;
        }
        if(flowerbed.length == 1){
            if(n == 1 && flowerbed[0] == 0){
                return true;
            }
            return false;
        }
        int len = flowerbed.length;
        for(int i=0;i<len;i++){
            if(flowerbed[i] == 0){
                if(i == 0){
                    if(flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else if(i == len-1){
                    if(flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else{
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n <= 0;
    }
}
