import java.util.Scanner;

public class Power{
    public long pow(int a, int b){
        long ans = 1;
        while(b > 0){
            if((b&1) == 1){
                ans *= a;
            }
            a *= a;
            b >>= 1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Power obj = new Power();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(obj.pow(a, b));
        }
    }

}