class Solution {
public static int numRookCaptures(char[][] board) {
        int[][] rookPosition = findFirstIndexFigureChess(board, 'R');
        int canHorizontally = rookAndQueenCanAttackHorizontally(board, rookPosition);
        int canVertically = rookAndQueenCanAttackVertically(board, rookPosition);

        return canHorizontally + canVertically;
    }

    public static int[][] findFirstIndexFigureChess(char[][] board, char ch) {
        int[][] result = new int[1][2];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ch) {
                    result[0][0] = i;
                    result[0][1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int rookAndQueenCanAttackHorizontally(char[][] board, int[][] index) {
        int row = index[0][0];
        int column = index[0][1];

        int maxAttacking = 0;

        while (column < board[row].length) {
            if (board[row][column] == 'B') {
                break;
            } else if (board[row][column] == 'p') {
                maxAttacking++;
                break;
            } else {
                column++;
            }
        }

        column = index[0][1];;
        while (column >= 0) {
            if (board[row][column] == 'B') {
                break;
            } else if (board[row][column] == 'p') {
                maxAttacking++;
                break;
            } else {
                column--;
            }
        }

        return maxAttacking;
    }

    public static int rookAndQueenCanAttackVertically(char[][] board, int[][] index) {
        int row = index[0][0];
        int column = index[0][1];

        int maxAttacking = 0;

        while (row < board.length) {
            if (board[row][column] == 'B') {
                break;
            } else if (board[row][column]== 'p') {
                maxAttacking++;
                break;
            } else {
                row++;
            }
        }

        row = index[0][0];
        while (row >= 0) {
            if (board[row][column] == 'B') {
                break;
            } else if (board[row][column] == 'p') {
                maxAttacking++;
                break;
            } else {
                row--;
            }
        }

        return maxAttacking;
    }
}
