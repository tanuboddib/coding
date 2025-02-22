package day_18;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class FindIfPathExistsInGraph {
	
	public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            arr.get(x).add(y);
            arr.get(y).add(x);
        }
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        Queue<Integer> que = new LinkedList<>();
        que.add(source);
        visited[source] = true;
        while(!que.isEmpty()){
            if(que.peek() == destination){
                return true;
            }
            for(int k: arr.get(que.peek())){
                if(!visited[k]){
                    que.add(k);
                    visited[k] = true;
                }
            }
            que.remove();
        }
        return visited[destination];
    }

}
