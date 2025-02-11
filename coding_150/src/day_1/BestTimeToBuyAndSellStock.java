package day_1;

public class BestTimeToBuyAndSellStock {
	
	public int maxProfit(int[] prices) {
        int len = prices.length;
        int max = 0;
        int min = prices[0];
        for(int i=1;i<len;i++){
            if(prices[i] > min){
                max = Math.max(max, prices[i]-min);
            }
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
