import java.util.Scanner;

/*
 * Given an array that contains elements from 1 to N but one element 
 * is missing and one element occurs twice. Find both the elements.
 */

public class FindMissingAndRepeated {

    public static void printMissingAndRepeatedNumbers(int arr[]){
        int len = arr.length;
        int xor = 0;
        for(int n: arr){
            xor ^= n;
        }
        for(int i=0;i<=len;i++){
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
            if(((n>>pos)&1) == 1){
                set ^= n;
            }
            else{
                unset ^= n;
            }
        }
        for(int i=1;i<=len;i++){
            if(((i>>pos)&1) == 1){
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
            printMissingAndRepeatedNumbers(arr);
        }
    }
    
}
