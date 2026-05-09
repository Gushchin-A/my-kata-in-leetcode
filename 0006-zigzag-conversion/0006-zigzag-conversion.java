class Solution {
    public String convert(String s, int numRows) {
        char[][] matrix = buildMatrix(s, numRows);
        return checkCharInMatrixAndBuildString(matrix);
    }

    private String checkCharInMatrixAndBuildString(char[][] matrix) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != '\0') {
                    str.append(matrix[i][j]);
                }
            }
        }

        return str.toString();
    }

    private char[][] buildMatrix(String s, int numRows) {
        if (numRows == 1) {
            char[][] matrix = new char[1][s.length()];

            for (int i = 0; i < s.length(); i++) {
                matrix[0][i] = s.charAt(i);
            }

            return matrix;
        }

        char[][] matrix = new char[numRows][s.length()];

        int row = 0;
        int col = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            matrix[row][col] = currentChar;

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        return matrix;
    }
}