class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) {
            return mat;
        }

        int[] flatten = matrixToFlatten(mat);

        int index = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = flatten[index++];
            }
        }

        return result;
    }

    public int[] matrixToFlatten(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] result = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index++] = mat[i][j];
            }
        }

        return result;
    }
}