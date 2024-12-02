import java.util.Scanner;

public class TowerOfHenoi{
    static int totalMoves = 0;
    public static void toh(int n, char source, char target, char temp){
        if(n == 0){
            return;
        }
        toh(n-1, source, temp, target);
        System.out.println("Move " + n + " from " + source + " to " + target);
        totalMoves++;
        toh(n-1, temp, source, target);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        toh(n, 'A', 'C', 'B');
        System.out.println("Total Moves: " + totalMoves);
    }
}