package day_2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximimPopulationYear {

	public int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, (a,b)->a[0]-b[0]);
        int max = 0;
        int maxYear = -1;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] arr: logs){
            while(!pq.isEmpty() && arr[0] >= pq.peek()){
                pq.poll();
                count--;
            }
            count++;
            if(count > max){
                max = count;
                maxYear = arr[0];
            }
            pq.offer(arr[1]);
        }
        return maxYear;
    }
}
