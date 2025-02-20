package day_14;

public class CountOddNumbersInAnIntervalRange {

	public int countOdds(int low, int high) {
        if(low%2 == 0 && high%2 == 0){
            return (high-low)/2;
        }
        
        return ((high-low)/2) + 1;
    }
}
