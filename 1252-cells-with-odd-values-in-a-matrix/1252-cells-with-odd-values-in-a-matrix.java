class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        int r = 0;
        int c = 0;
        while (r < indices.length) {

            for (int i = 0; i < n; i++) {
                int row = indices[r][c];
                matrix[row][i] += 1;
            }

            for (int j = 0; j < m; j++) {
                int col = indices[r][c + 1];
                matrix[j][col] += 1;
            }

            r++;
        }

        return countOddInArray(matrix);
    }
    
    public static int countOddInArray(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    result++;
                }
            }
        }

        return result;
    }
}