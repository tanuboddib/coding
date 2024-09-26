import java.util.Scanner;

public class XORfoSUMofPairs {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }
            int sum = 0;
            for(int j=0;j<n;j++){
                sum ^= (2*arr[j]);
            }
            System.out.println(sum);
        }
    }
}
