package day_3;

import java.util.Arrays;

public class FindWinnerOfTicTacToeGame {

	public char isValid(char[][] arr){
        for(int i=0;i<3;i++){
            if(arr[i][0] != 'Z' && arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]){
                System.out.println(arr[1][1]);
                return arr[i][0];
            }
            if(arr[0][i] != 'Z' && arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]){
                //System.out.println(arr[1][1]);
                return arr[0][i];
            }
        }
        if(arr[0][0] != 'Z' && arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]){
            //System.out.println(arr[0][0]);
            return arr[0][0];
        }
        if(arr[0][2] != 'Z' && arr[0][2] == arr[1][1] && arr[2][0] == arr[1][1]){
            //System.out.println(arr[1][1]);
            return arr[1][1];
        }
        return 'Z';
    }
    public String tictactoe(int[][] moves) {
        int len = moves.length;
        if(len <= 2){
            return "Pending";
        }
        char ch = 'A';
        char arr[][] = new char[3][3];
        for(int i=0;i<3;i++){
            Arrays.fill(arr[i], 'Z');
        }
        for(int i=0;i<len;i++){
            arr[moves[i][0]][moves[i][1]] = ch;
            if(i >= 2){
                char res = isValid(arr);
                //System.out.println(res + " " + ch);
                if(res == 'A' || res == 'B'){
                    return String.valueOf(res);
                }
            }
            if(ch == 'A'){
                ch = 'B';
            }
            else{
                ch = 'A';
            }
        }
        if(len == 9){
            return "Draw";
        }
        return "Pending";
    }
    
}
