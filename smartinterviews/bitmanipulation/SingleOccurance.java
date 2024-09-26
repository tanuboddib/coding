import java.util.Scanner;

public class SingleOccurance{

    /*
     * Given an array where all number occur thrice, but one element occurs
     * only once find the element.
     */

    public static int findSingleElement(int arr[]){
        int ele = 0;
        int len = arr.length;
        for(int i=0;i<32;i++){
            int set = 0;
            for(int j=0;j<len;j++){
                if(((arr[j]>>i)&1) == 1){
                    set++;
                }
            }
            if(set%3 != 0){
                ele |= (1<<i);
            }
        }
        return ele;
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
            System.out.println(findSingleElement(arr));
        }
    }

}