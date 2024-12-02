import java.util.Scanner;

public class GenerateParanthesis {
    public static  void generate(char ch[], int idx, int n, int op, int cl){
        if(idx == n){
            System.out.println(String.valueOf(ch));
            return;
        }
        if(op < n/2){
            ch[idx] = '(';
            generate(ch, idx+1, n, op+1, cl);
        }
        if(op > cl){
            ch[idx] = ')';
            generate(ch, idx+1, n, op, cl+1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ch[] = new char[n];
        generate(ch, 0, n, 0, 0);
    }
}
