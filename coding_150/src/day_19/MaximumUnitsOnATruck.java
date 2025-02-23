package day_19;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
	
	public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)->(b[1]-a[1]));
        int len = boxTypes.length;
        int sum = 0;
        int i = 0;

        while(i < len && truckSize > 0){
            if(boxTypes[i][0] <= truckSize){
                sum += (boxTypes[i][0]*boxTypes[i][1]);
                truckSize -= boxTypes[i][0];
            }
            else{
                sum += (truckSize*boxTypes[i][1]);
                truckSize = 0;
            }
            i++;
        }
        return sum;
    }

}
