package day_18;

public class FloodFill {
	
	public void fill(int[][] arr, int i, int j, int expCol, int dstCol){
        if(arr[i][j] == expCol){
            arr[i][j] = dstCol;
            if(i >= 1){
                fill(arr, i-1, j, expCol, dstCol);
            }
            if(j >= 1){
                fill(arr, i, j-1, expCol, dstCol);
            }
            if(i+1 < arr.length){
                fill(arr, i+1, j, expCol, dstCol);
            }
            if(j+1 < arr[0].length){
                fill(arr, i, j+1, expCol, dstCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int col = image[sr][sc];
        if(col != color){
            fill(image, sr,sc, col, color);
        }
        return image;
    }

}
