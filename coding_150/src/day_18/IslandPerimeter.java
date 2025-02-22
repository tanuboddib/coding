package day_18;

public class IslandPerimeter {
	
	public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1){
                    int c = 4;
                    if(i > 0 && grid[i-1][j] == 1){
                        c--;
                    }
                    if(j > 0 && grid[i][j-1] == 1){
                        c--;
                    }
                    if(i+1 < rows && grid[i+1][j] == 1){
                        c--;
                    }
                    if(j+1 < cols && grid[i][j+1] == 1){
                        c--;
                    }
                    count += c;
                }
            }
        }
        return count;
    }

}
