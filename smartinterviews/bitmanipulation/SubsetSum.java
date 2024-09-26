import java.util.Scanner;

/*
 * Subset sum using bit manipulation
 */

public class SubsetSum {
    public static boolean subsetSum(int arr[], int k){
        int len = arr.length;
        for(int i=0;i<(1<<len);i++){
            int p = i;
            int sum = 0;
            int j = 0;
            while(p > 0){
                if((p&1) == 1){
                    sum += arr[j];
                }
                j++;
                p >>= 1;
            }
            if(sum == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }
            if(subsetSum(arr, k)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }    
}
