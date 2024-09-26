import java.util.Scanner;

/*
 * Given an array of length N containing numbers from 1 to N-2 but two numbers
 * occurs twice and other numbers occurs once find the repeated numbers.
 */

public class FindRepeatedNumbers {

    public static void printRepeatedNumbers(int[] arr){
        int len = arr.length;
        int xor = 0;
        for(int n: arr){
            xor ^= n;
        }
        for(int i=1;i<=len-2;i++){
            xor ^= i;
        }
        int pos = 0;
        while(xor > 0){
            if((xor&1) == 1){
                break;
            }
            pos++;
            xor >>= 1;
        }
        int set = 0;
        int unset = 0;
        for(int n: arr){
            if(((n>>pos)&1) ==1){
                set ^= n;
            }
            else{
                unset ^= n;
            }
        }
        for(int i=1;i<=len-2;i++){
            if(((i>>pos)&1)==1){
                set ^= i;
            }
            else{
                unset ^= i;
            }
        }
        System.out.println(set + " " + unset);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }
            printRepeatedNumbers(arr);
        }
    }    
}
