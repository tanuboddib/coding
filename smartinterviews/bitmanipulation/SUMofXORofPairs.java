import java.util.Scanner;

public class SUMofXORofPairs {

    public static int sumOfXORofPairs(int arr[]){
        int ans = 0;
        int len = arr.length;
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<len;j++){
                if(((arr[j]>>i)&1) == 1){
                    count++;
                }
            }
            ans += (2*count*(len-count))*(1<<i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }
            System.out.println(sumOfXORofPairs(arr));
        }
    }
}
