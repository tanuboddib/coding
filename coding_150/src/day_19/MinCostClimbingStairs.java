package day_19;

public class MinCostClimbingStairs {

	public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        for(int i=2;i<len;i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[len-1], cost[len-2]);
    }
	
}
