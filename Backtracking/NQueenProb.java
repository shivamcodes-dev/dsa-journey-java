package Backtracking;

public class NQueenProb {

    static int count = 0;

    public static void nQueen(char[][] bord, int row) {
        if (row == bord.length) {
            printbord(bord);
            count++;
            return;
        }

        for (int j = 0; j < bord.length; j++) {
            if (isSafe(bord, row, j)) {
                bord[row][j] = 'Q';
                nQueen(bord, row + 1);
                bord[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char[][] bord, int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (bord[i][col] == 'Q') {
                return false;
            }
        }

        // daigonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (bord[i][j] == 'Q') {
                return false;
            }
        }

        // daigonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < bord.length; i--, j++) {
            if (bord[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printbord(char[][] bord) {
        System.out.println("------------------- Chess Bord ---------------------");
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[0].length; j++) {
                System.out.print(bord[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        char bord[][] = new char[n][n];

        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[0].length; j++) {
                bord[i][j] = 'X';
            }
        }

        nQueen(bord, 0);
        System.out.println("Total ways to solve this problem = " + count);
    }
}
