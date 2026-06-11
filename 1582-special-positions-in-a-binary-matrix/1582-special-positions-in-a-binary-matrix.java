class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    if (isSpecialHorizontal(mat, i, j) && isSpecialVertical(mat, i, j)) {
                        result++;
                    }
                }
            }
        }

        return result; 
    }

    private boolean isSpecialHorizontal(int[][] mat, int i, int j) {
        for (int x = j + 1; x < mat[i].length; x++) {
            if (mat[i][x] == 1) {
                return false;
            }
        }

        for (int x = j - 1; x >= 0; x--) {
            if (mat[i][x] == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean isSpecialVertical(int[][] mat, int i, int j) {
        for (int y = i + 1; y < mat.length; y++) {
            if (mat[y][j] == 1) {
                return false;
            }
        }

        for (int y = i - 1; y >= 0; y--) {
            if (mat[y][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
