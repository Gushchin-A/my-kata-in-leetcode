class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = 0;
                    if (isSpecialDfsHorizontal(mat, i, j) && isSpecialDfsHVertical(mat, i, j)) {
                        result++;
                    }
                    mat[i][j] = 1;
                }
            }
        }

        return result; 
    }

    private boolean isSpecialDfsHorizontal(int[][] mat, int i, int j) {
        if (j >= mat[i].length || j < 0 || mat[i][j] == -1) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        } else {
            mat[i][j] = -1;
        }

        boolean isRightOk = isSpecialDfsHorizontal(mat, i, j + 1);
        mat[i][j] = 0;
        boolean isLeftOk = isSpecialDfsHorizontal(mat, i, j - 1);

        if (isRightOk && isLeftOk) {
            return true;
        }

        return false;
    }

    private boolean isSpecialDfsHVertical(int[][] mat, int i, int j) {
        if (i >= mat.length || i < 0 || mat[i][j] == -1) {
            return true;
        }

        if (mat[i][j] == 1) {
            return false;
        } else {
            mat[i][j] = -1;
        }

        boolean isDownOk = isSpecialDfsHVertical(mat, i + 1, j);
        mat[i][j] = 0;
        boolean isUpOk = isSpecialDfsHVertical(mat, i - 1, j);

        if (isDownOk && isUpOk) {
            return true;
        }

        return false;
    }
}
