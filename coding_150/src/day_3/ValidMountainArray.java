package day_3;

public class ValidMountainArray {

	public boolean validMountainArray(int[] arr) {
        boolean incr = false;
        boolean decr = false;
        int len = arr.length;
        int count = 1;
        int i = 1;
        while(i < len && arr[i] > arr[i-1]){
            count++;
            i++;
            incr = true;
        }
        if(i == len){
            return false;
        }
        while(i < len && arr[i] < arr[i-1]){
            decr = true;
            count++;
            i++;
        }
        if(!incr || !decr || i < len || count < 3){
            return false;
        }
        return true;
    }
	
}
