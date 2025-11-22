public class NQueens {
    public static boolean issafe(char board[][], int row, int col){

        //Vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q' ){
                return false;
            }
        }


        //Diagonal Left Up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Diagonal Right Up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }
    static int count=0;
    public static void /*boolean*/ nqueens(char board[][], int row){

        if(row == board.length){
            count++;
            printboard(board);
            return;
            
        }

        for(int j=0; j<board.length; j++){
            if(issafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                // if(nqueens(board, row+1)){
                //     return true
                // }
                board[row][j] = 'X';
            }
        }
        
        //return false;
    }

    public static void printboard(char board[][]){

        System.out.println("----------Chess Board -----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    public static void main(String args[]){
        
        int n = 4;
        char board[][] = new char[n][n];

        //Initialize 
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }

        nqueens(board,0);
        // if(nqueens(board,0)){
        //     System.out.println("Solution Possible !");
        //     printboard(board);
        // }else{
        //     System.out.println("Solution not possible !");
        // }
        System.out.println();
        System.out.println("Total Possible Board = " + count);
    }
}
