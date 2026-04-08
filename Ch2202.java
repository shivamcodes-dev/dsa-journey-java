public class Ch2202 {


    public static void nQueens(char [][]board, int row){

        if (row == board.length) {
            printNQsol(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row+1);
             board[row][j] = '.';
        }
    }
    

    public static void printNQsol(char[][] board){
        System.out.println("-------------------Chess board------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char [][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board [i][j] = '.';
            }
        }


        nQueens(board, 0);
        
     }
    
}
