import java.util.Scanner;

public class FibonacciSeries{
    public static int getFibNum(int n){
        if(n <= 1){
            return n;
        }
        return getFibNum(n-1) + getFibNum(n-2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getFibNum(n));
    }
}