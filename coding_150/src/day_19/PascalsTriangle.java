package day_19;

import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row;
        if(numRows >= 1){
            row = new ArrayList<Integer>();
            row.add(1);
            res.add(row);
        }
        if(numRows >= 2){
            row = new ArrayList<Integer>();
            row.add(1);
            row.add(1);
            res.add(row);
        }
        for(int i=3;i<=numRows;i++){
            List<Integer> prev = res.get(i-2);
            row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-2;j++){
                row.add(prev.get(j)+prev.get(j+1));
            }
            row.add(1);
            res.add(row);
        }

        return res;
        
    }

}
