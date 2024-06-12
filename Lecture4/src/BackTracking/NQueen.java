package BackTracking;

public class NQueen {
    public static void placeNQueen(int n) {
        int board[][] = new int[n][n];
        if (placeQueen(board, 0, n)) {
            printBoard(board, n);
        } else {
            System.out.println("No solution exists");
        }
    }

    private static boolean placeQueen(int[][] board, int row, int n) {
        if (row == n) {
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isBoardSafe(board, row, col)) {
                board[row][col] = 1;
                if (placeQueen(board, row + 1, n)) {
                    return true;
                }
                board[row][col] = 0; // backtrack
            }
        }
        return false;
    }

    private static boolean isBoardSafe(int[][] board, int row, int col) {
        int i, j;
        int n = board.length;

        // Check this column on the upper side
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // size of the board
        placeNQueen(n);
    }
}
