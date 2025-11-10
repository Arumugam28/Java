import java.util.Scanner;

public class MidlevelTask2{
    static char board[][]={
        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '}
    };

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char currentPlayer='X';
        int moves=0;
        boolean gameOver=false;

        while(!gameOver){
            printBoard();
            System.out.println("Player "+currentPlayer+", enter row and column (0,1,2):");
            int row=sc.nextInt();
            int col=sc.nextInt();

            if(row<0||row>2||col<0||col>2||board[row][col]!=' '){
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col]=currentPlayer;
            moves++;

            if(checkWin(currentPlayer)){
                printBoard();
                System.out.println("Player "+currentPlayer+" wins!");
                gameOver=true;
            }else if(moves==9){
                printBoard();
                System.out.println("It's a tie!");
                gameOver=true;
            }else{
                currentPlayer=(currentPlayer=='X')?'O':'X';
            }
        }
        sc.close();
    }

    static void printBoard(){
        System.out.println("-------------");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static boolean checkWin(char player){
        for(int i=0;i<3;i++){
            if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player)
                return true;
            if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player)
                return true;
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
            return true;
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player)
            return true;

        return false;
    }
}
