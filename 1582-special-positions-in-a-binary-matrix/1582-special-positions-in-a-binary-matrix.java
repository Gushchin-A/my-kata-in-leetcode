class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    if (isSpecialDfsRight(mat, i, j + 1) && isSpecialDfsLeft(mat, i, j - 1)) {
                        if (isSpecialDfsDown(mat, i + 1, j) && isSpecialDfsUp(mat, i - 1, j)) {
                            result++;
                        }
                    }
                }
            }
        }

        return result; 
    }

    private boolean isSpecialDfsRight(int[][] mat, int i, int j) {
        if (j >= mat[i].length) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        }

        if (isSpecialDfsRight(mat, i, j + 1)) {
            return true;
        }

        return false;
    }

        private boolean isSpecialDfsLeft(int[][] mat, int i, int j) {
        if (j < 0) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        }

        if (isSpecialDfsLeft(mat, i, j - 1)) {
            return true;
        }

        return false;
    }

    private boolean isSpecialDfsDown(int[][] mat, int i, int j) {
        if (i >= mat.length) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        }

        if (isSpecialDfsDown(mat, i + 1, j)) {
            return true;
        }

        return false;
    }
    
    private boolean isSpecialDfsUp(int[][] mat, int i, int j) {
        if (i < 0) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        }

        if (isSpecialDfsUp(mat, i - 1, j)) {
            return true;
        }

        return false;
    }
}
