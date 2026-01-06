class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int[] flatten = toFlattenArray(indices);

        int r = 0;
        int c = 1;
        while (r < flatten.length) {

            for (int i = 0; i < n; i++) {
                int row = flatten[r];
                matrix[row][i] += 1;
            }

            for (int j = 0; j < m; j++) {
                int col = flatten[c];
                matrix[j][col] += 1;
            }

            r += 2;
            c += 2;
        }

        return countOddInArray(matrix);
    }

    public int[] toFlattenArray(int[][] matrix) {
        int[] flatten = new int[matrix.length * matrix[0].length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                flatten[index++] = matrix[i][j];
            }
        }

        return flatten;
    }

    public int countOddInArray(int[][] matrix) {
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