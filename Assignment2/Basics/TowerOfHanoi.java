import java.util.Scanner;

public class TowerOfHanoi{
    static int moves=0;

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n=sc.nextInt();
        sc.close();

        System.out.println("\nMoves to solve Tower of Hanoi for "+n+" disks:");
        hanoi(n,'A','B','C'); 

        System.out.println("\nTotal moves: "+moves);
    }
    public static void hanoi(int n,char from,char aux,char to){
        if(n==0) return;
        hanoi(n-1, from, to, aux);
        System.out.println("Move disk "+n+" from "+from+" to "+to);
        moves++;
        hanoi(n-1, aux, from, to);
    }
}
