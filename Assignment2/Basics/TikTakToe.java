import java.util.Arrays;
import java.util.Scanner;

public class TikTakToe {

    public void outbox(String[] arr){
         for(int i=0;i<arr.length;i++){
            String val = (arr[i]==null) ? "-" : arr[i];
            System.out.print(val+"  ");
            if((i+1)%3==0){
                System.out.println();
            }
        }
    }
    public boolean isWinner(String b[],String p){
        if(p.equals(b[0]) && p.equals(b[1]) && p.equals(b[2])) return true;
        if(p.equals(b[3]) && p.equals(b[4]) && p.equals(b[5])) return true;
        if(p.equals(b[6]) && p.equals(b[7]) && p.equals(b[8])) return true;
        if(p.equals(b[0]) && p.equals(b[3]) && p.equals(b[6])) return true;
        if(p.equals(b[1]) && p.equals(b[4]) && p.equals(b[7])) return true;
        if(p.equals(b[2]) && p.equals(b[5]) && p.equals(b[8])) return true;
        if(p.equals(b[0]) && p.equals(b[4]) && p.equals(b[8])) return true;
        if(p.equals(b[2]) && p.equals(b[4]) && p.equals(b[6])) return true;

        return false;


        
    }
    public boolean isFull(String[] b){
        for(int i=0;i<b.length;i++){
            if(b[i]==null) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] box={0,1,2,3,4,5,6,7,8};
        String[] outbox=new String[9];
        Scanner sc=new Scanner(System.in);
        TikTakToe g=new TikTakToe();

        System.out.println("Initial board positions:");
        System.out.println(Arrays.toString(box));
        g.outbox(outbox);

        int times = 1;
        while(times<=9){

            System.out.println("\nEnter X position (0-8): ");
            int inputx=sc.nextInt();

            if(inputx<0 || inputx>8){
                System.out.println("Invalid Input!");
                continue;
            }
            if(outbox[inputx]!=null){
                System.out.println("Already entered! Try another.");
                continue;
            }

            outbox[inputx]="X";
            times+=1;
            g.outbox(outbox);
            if(g.isWinner(outbox, "X")){
                System.out.println("Player X wins! Congratulations!");
                break; 
            }
            if(g.isFull(outbox)){
                System.out.println("It's a tie!");
                break;
            }

            if(times>9) break;

            System.out.println("\nEnter O position (0-8): ");
            int inputO=sc.nextInt();
            sc.close();

            if(inputO<0 || inputO>8){
                System.out.println("Invalid Input!");
                continue;
            }
            if(outbox[inputO]!=null){
                System.out.println("Already entered! Try another.");
                continue;
            }

            outbox[inputO]="O";
            times+=1;
            g.outbox(outbox);
                        outbox[inputO] = "O";
            g.outbox(outbox);

            if(g.isWinner(outbox, "O")){
                System.out.println("Player O wins! Congratulations!");
                break;
            }
            if(g.isFull(outbox)){
                System.out.println("It's a tie!");
                break;
            }


        }
    }
}