import java.util.Scanner;

public class SubSetSum {
    public static boolean subsetSum(int[] arr, int idx, int sum){
        if(sum == 0){
            return true;
        }
        if(idx >= arr.length){
            return false;
        }
        return subsetSum(arr, idx+1, sum) || subsetSum(arr, idx+1, sum-arr[idx]);
    }

    public static void main(String ards[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int trgt = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        if(subsetSum(arr, 0, trgt)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
